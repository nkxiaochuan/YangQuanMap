/****************************************************************************
 * DESC       ：公用工具类
 * Author     : PICC承保车险改造项目组
 * CREATEDATE ：2009-09-19
 * MODIFYLIST ：Name       Date            Reason/Contents
 *          ------------------------------------------------------
 ****************************************************************************/

package ins.domain.util;

//import com.sinosoft.prpall.schema.model.PrpQitemKind;
//import com.sinosoft.prpall.schema.model.PrpQmain;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.utility.string.*;

import ins.framework.common.ServiceFactory;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
 * 通用工具类
 */
public class PubTools {



    /**
     * @desc 获取给定险种的短期系数（月短期费率）
     * @desc 是业务系统UICommon.js中的短期费率计算的java实现
     * @param String strRiskCode 险种
     * @param Date startDate 时间段的起始日期
     * @param int intStartHour 时间段起始小时数
     * @param Date endDate 时间段的终止日期
     * @param int intEndHour 时间段的终止小时数
     * @return Double dblShortRate短期系数
     */
    public static double getMonthShortRate(String strRiskCode, Date startDate, int intStartHour, Date endDate, int intEndHour)
     {
        ChgData chgData = new ChgData();
        double dblShortRate = 0d;
        int intMonth = 0;

        intMonth = getMonthMinus(startDate, intStartHour, endDate, intEndHour);
        if (startDate == endDate && intStartHour < intEndHour) {
            intMonth++;
        }
        dblShortRate = (double)intMonth / 12 * 100;
        return dblShortRate;
    }


    /**
     * @desc 根据起始和终止日期计算年份差
     * @param Date startDate 时间段的起始日期
     * @param int intStartHour 时间段起始小时数
     * @param Date endDate 时间段的终止日期
     * @param int intEndHour 时间段的终止小时数
     * @return int intYear 年份数
     */
    public static int getYearMinus(Date startDate, int intStartHour, Date endDate, int intEndHour)
     {
        int intYear = 0;
        int intMonth = 0;
        intMonth = getMonthMinus(startDate, intStartHour, endDate, intEndHour);
        intYear = intMonth / 12;
        intMonth = intMonth % 12;
        if (intMonth != 0)
            intYear++;
        return intYear;
    }

    /**
     * @desc 根据起始和终止日期计算月份差
     * @desc 是业务系统UICommon.js中的短期费率计算的java实现（脚本中没有判断小时数）
     * @param Date startDate 时间段的起始日期
     * @param int intStartHour 时间段起始小时数
     * @param Date endDate 时间段的终止日期
     * @param int intEndHour 时间段的终止小时数
     * @return int intMonth 月份数
     */
    public static int getMonthMinus(Date startDate, int intStartHour, Date endDate, int intEndHour)
      {
        int intMonth = 0;
        intMonth = (endDate.get(Date.YEAR) - startDate.get(Date.YEAR)) * 12
                 + endDate.get(Date.MONTH) - startDate.get(Date.MONTH);
        if (endDate.get(Date.DATE) - startDate.get(Date.DATE) > 0 ||
            endDate.get(Date.DATE) == startDate.get(Date.DATE) &&
            intEndHour > intStartHour) {
            intMonth++;
        }
        return intMonth;
    }
    
    public static int getMonthMinus(java.util.Date startDate, int intStartHour,
    		java.util.Date endDate, int intEndHour, boolean roundUp) {
		if (roundUp) {
			return getMonthMinus(new Date(PubTools.formatDate(startDate)),
					intStartHour, new Date(PubTools.formatDate(endDate)),
					intEndHour);
		}
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		endCalendar.setTime(endDate);
		
		int intMonth = 0;

		if (intStartHour == 24) {
			startCalendar.add(Calendar.DATE, 1);
			startDate = startCalendar.getTime();
		}
		if (intEndHour == 24) {
			endCalendar.add(Calendar.DATE, 1);
			endDate = endCalendar.getTime();
			System.out.println(endCalendar.getTime());
		}
		intMonth = (endDate.getYear() - startDate.getYear()) * 12
				+ endDate.getMonth() - startDate.getMonth();
		int dayMinus = endDate.getDay() - startDate.getDay();
		if (dayMinus < 0) {
			intMonth--;
		} else if (dayMinus > 0) {
			intMonth++;
		}
		return intMonth;
	}

    
    public static int getNewMonthMinus(Date startDate, int intStartHour, Date endDate, int intEndHour)
    throws Exception {
        int intMonth = 0;
        intMonth = (endDate.get(Date.YEAR) - startDate.get(Date.YEAR)) * 12
                 + endDate.get(Date.MONTH) - startDate.get(Date.MONTH);
        return intMonth;
    }
    /**
     * @desc 根据起始和终止日期计算天数差
     * @desc 是业务系统UICommon.js中的短期费率计算的java实现（脚本中没有判断小时数）
     * @param Date startDate 时间段的起始日期
     * @param int intStartHour 时间段起始小时数
     * @param Date endDate 时间段的终止日期
     * @param int intEndHour 时间段的终止小时数
     * @return int intDay 天数
     */
    public static int getDayMinus(Date startDate, int intStartHour, Date endDate, int intEndHour)
    throws Exception{
        int intDay = 0;
        java.util.Date startDateJava = new java.util.Date(
            startDate.get(Date.YEAR), startDate.get(Date.MONTH) - 1,
            startDate.get(Date.DATE), intStartHour, 0, 0);
        java.util.Date endDateJava = new java.util.Date(endDate.get(Date.YEAR),
            endDate.get(Date.MONTH) - 1, endDate.get(Date.DATE),
            intEndHour, 0, 0);
        intDay = (int)((endDateJava.getTime() - startDateJava.getTime()) / 86400000l);
        return intDay;
    }

    /**
     * @desc 比较日期是否相等
     * @param String strFirstDate 比较的第一个日期 格式为yyyy-MM-DD或者yyyy/MM/DD
     * @param String strSecondDate 比较的第二个日期 格式为yyyy-MM-DD或者yyyy/MM/DD
     * @return int intReturn 1 （First）大于（second）、0 相等、-1 （First）小于（second）
     */
    public static int compareDate(String strFirstDate, String strSecondDate)
    throws Exception {
        java.util.Date firstDate = null;
        java.util.Date secondDate = null;
        int intReturn = 0;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Str.replace(strFirstDate, "/", "-"); //将“/”的分隔符替换为“-”
            Str.replace(strSecondDate, "/", "-");
            firstDate = format.parse(strFirstDate);
            secondDate = format.parse(strSecondDate);
            if (firstDate.after(secondDate)) {
                intReturn = 1;
            } else if (firstDate.before(secondDate)) {
                intReturn = -1;
            } else if (firstDate.equals(secondDate)) {
                intReturn = 0;
            }
            return intReturn;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * @desc 比较日期是否相等
     * @param String strFirstDate 比较的第一个日期 格式为yyyy-MM-DD或者yyyy/MM/DD
     * @param String strSecondDate 比较的第二个日期 格式为yyyy-MM-DD或者yyyy/MM/DD
     * @return int intReturn 1 （First）大于（second）、0 相等、-1 （First）小于（second）
     */
    public static int compareTime(String strFirstDate, String strSecondDate)
    throws Exception {
        java.util.Date firstDate = null;
        java.util.Date secondDate = null;
        int intReturn = 0;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Str.replace(strFirstDate, "/", "-"); //将“/”的分隔符替换为“-”
            Str.replace(strSecondDate, "/", "-");
            firstDate = format.parse(strFirstDate);
            secondDate = format.parse(strSecondDate);
            if (firstDate.after(secondDate)) {
                intReturn = 1;
            } else if (firstDate.before(secondDate)) {
                intReturn = -1;
            } else if (firstDate.equals(secondDate)) {
                intReturn = 0;
            }
            return intReturn;
        } catch (Exception e) {
            throw e;
        }
    }
    /* modify by xiaojian 20050824 end */
/*
    /**
     * @desc 获得距给定日期最近一天的两种币别的兑换率 LIJIBIN 2004-02-24
     * @param iBaseCurrency
     *            基准币别
     * @param iExchCurrency
     *            兑换币别
     * @param iExchDate
     *            兑换日期 标准的年月日格式
     * @return 兑换率
     * modify by xuning gpic 20081023 以人民币为基准。
     */
   /* public static double getExchangeRate(DbPool dbpool, String iBaseCurrency,
            String iExchCurrency, String iExchDate) throws UserException,
            Exception {
        double dblExchangeRate = 0d;
        double dblExchangeRate1 = 0d;
        double dblExchangeRate2 = 0d;
        ChgDate chgDate = new ChgDate();
        iExchDate = chgDate.toFormat(iExchDate);
        iBaseCurrency = iBaseCurrency.trim();
        iExchCurrency = iExchCurrency.trim();
        if (iBaseCurrency.equals(iExchCurrency)) {
            dblExchangeRate = 1;
            return dblExchangeRate;
        }
        if (iExchDate == null || iExchDate.length() == 0) {
            return dblExchangeRate;
        } else {
            iExchDate = iExchDate.substring(0, 10);
        }
        //获取同一天基准币别和兑换币别的直接兑换率
        dblExchangeRate = getStraightExchangeRate(dbpool, iBaseCurrency,
                iExchCurrency, iExchDate);
        if (dblExchangeRate != 0) {
            return dblExchangeRate;
        }

        //获取同一天兑换币别和基准币别的直接兑换率
        dblExchangeRate = getStraightExchangeRate(dbpool, iExchCurrency,
                iBaseCurrency, iExchDate);
        if (dblExchangeRate != 0) {
            dblExchangeRate = 1 / dblExchangeRate;
            return dblExchangeRate;
        }

        dblExchangeRate1 = getStraightExchangeRate(dbpool, iBaseCurrency,
                "CNY", iExchDate);
        if (dblExchangeRate1 != 0) {
            //存在基准币别和USD的兑换率
            dblExchangeRate2 = getStraightExchangeRate(dbpool, iExchCurrency,
                    "CNY", iExchDate);
            if (dblExchangeRate2 != 0) {
                //存在兑换币别和USD的兑换率
                dblExchangeRate = dblExchangeRate1 / dblExchangeRate2;
                return dblExchangeRate;
            } else {
                dblExchangeRate2 = getStraightExchangeRate(dbpool, "CNY",
                        iExchCurrency, iExchDate);
                if (dblExchangeRate2 != 0) {
                    //存在USD和兑换币别的兑换率
                    dblExchangeRate = dblExchangeRate1 * dblExchangeRate2;
                    return dblExchangeRate;
                }
            }
        }

        dblExchangeRate1 = getStraightExchangeRate(dbpool, "CNY",
                iBaseCurrency, iExchDate);
        if (dblExchangeRate1 != 0) {
            //存在USD和基准币别的兑换率
            dblExchangeRate2 = getStraightExchangeRate(dbpool, iExchCurrency,
                    "CNY", iExchDate);
            if (dblExchangeRate2 != 0) {
                //存在兑换币别和USD的兑换率
                dblExchangeRate = dblExchangeRate2 * dblExchangeRate1;
                return dblExchangeRate;
            } else {
                dblExchangeRate2 = getStraightExchangeRate(dbpool, "CNY",
                        iExchCurrency, iExchDate);
                if (dblExchangeRate2 != 0) {
                    //存在USD和兑换币别的兑换率
                    dblExchangeRate = dblExchangeRate2 / dblExchangeRate1;
                    return dblExchangeRate;
                }
            }
        }

        return dblExchangeRate;
    }

    private static double getStraightExchangeRate(DbPool dbpool,
            String iBaseCurrency, String iExchCurrency, String iExchDate)
            throws UserException, Exception {
        double dblExchangeRate = 0d;
        String strWherePart = "";
        String strExchDate = "";
        int intCount = 0;
        ChgDate chgDate = new ChgDate();
        iExchDate = chgDate.toFormat(iExchDate);
        DBPrpDexch dbPrpDexch = new DBPrpDexch();
        ChgData chgData = new ChgData();
        strWherePart = " BaseCurrency = '" + iBaseCurrency.trim() + "'"
                + " AND ExchCurrency = '" + iExchCurrency.trim() + "'"
                + " AND ExchDate <= '" + iExchDate.trim() + "'"
                + " AND ExchRate IS NOT NULL ";
        intCount = dbPrpDexch.getCount(dbpool, strWherePart);
        if (intCount == 0) {
            dblExchangeRate = 0;
            return dblExchangeRate;
        }

        strExchDate = dbPrpDexch.getMaxExchangeDate(dbpool, strWherePart);
        intCount = dbPrpDexch.getInfo(dbpool, strExchDate, iBaseCurrency,
                iExchCurrency);
        if (intCount != 0) {
            dblExchangeRate = 0;
            return dblExchangeRate;
        }
        dblExchangeRate = Double.parseDouble(chgData.chgStrZero(dbPrpDexch
                .getExchRate()));
        return dblExchangeRate;
    }

    public static void main(String[] args) {

    }

    /**
     * 获取上个月度的年月份
     *
     * @param iStrYearMonth
     * @return
     */
    public String GeneratePreYearMonth(String iStrYearMonth) {
        int intYear = Integer.parseInt(iStrYearMonth.substring(0, 4));
        int intMonth = Integer.parseInt(iStrYearMonth.substring(4, 6));
        String strMonth = "";
        intMonth = intMonth - 1;

        if (intMonth == 0) {
            intMonth = 12;
            intYear = intYear - 1;
        }
        strMonth = "" + intMonth;
        if (intMonth < 10)
            strMonth = "0" + intMonth;
        String strPreYearMonth = intYear + strMonth;
        return strPreYearMonth;
    }

    /* add by liuning begin 20040705 */
    /**
     * 根据起始和终止日期计算天数差，公共休息日不计
     *
     * @param iStartDate
     *            起始日期
     * @param iStartHour
     *            起始小时
     * @param iEndDate
     *            终止日期
     * @param iEndHour
     *            终止小时
     * @param iOption
     *            待扩展
     * @return 天数差
     */

    public static int getDayMinus(Date iStartDate, int iStartHour,
            Date iEndDate, int iEndHour, int iOption) throws Exception {
        int intDay = 0;
        int intRest = 0; //记录区间段中休息日的天数
        ChgDate chgDate = new ChgDate();
        String strYear = "0";
        String strMonth = "0";
        String strDate = "0";
        int intMonth = 0;
        int intDate = 0;
        int intWeek = 0;

        try {

            String strStartDate = iStartDate.getString(Date.YEAR + Date.MONTH
                    + Date.DATE);
            strStartDate = chgDate.toFormat(strStartDate);
            String strEndDate = iEndDate.getString(Date.YEAR + Date.MONTH
                    + Date.DATE);
            strEndDate = chgDate.toFormat(strEndDate);
            if (compareDate(strStartDate, strEndDate) >= 0) //报案日期和录入日期为同一天,同时排除报案日期比录入日期晚的异常
            {
                //return intDay;
                return 1; //jsp中用0时到24时所以算1天
            } else {

                java.util.Date startDate = new java.util.Date(iStartDate
                        .get(Date.YEAR), iStartDate.get(Date.MONTH) - 1,
                        iStartDate.get(Date.DATE), iStartHour, 0, 0);
                java.util.Date endDate = new java.util.Date(iEndDate
                        .get(Date.YEAR), iEndDate.get(Date.MONTH) - 1, iEndDate
                        .get(Date.DATE), iEndHour, 0, 0);
                intDay = (int) ((endDate.getTime() - startDate.getTime()) / 86400000l);
                intRest = 0;
                while (compareDate(strStartDate, strEndDate) <= 0) {
                    //累计有多少休息日
                    strStartDate = chgDate.toFormat(strStartDate); //格式化成yyyy-MM-dd的形式
                    strYear = strStartDate.substring(0, 4);
                    strMonth = strStartDate.substring(5, 7);
                    strDate = strStartDate.substring(8);
                    java.util.Calendar cal = java.util.Calendar.getInstance();
                    cal.set(Integer.parseInt(strYear), Integer
                            .parseInt(strMonth) - 1, Integer.parseInt(strDate)); //1月份对应的是值0，星期日对应的是值1
                    intMonth = cal.get(cal.MONTH);
                    intDate = cal.get(cal.DATE);
                    intWeek = cal.get(cal.DAY_OF_WEEK);
                    if (intWeek == 1
                            || intWeek == 7
                            || ((intMonth == 4 || intMonth == 9)
                                    && intDate >= 1 && intDate <= 7)
                            || (intMonth == 0 && intDate == 1)) {
                        intRest++;
                    }
                    //取下一天
                    com.sinosoft.utility.string.Date currentDay = new com.sinosoft.utility.string.Date(
                            strStartDate);
                    currentDay
                            .set(
                                    com.sinosoft.utility.string.Date.DATE,
                                    currentDay
                                            .get(com.sinosoft.utility.string.Date.DATE) + 1);
                    strStartDate = currentDay.getString(Date.YEAR + Date.MONTH
                            + Date.DATE);
                }
                intDay -= intRest; //休息日不计
                if (intDay < 0) {
                    intDay = 0;
                }
                return intDay;

            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* add by liuning end 20040705 */

    //得到下n个月
    public static String getNextMonthFullDate(String strDate, int intCount) {
        String strReturn;
        int intYear = 0;
        int intMonth = 0;
        int intDate = 0;
        int month = 0;
        Date tempDate = new Date(strDate);
        month = tempDate.get(Date.MONTH) + intCount;
        intYear = month / 12;
        intMonth = month % 12;
        intYear = intYear + tempDate.get(Date.YEAR);
        intDate = tempDate.get(Date.DATE);
        tempDate = new Date(intYear, intMonth, intDate);
        tempDate.set(Date.DATE, tempDate.get(Date.DATE) - 1);
        strReturn = tempDate.getString(Date.YEAR + Date.MONTH + Date.DATE);
        strReturn = Str.replace(strReturn, "/", "-");
        return strReturn;
    }
    
    //得到上n个月
    public static String getLastMonthFullDate(String strDate, int intCount) {
        String strReturn;
        int intYear = 0;
        int intMonth = 0;
        int intDate = 0;
        int month = 0;
        Date tempDate = new Date(strDate);
        month = tempDate.get(Date.MONTH) + intCount;
        intYear = month / 12;
        intMonth = month % 12;
        intYear = intYear + tempDate.get(Date.YEAR);
        intDate = tempDate.get(Date.DATE);
        tempDate = new Date(intYear, intMonth, intDate);
        tempDate.set(Date.DATE, tempDate.get(Date.DATE) + 1);
        strReturn = tempDate.getString(Date.YEAR + Date.MONTH + Date.DATE);
        strReturn = Str.replace(strReturn, "/", "-");
        return strReturn;
    }

    /**
     * 计算两个日期之间的天数差
     *
     * @param iStartDate
     *            起始日期
     * @param iStartHour
     *            起始小时
     * @param iEndDate
     *            终止日期
     * @param iEndHour
     *            终止小时
     * @return 短期费率
     */
 /*  public static int getDiffDay(Date iStartDate, int iStartHour,
            Date iEndDate, int iEndHour) {
        java.util.Date startDate = new java.util.Date(
                iStartDate.get(Date.YEAR), iStartDate.get(Date.MONTH) - 1,
                iStartDate.get(Date.DATE), 0, 0, 0);
        java.util.Date endDate = new java.util.Date(iEndDate.get(Date.YEAR),
                iEndDate.get(Date.MONTH) - 1, iEndDate.get(Date.DATE), 0, 0, 0);
        int intDiffDay = (int) ((endDate.getTime() - startDate.getTime()) / 86400000l) + 1;

        if (iEndHour <= iStartHour) {
            if (iStartHour == 24 && iEndHour == 0)
                intDiffDay = intDiffDay - 2;
            else
                intDiffDay = intDiffDay - 1;
        }
        return intDiffDay;
    }

    /**
     * 翻译免赔条件
     *
     * @param strDeductCond
     *            免赔条件
     * @return 中文免赔条件
     */
 /*   public static String getDeductCondCName(String strDeductCond) {
        String strDeductCondCName = "";
        String[] arrStrDeductCondCName = new String[10];
        boolean isDeductCond = false;

        arrStrDeductCondCName[0] = "单方肇事事故";
        arrStrDeductCondCName[1] = "无法找到第三方";
        arrStrDeductCondCName[2] = "违反安全装载规定";
        arrStrDeductCondCName[3] = "因违反安全装载规定导致保险事故发生";
        arrStrDeductCondCName[4] = "非约定驾驶人员使用保险车辆发生保险事故的";
        arrStrDeductCondCName[5] = "同一保险年度内已发生赔款次数";
        arrStrDeductCondCName[6] = "缺少相关单证个数(盗抢险)";
        arrStrDeductCondCName[7] = "全车被盗抢";
        arrStrDeductCondCName[8] = "玻璃单独破碎";
        arrStrDeductCondCName[9] = "自行协商处理,不能协助保险人勘验";

        if (strDeductCond.length() == 10) {
            for (int i = 0; i < strDeductCond.length(); i++) {
                if (!strDeductCond.substring(i, i + 1).equals("0")) {
                    isDeductCond = true;
                    strDeductCondCName += arrStrDeductCondCName[i];
                    if (i == 5) {
                        strDeductCondCName += "("
                                + strDeductCond.substring(i, i + 1) + "次)";
                    }
                    if (i == 6) {
                        strDeductCondCName += "("
                                + strDeductCond.substring(i, i + 1) + "个)";
                    }
                    strDeductCondCName += ";";
                }
            }
            if (!isDeductCond) {
                strDeductCondCName = "无";
            }
        } else {
            strDeductCondCName = "免赔条件有误！！";
        }
        return strDeductCondCName;
    }

    /**
     * 获得当天数个月前的月份 @author zhangshengli
     * @param strDate
     * @param StatisWay
     * @param intCount
     * @return
     */
    public String getPreYearMonth(String strDate, String StatisWay, int intCount) {
        String strReturn = "";
        int intYear = 0;
        int intMonth = 0;
        int intDate = 0;
        int inSemester = 0;
        int intThreeMonth = 0;
        int month = 0;
        int year = 0;
        Date tempDate = new Date(strDate);
        intMonth = tempDate.get(Date.MONTH);
        month = intMonth - intCount * Integer.parseInt(StatisWay);
        if (month <= 0) {
            year = (-month) / 12 + 1;
            intYear = tempDate.get(Date.YEAR) - 1 * year;
            intMonth = month + 12 * year;
        } else {
            intYear = tempDate.get(Date.YEAR);
            intMonth = month;
        }
        //月
        if (StatisWay.equals("1")) {
            if (intMonth < 10)
                strReturn = Integer.toString(intYear) + "0"
                        + Integer.toString(intMonth);
            else
                strReturn = Integer.toString(intYear)
                        + Integer.toString(intMonth);
        }
        //季
        if (StatisWay.equals("3")) {
            if (intMonth == 1 || intMonth == 2 || intMonth == 3) {
                intThreeMonth = 1;
            } else if (intMonth == 4 || intMonth == 5 || intMonth == 6) {
                intThreeMonth = 2;
            } else if (intMonth == 7 || intMonth == 8 || intMonth == 9) {
                intThreeMonth = 3;
            } else if (intMonth == 10 || intMonth == 11 || intMonth == 12) {
                intThreeMonth = 4;
            }
            strReturn = Integer.toString(intYear) + "Q"
                    + Integer.toString(intThreeMonth);
        }
        //半年
        if (StatisWay.equals("6")) {
            if (intMonth == 1 || intMonth == 2 || intMonth == 3
                    || intMonth == 4 || intMonth == 5 || intMonth == 6) {
                strReturn = Integer.toString(intYear) + "H1";
            } else if (intMonth == 7 || intMonth == 8 || intMonth == 9
                    || intMonth == 10 || intMonth == 11 || intMonth == 12) {
                strReturn = Integer.toString(intYear) + "H2";
            }
        }
        //年
        if (StatisWay.equals("12")) {
            strReturn = Integer.toString(intYear);
        }
        return strReturn;
    }

    /**
     * 获得当天数个月前的月份的月初 @author zhangshengli
     * @param strDate
     * @param StatisWay
     * @param intCount
     * @return
     */
    public String getMonthStart(String strDate, String StatisWay, int intCount) {
        String strReturn = "";
        int intYear = 0;
        int intMonth = 0;
        int intDate = 0;
        int inSemester = 0;
        int intThreeMonth = 0;
        int month = 0;
        int year = 0;
        Date tempDate = new Date(strDate);
        intMonth = tempDate.get(Date.MONTH);
        month = intMonth - intCount * Integer.parseInt(StatisWay);
        if (month <= 0) {
            year = (-month) / 12 + 1;
            intYear = tempDate.get(Date.YEAR) - 1 * year;
            intMonth = month + 12 * year;
        } else {
            intYear = tempDate.get(Date.YEAR);
            intMonth = month;
        }
        //月
        if (StatisWay.equals("1")) {
            if (intMonth < 10)
                strReturn = Integer.toString(intYear) + "-" + "0"
                        + Integer.toString(intMonth) + "-01";
            else
                strReturn = Integer.toString(intYear) + "-"
                        + Integer.toString(intMonth) + "-01";
        }
        //季
        if (StatisWay.equals("3")) {
            if (intMonth == 1 || intMonth == 2 || intMonth == 3) {
                strReturn = Integer.toString(intYear) + "-01-01";
            } else if (intMonth == 4 || intMonth == 5 || intMonth == 6) {
                strReturn = Integer.toString(intYear) + "-04-01";
            } else if (intMonth == 7 || intMonth == 8 || intMonth == 9) {
                strReturn = Integer.toString(intYear) + "-07-01";
            } else if (intMonth == 10 || intMonth == 11 || intMonth == 12) {
                strReturn = Integer.toString(intYear) + "-10-01";
            }
        }
        //半年
        if (StatisWay.equals("6")) {
            if (intMonth == 1 || intMonth == 2 || intMonth == 3
                    || intMonth == 4 || intMonth == 5 || intMonth == 6) {
                strReturn = Integer.toString(intYear) + "-01-01";
            } else if (intMonth == 7 || intMonth == 8 || intMonth == 9
                    || intMonth == 10 || intMonth == 11 || intMonth == 12) {
                strReturn = Integer.toString(intYear) + "-07-01";
            }
        }
        //年
        if (StatisWay.equals("12")) {
            strReturn = Integer.toString(intYear) + "-01-01";
        }

        return strReturn;
    }

    /**
     * 获得当天数个月前的月末 @author zhangshengli
     * @param strDate
     * @param StatisWay
     * @param intCount
     * @return
     */
    public String getMonthEnd(String strDate, String StatisWay, int intCount) {
        String strReturn = "";
        int intYear = 0;
        int intMonth = 0;
        int intDate = 0;
        int inSemester = 0;
        int intThreeMonth = 0;
        int month = 0;
        int year = 0;
        Date tempDate = new Date(strDate);
        intMonth = tempDate.get(Date.MONTH);
        intDate = tempDate.get(Date.DATE);
        month = intMonth - intCount * Integer.parseInt(StatisWay);
        if (month <= 0) {
            year = (-month) / 12 + 1;
            intYear = tempDate.get(Date.YEAR) - 1 * year;
            intMonth = month + 12 * year;
        } else {
            intYear = tempDate.get(Date.YEAR);
            intMonth = month;
        }
        //if (intDate>=29)
        //{
        if (intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7
                || intMonth == 8 || intMonth == 10 || intMonth == 12)
            intDate = 31;
        else if (intMonth == 4 || intMonth == 6 || intMonth == 9
                || intMonth == 11)
            intDate = 30;
        else
            intDate = 28;
        //}

        //月
        if (StatisWay.equals("1")) {
            if (intMonth < 10)
                strReturn = Integer.toString(intYear) + "-" + "0"
                        + Integer.toString(intMonth) + "-"
                        + Integer.toString(intDate);
            else
                strReturn = Integer.toString(intYear) + "-"
                        + Integer.toString(intMonth) + "-"
                        + Integer.toString(intDate);
        }
        //季
        if (StatisWay.equals("3")) {
            if (intMonth == 1 || intMonth == 2 || intMonth == 3) {
                strReturn = Integer.toString(intYear) + "-03-31";
            } else if (intMonth == 4 || intMonth == 5 || intMonth == 6) {
                strReturn = Integer.toString(intYear) + "-06-30";
            } else if (intMonth == 7 || intMonth == 8 || intMonth == 9) {
                strReturn = Integer.toString(intYear) + "-09-30";
            } else if (intMonth == 10 || intMonth == 11 || intMonth == 12) {
                strReturn = Integer.toString(intYear) + "-12-31";
            }
        }
        //半年
        if (StatisWay.equals("6")) {
            if (intMonth == 1 || intMonth == 2 || intMonth == 3
                    || intMonth == 4 || intMonth == 5 || intMonth == 6) {
                strReturn = Integer.toString(intYear) + "-06-30";
            } else if (intMonth == 7 || intMonth == 8 || intMonth == 9
                    || intMonth == 10 || intMonth == 11 || intMonth == 12) {
                strReturn = Integer.toString(intYear) + "-12-31";
            }
        }
        //年
        if (StatisWay.equals("12")) {
            strReturn = Integer.toString(intYear) + "-12-31";
        }

        return strReturn;
    }

    /**
     * 获得两个YearMonth之间的月份差 @author Administrator
     * @param startYearMonth
     * @param endYearMonth
     * @param StatisWay
     * @return
     */
    public int getYearMonthMinus(String startYearMonth, String endYearMonth,
            String StatisWay) {
        int month = 0;
        int intStartYear = 0;
        int intStartMonth = 0;
        int intEndYear = 0;
        int intEndMonth = 0;
        if (StatisWay.equals("1")) {
            intStartYear = Integer.parseInt(startYearMonth.substring(0, 4));
            intStartMonth = Integer.parseInt(startYearMonth.substring(4, 6));
            intEndYear = Integer.parseInt(endYearMonth.substring(0, 4));
            intEndMonth = Integer.parseInt(endYearMonth.substring(4, 6));

            month = intEndMonth - intStartMonth + 12
                    * (intEndYear - intStartYear);
        }
        if (StatisWay.equals("3")) {
            intStartYear = Integer.parseInt(startYearMonth.substring(0, 4));
            intStartMonth = Integer.parseInt(startYearMonth.substring(5, 6));
            intEndYear = Integer.parseInt(endYearMonth.substring(0, 4));
            intEndMonth = Integer.parseInt(endYearMonth.substring(5, 6));
            month = intEndMonth - intStartMonth + 4
                    * (intEndYear - intStartYear);
        }
        if (StatisWay.equals("6")) {
            intStartYear = Integer.parseInt(startYearMonth.substring(0, 4));
            intEndYear = Integer.parseInt(endYearMonth.substring(0, 4));
            if (startYearMonth.substring(5, 6).equals(
                    endYearMonth.substring(5, 6)))
                month = 2 * (intEndYear - intStartYear);
            else
                month = 1 + 2 * (intEndYear - intStartYear);
        }
        if (StatisWay.equals("12")) {
            intStartYear = Integer.parseInt(startYearMonth.substring(0, 4));
            intEndYear = Integer.parseInt(endYearMonth.substring(0, 4));
            month = intEndYear - intStartYear;
        }
        return month;
    }

    /**
     * 根据起始和终止日期计算未到期责任准备金要用到的月份差（不足一个月不算，天数差>=28时月份加1）
     *
     * @param iStartDate   起始日期
     * @param iStartHour 起始小时
     * @param iEndDate 终止日期
     * @param iEndHour 终止小时
     * @return 月份差
     */
    public int getMonthMinusForNoDuty(Date iStartDate, int iStartHour,
            Date iEndDate, int iEndHour) throws Exception {
        int intMonth = 0;
        intMonth = (iEndDate.get(Date.YEAR) - iStartDate.get(Date.YEAR)) * 12
                + iEndDate.get(Date.MONTH) - iStartDate.get(Date.MONTH);
        if (iEndDate.get(Date.DATE) - iStartDate.get(Date.DATE) >= 28
                || iEndDate.get(Date.DATE) == iStartDate.get(Date.DATE)
                && iEndHour > iStartHour)
            intMonth++;
        return intMonth;
    }

    /**
     * @desc 计算批改保险期限保费
     * @param String strRiskCode
     * @param double dblPremiumOld
     * @param double dblShortRateOld
     * @param double dblShortRate
     * @return double dblPremiumNew
     * @author luyang
     */
    public double calculateByPeriod(String strRiskCode, double dblPremiumOld, double dblShortRateOld, double dblShortRateNew)
    throws Exception {
        double dblPremiumNew = 0;
        dblPremiumNew = dblPremiumOld * (dblShortRateNew / dblShortRateOld);
        return dblPremiumNew;
    }

    /**
     * 计算批改保险期限短期费率
     * @param newStartDate Date
     * @param newStartHour int
     * @param newEndDate Date
     * @param newEndHour int
     * @param oldStartDate Date
     * @param oldStartHour int
     * @param oldEndDate Date
     * @param oldEndHour int
     * @param shortFlag String 批改时选择的短期费率
     * @param oldShortRate double
     * @param riskCode String
     * @throws Exception
     * @return double
     * @author luyang
     */
  /*  public double calPeriodShortRate(Date newStartDate, int newStartHour,
                                     Date newEndDate, int newEndHour,
                                     Date oldStartDate, int oldStartHour,
                                     Date oldEndDate, int oldEndHour,
                                     String shortFlag, double oldShortRate,
                                     String riskCode)
    throws Exception {
        double shortRate = 0d; //返回的短期系数
        double shortRateOld2 = 0d; //原保险期限、新短期费率方式计算的短期系数
        double shortRateNew = 0d; //新保险期限、新短期费率方式计算的短期系数

        shortRateNew = this.getShortRate(riskCode,
                                         newStartDate, newStartHour,
                                         newEndDate, newEndHour,
                                         shortFlag);
        shortRateOld2 = this.getShortRate(riskCode,
                                          oldStartDate, oldStartHour,
                                          oldEndDate, oldEndHour,
                                          shortFlag);
        //短期系数=原短期系数
        //+新保险期限、新短期费率方式计算的短期系数
        //-原保险期限、新短期费率方式计算的短期系数
        shortRate = oldShortRate + shortRateNew - shortRateOld2;
        return shortRate;
    }*/
    /**
	 * 都邦项目组专用 获取保险月份差
	 * 都邦项目组  许宁  
	 * 保险月份差     
	 * @param startDate
     * @param startHour
     * @param endDate
     * @param endHour
     * @return 
	 */
   public static int insuredMonth(String startDate, String startHour,
         String endDate, String endHour) {
//       java.util.Date start = new java.util.Date(startDate);
//       java.util.Date end = new java.util.Date(endDate);
//       SimpleDateFormat simpleStart = new SimpleDateFormat("YYYY-MM-DD");
//       String strStrat = simpleStart.format(start);
//       String strEnd  =  simpleStart.format(end);
	   //
	   //
	  // 
	  // 
       String StartArray[] = startDate.split("-");
       String EndArray[] = endDate.split("-");
       //String startTime[] = startHour.split(":");
       //String endTime[] = endHour.split(":");
       
       int startYear  = 0;
       int startMonth = 0;
       int startDay   = 0;
       int startH     = 0;
       int startM     = 0;
       int startS     = 0;
       int endYear  = 0;
       int endMonth = 0;
       int endDay   = 0;
       int endH     = 0;
       int endM     = 0;
       int endS     = 0;
       
       
       
       startYear = Integer.parseInt(StartArray[0]);
       startMonth = Integer.parseInt(StartArray[1]);
       startDay = Integer.parseInt(StartArray[2]);
       startH = Integer.parseInt(startHour);
       //startM = Integer.parseInt(startTime[1]);
       //startS = Integer.parseInt(startTime[2]);

       endYear = Integer.parseInt(EndArray[0]);
       endMonth = Integer.parseInt(EndArray[1]);
       endDay = Integer.parseInt(EndArray[2]);
       endH = Integer.parseInt(endHour);
       //endM = Integer.parseInt(endTime[1]);
       //endS = Integer.parseInt(endTime[2]);
       
       int month = 0;
       int lv_Year= endYear-startYear;
       int lv_Month=endMonth-startMonth;
       int lv_Day=endDay-startDay;
       //int lv_Hour=endH-startH;
       month= lv_Month+lv_Year*12;
       
       if(startH==0)//0时起保
       {
        if(lv_Day>=0)
        {
        	month++; 
        }
       }
       else  //12时起保
       {
    	   if(lv_Day>0)
    	   {
    		   month++; 
    	   }
       }
    
       
       return month;
   
        }

    /**
     * @deprecated 根据贷款年限获取基准保费
     * @param strStartDate
     * @param strEndDate
     * @return double
     * @throws Exception
     */
    public double getLoanRate(String strStartDate,String strEndDate) throws Exception
    {
      double[] yearrates = new double[]{1.00,   //1年
              1.98,   //2年
              2.93,   //3年
              3.86,
              4.76,
              5.65,
              6.51,
              7.35,
              8.17,
              8.97,   //10年
              9.75,
              10.51,
              11.26,
              11.98,
              12.69,
              13.38,
              14.06,
              14.71,
              15.35,
              15.98,  //20年
              16.59,
              17.18,
              17.77,
              18.33,
              18.88,
              19.42,
              19.95,
              20.46,
              20.96,
              21.45};
      Date startdate = new Date(strStartDate);
      startdate.setDateDelimiter("-");
      Date enddate   = new Date(strEndDate);
      enddate.setDateDelimiter("-");
      int startMonth= startdate.get(Date.MONTH);
      int endMonth  = enddate.get(Date.MONTH);
      int startYear = startdate.get(Date.YEAR);
      int endYear   = enddate.get(Date.YEAR);
      int intLoanYear  = endYear - startYear;
      int intLoanMonth = this.getMonthMinus(startdate,0,enddate,0);
      int intModMonth  = intLoanMonth % 12;
      if (intLoanYear > 31 || intLoanYear == 30 && endMonth >startMonth)
      {
          //贷款年限不能超过30年
          return 0;
      }
      if (intModMonth == 0)
      {
        if (intLoanYear == 0)
            intLoanYear = 1;
        return yearrates[intLoanYear-1];
      }
      else
      {
        double dblModMonth = Double.parseDouble(String.valueOf(intModMonth))/12;
        if (endMonth >= startMonth)
        {
            if (intLoanYear == 0)
              return yearrates[0] * intModMonth /12;
            else
            {
              return yearrates[intLoanYear-1] * (1- dblModMonth) + yearrates[intLoanYear] * dblModMonth;
            }
        }
        else
        {
            if (intLoanYear == 0 || intLoanYear == 1)
              return yearrates[0] * dblModMonth;
            else
              return yearrates[intLoanYear-2] * (1- dblModMonth) + yearrates[intLoanYear-1] * dblModMonth;
        }
      }
    }

    /**
     * @deprecated 根据险别对应不同保险年数获取短期费率系数
     * @param oldYears
     * @param newYears
     * @param kindCode
     * @return shortRate
     * @throws Exception
     * @author luyang
     * @since 该方法并不规范，只是开发进度较紧没有生成对应的表结构服务，临时处理
     */
 /*  public double getYearShortRate(int oldYears,int newYears ,
            String kindCode)throws Exception
    {
        double shortRate = 0;
        DbPool dbpool = new DbPool();
        //打开数据库，开始事务
        dbpool.open(SysConfig.getProperty("DDCCDATASOURCE"));
        try{
            String sql = "SELECT ShortRate FROM PrpDYearShortRate WHERE "
                + " KindCode='"+ kindCode +"'"
                + " AND OriginalPeriod='"+ oldYears +"'"
                + " AND ActualPeriod='"+ newYears +"'";
            ResultSet rs = dbpool.query(sql);
            if(rs.next()){
                shortRate = rs.getDouble("ShortRate");
            }
        }
        catch(Exception exception){
            throw exception;
        }
        finally{
            dbpool.close();
        }
        return shortRate;
    }
    
    //added by LanNing begin 20070625 从itemkind表查询数据，按照险别分组求和
 /*   public static BLPrpCitemKind getItemKindGroup(String policyNo,String flag) throws Exception{
    	DbPool dbpool = new DbPool();
    	try{
    		String strDataSource = SysConfig.getProperty("DDCCDATASOURCE");
        	BLPrpCitemKind blPrpCitemKind = new BLPrpCitemKind();
        	//打开数据库，开始事务
            dbpool.open(strDataSource);
            String strFlag = "";
            if(flag.trim().toLowerCase().equals("main")){//主险
            	strFlag = "1";
            }
            if(flag.trim().toLowerCase().equals("sub")){//附加险
            	strFlag = "2";
            }
            String strSQL = "Select kindname,kindcode,currency, Sum(amount) amount,Sum(premium) premium From prpcitemkind " +
            				"Where policyno = ? And substr(flag,2,1) = ? " +
            				"Group By kindname,kindcode,currency";
            dbpool.prepareStatement(strSQL);
            dbpool.setString(1,policyNo);
            dbpool.setString(2,strFlag);
            ResultSet resultSet = dbpool.executePreparedQuery();
            while(resultSet.next()){
                PrpCitemKindSchema prpCitemKindSubSchema = new PrpCitemKindSchema();
                prpCitemKindSubSchema.setKindName(resultSet.getString("kindName"));
                prpCitemKindSubSchema.setCurrency(resultSet.getString("currency"));
                prpCitemKindSubSchema.setAmount(resultSet.getString("amount"));
                prpCitemKindSubSchema.setPremium(resultSet.getString("premium"));
                blPrpCitemKind.setArr(prpCitemKindSubSchema);
            }
            dbpool.close();
            return blPrpCitemKind;
    	}catch(Exception e){
    		e.printStackTrace();
    		dbpool.close();
            throw e;
    	}finally{
            dbpool.close();
        }
    }
    //added by LanNing end 20070625 从itemkind表查询数据，按照险别分组求和
    
    //added by Rowland begin 20070628 根据预约保险号，从prpcfee中取小保单的结算金额，根据支付币别按险种汇总
    public BLPrpCfee queryFeeByPoliRiskCurrency1(String strSQL) throws Exception{ 
    	DbPool dbpool = new DbPool();
    	try{
    		String strDataSource = SysConfig.getProperty("DDCCDATASOURCE");
    		BLPrpCfee blPrpCfee = new BLPrpCfee();
        	//打开数据库，开始事务
            dbpool.open(strDataSource);            
            ResultSet resultSet = dbpool.query(strSQL);
            while(resultSet.next()){
    			PrpCfeeSchema prpCfeeSchema = new PrpCfeeSchema();
    			prpCfeeSchema.setPolicyNo(resultSet.getString("policyNo"));
    			prpCfeeSchema.setRiskCode(resultSet.getString("riskCode"));
    			prpCfeeSchema.setCurrency1(resultSet.getString("currency1"));
    			prpCfeeSchema.setAmount1(resultSet.getString("amount1"));
    			prpCfeeSchema.setPremium1(resultSet.getString("premium1"));
    			blPrpCfee.setArr(prpCfeeSchema);
            }
            dbpool.close();
            return blPrpCfee;
    	}catch(Exception e){
    		e.printStackTrace();
    		dbpool.close();
            throw e;
    	}finally{
            dbpool.close();
        }
    }
    public BLPrpCfee queryFeeByRiskCurrency1(String strSQL) throws Exception{ 
    	DbPool dbpool = new DbPool();
    	try{
    		String strDataSource = SysConfig.getProperty("DDCCDATASOURCE");
    		BLPrpCfee blPrpCfee = new BLPrpCfee();
        	//打开数据库，开始事务
            dbpool.open(strDataSource);            
            ResultSet resultSet = dbpool.query(strSQL);
            while(resultSet.next()){
    			PrpCfeeSchema prpCfeeSchema = new PrpCfeeSchema();
    			prpCfeeSchema.setRiskCode(resultSet.getString("riskCode"));
    			prpCfeeSchema.setCurrency1(resultSet.getString("currency1"));
    			prpCfeeSchema.setAmount1(resultSet.getString("amount1"));
    			prpCfeeSchema.setPremium1(resultSet.getString("premium1"));
    			prpCfeeSchema.setExchangeRate1(resultSet.getString("exchangerate1"));
    			blPrpCfee.setArr(prpCfeeSchema);
            }
            dbpool.close();
            return blPrpCfee;
    	}catch(Exception e){
    		e.printStackTrace();
    		dbpool.close();
            throw e;
    	}finally{
            dbpool.close();
        }
    }
    //added by Rowland end 20070628 根据预约保险号，从prpcfee中取小保单的结算金额，根据支付币别按险种汇总
    //added by taoyan begin 20070925
    public BLPrpCfee querySumAmountAndPremium(String strSQL) throws Exception{ 
    	DbPool dbpool = new DbPool();
    	try{
    		String strDataSource = SysConfig.getProperty("DDCCDATASOURCE");
    		BLPrpCfee blPrpCfee = new BLPrpCfee();
        	//打开数据库，开始事务
            dbpool.open(strDataSource);            
            ResultSet resultSet = dbpool.query(strSQL);
            while(resultSet.next()){
    			PrpCfeeSchema prpCfeeSchema = new PrpCfeeSchema();
    			prpCfeeSchema.setAmount1(resultSet.getString("amount1"));
    			prpCfeeSchema.setPremium1(resultSet.getString("premium1"));
    			blPrpCfee.setArr(prpCfeeSchema);
            }
            dbpool.close();
            return blPrpCfee;
    	}catch(Exception e){
    		e.printStackTrace();
    		dbpool.close();
            throw e;
    	}finally{
            dbpool.close();
        }
    }
    //add by zhangruifeng 20080525 reason:增加粤港两地车保单补录时发票登记
    public void echoVisaForInvoice(String proposalNo) throws Exception
    {
		BLPrpInvoicePrintInfo blPrpInvoicePrintInfo = new BLPrpInvoicePrintInfo();
		BLPrpInvoicePrintInfo blPrpInvoicePrintInfoCI = new BLPrpInvoicePrintInfo();
		BLPrpJpayRefRec blPrpJpayRefRec = new BLPrpJpayRefRec();
		BLPrpJplanFee blPrpJplanFee = new BLPrpJplanFee ();
		PrpJplanFeeSchema  prpJplanFeeSchema = new PrpJplanFeeSchema();
		PrpJpayRefRecSchema prpJpayRefRecSchema  = new PrpJpayRefRecSchema();
		BLPrpJinvoiceLoan blPrpJinvoiceLoan = new BLPrpJinvoiceLoan(); 
		PrpJinvoiceLoanSchema prpJinvoiceLoanSchema = new PrpJinvoiceLoanSchema(); 
		BLVsCodeSet blVsCodeSet = new BLVsCodeSet();
		BLPrpCmain blPrpCmain = new BLPrpCmain();
		BLPrpCmainSub blPrpCmainSub = new BLPrpCmainSub();
		Visa  visa  = new Visa ();
		String strPreVisaCode = "";
		String strPreVisaSerialNo = "";
		String strVisaName="";
		String	strPrpJplanFee ="";
		String policyNo = "";
		String policyNoCI = "";
		String strWhere ="";
		String strUserCode = "";
		String strComCode="";
		strWhere = "proposalno = '"+proposalNo+"'";
		blPrpCmain.query(strWhere);
		if(blPrpCmain.getSize()>0){
			policyNo=blPrpCmain.getArr(0).getPolicyNo();
			strUserCode = blPrpCmain.getArr(0).getHandler1Code();//保单补录时按照归属业务员来判断是否可用
			strComCode = blPrpCmain.getArr(0).getComCode();
		}
    	blPrpInvoicePrintInfo.getData(policyNo);
		if(blPrpInvoicePrintInfo.getSize()>0){
		String 	iWherePart = "visaCode = '"+blPrpInvoicePrintInfo.getArr(0).getVisaCode()+"'";
		blVsCodeSet.query(iWherePart);
		if(blVsCodeSet.getSize()>0){
			strVisaName = blVsCodeSet.getArr(0).getVisaName();
		}
		
		/*当blPrpInvoicePrintInfo表中存在数据时证明是粤港两地车，粤港两地车发票补录时收付费系统的处理，分单打发票和合打发票
		  PrpInvoicePrintInfo的flag 0.单打 1.合打
		*/
        //当单证流水号可用时方可进行收付费得处理
/*		
		try {
			
		if(visa.checkUsedReady(strUserCode,blPrpInvoicePrintInfo.getArr(0).getVisaCode(),blPrpInvoicePrintInfo.getArr(0).getVisaSerialNo()))
		  {
			
			String strQueryType = "1";
			if("0".equals(blPrpInvoicePrintInfo.getArr(0).getFlag())){//当是单打发票时
				strPrpJplanFee = " CertiType = 'P'  AND CertiNo = '"+policyNo+"'";
			}else if ("1".equals(blPrpInvoicePrintInfo.getArr(0).getFlag())){
				blPrpCmainSub.getData(policyNo);
				if(blPrpCmainSub.getSize()>0){//当是合打发票时
					policyNoCI = blPrpCmainSub.getArr(0).getMainPolicyNo();
					strPrpJplanFee = " CertiType = 'P'  AND CertiNo in( '"+policyNo+"','"+policyNoCI+"')";
				}
			}
			
			blPrpJplanFee.query(strPrpJplanFee);
			
			blPrpJinvoiceLoan.query(strPrpJplanFee);
			  String[] arrCertiType = new String[blPrpJplanFee.getSize()];
			  String[] arrCertiNo = new String[blPrpJplanFee.getSize()];
			  String[] arrSerialNo = new String[blPrpJplanFee.getSize()];
			  String[] arrPayRefReason = new String[blPrpJplanFee.getSize()];
			  String[] arrPlanFee = new String[blPrpJplanFee.getSize()];
			  String[] arrCurrency2 = new String[blPrpJplanFee.getSize()];
			  String[] arrPayrefFee = new String[blPrpJplanFee.getSize()];
			  String[] arrRealPayRefFee = new String[blPrpJplanFee.getSize()];
			  String[] arrAppliName = new String[blPrpJplanFee.getSize()];
			  String[] arrPayRefTimes = new String[1];
			  for (int j = 0; j < blPrpJplanFee.getSize(); j++) {
			      prpJplanFeeSchema  = blPrpJplanFee.getArr(j);
						arrCertiType[j] = prpJplanFeeSchema.getCertiType();
						
						arrCertiNo[j]= prpJplanFeeSchema.getCertiNo();
						arrSerialNo[j] = "1";
						arrPayRefReason[j]= prpJplanFeeSchema.getPayRefReason();
						arrPlanFee[j]= prpJplanFeeSchema.getPlanFee();
						arrCurrency2[j]= prpJplanFeeSchema.getCurrency1();
						arrPayrefFee[j]= prpJplanFeeSchema.getPlanFee();
						arrRealPayRefFee[j]= prpJplanFeeSchema.getPlanFee();
						arrAppliName[j]= prpJplanFeeSchema.getAppliName();				  
			      prpJpayRefRecSchema.setOperateDate(blPrpInvoicePrintInfo.getArr(0).getOperateDate());
			      //modify by huabaoguo 20081201 交换OperatorCode 和 PrinterCode
			      prpJpayRefRecSchema.setOperatorCode(blPrpInvoicePrintInfo.getArr(0).getOperatorCode());
			      prpJpayRefRecSchema.setPrinterCode(strUserCode);
			      prpJpayRefRecSchema.setOperateUnit(strComCode);
			      prpJpayRefRecSchema.setCurrency2(prpJplanFeeSchema.getCurrency1());
			      prpJpayRefRecSchema.setVisaCode(blPrpInvoicePrintInfo.getArr(0).getVisaCode());
			      prpJpayRefRecSchema.setVisaName(strVisaName);
			      prpJpayRefRecSchema.setVisaSerialNo(blPrpInvoicePrintInfo.getArr(0).getVisaSerialNo());
			      prpJpayRefRecSchema.setPrintDate(blPrpInvoicePrintInfo.getArr(0).getOperateDate());
			      prpJpayRefRecSchema.setVisaHandler(strUserCode);
			      prpJpayRefRecSchema.setPayRefName("");  //粤港两地车无发票抬头
			      prpJpayRefRecSchema.setPayRefFee(prpJplanFeeSchema.getPlanFee());
			      prpJpayRefRecSchema.setRemark("");	 
			      } 
			 blPrpJpayRefRec.preInvoicePrpall(arrCertiType, arrCertiNo,
                        arrSerialNo, arrPayRefReason, arrPlanFee, arrPayrefFee,
                        arrCurrency2, arrRealPayRefFee, prpJpayRefRecSchema,
                        blPrpInvoicePrintInfo.getArr(0).getOperatorCode(),strQueryType,"",arrCertiType.length,strPreVisaCode,strPreVisaSerialNo);
			 if("0".equals(blPrpInvoicePrintInfo.getArr(0).getFlag())){//当是单打发票时
				 blPrpCmainSub.getData(policyNo);
					if(blPrpCmainSub.getSize()>0){//当是单打发票，并且是
						policyNoCI = blPrpCmainSub.getArr(0).getMainPolicyNo();
						blPrpInvoicePrintInfoCI.getData(policyNoCI);
						strPrpJplanFee = " CertiType = 'P'  AND CertiNo = '"+policyNoCI+"'";
						
						blPrpJplanFee.query(strPrpJplanFee);
						
						blPrpJinvoiceLoan.query(strPrpJplanFee);
						  arrCertiType = new String[blPrpJplanFee.getSize()];
						  arrCertiNo = new String[blPrpJplanFee.getSize()];
						  arrSerialNo = new String[blPrpJplanFee.getSize()];
						  arrPayRefReason = new String[blPrpJplanFee.getSize()];
						  arrPlanFee = new String[blPrpJplanFee.getSize()];
						  arrCurrency2 = new String[blPrpJplanFee.getSize()];
						  arrPayrefFee = new String[blPrpJplanFee.getSize()];
						  arrRealPayRefFee = new String[blPrpJplanFee.getSize()];
						  arrAppliName = new String[blPrpJplanFee.getSize()];
						  arrPayRefTimes = new String[1];
						  for (int j = 0; j < blPrpJplanFee.getSize(); j++) {
						      prpJplanFeeSchema  = blPrpJplanFee.getArr(j);
									arrCertiType[j] = prpJplanFeeSchema.getCertiType();
									
									arrCertiNo[j]= prpJplanFeeSchema.getCertiNo();
									arrSerialNo[j] = "1";
									arrPayRefReason[j]= prpJplanFeeSchema.getPayRefReason();
									arrPlanFee[j]= prpJplanFeeSchema.getPlanFee();
									arrCurrency2[j]= prpJplanFeeSchema.getCurrency1();
									arrPayrefFee[j]= prpJplanFeeSchema.getPlanFee();
									arrRealPayRefFee[j]= prpJplanFeeSchema.getPlanFee();
									arrAppliName[j]= prpJplanFeeSchema.getAppliName();				  
						      prpJpayRefRecSchema.setOperateDate(blPrpInvoicePrintInfoCI.getArr(0).getOperateDate());
						      //modify by huabaoguo 20081201 交换OperatorCode 和 PrinterCode
						      prpJpayRefRecSchema.setOperatorCode(blPrpInvoicePrintInfoCI.getArr(0).getOperatorCode());
						      prpJpayRefRecSchema.setPrinterCode(strUserCode);
						      prpJpayRefRecSchema.setOperateUnit(strComCode);
						      prpJpayRefRecSchema.setCurrency2(prpJplanFeeSchema.getCurrency1());
						      prpJpayRefRecSchema.setVisaCode(blPrpInvoicePrintInfoCI.getArr(0).getVisaCode());
						      prpJpayRefRecSchema.setVisaName(strVisaName);
						      prpJpayRefRecSchema.setVisaSerialNo(blPrpInvoicePrintInfoCI.getArr(0).getVisaSerialNo());
						      prpJpayRefRecSchema.setPrintDate(blPrpInvoicePrintInfoCI.getArr(0).getOperateDate());
						      prpJpayRefRecSchema.setVisaHandler(strUserCode);
						      prpJpayRefRecSchema.setPayRefName("");  //粤港两地车无发票抬头
						      prpJpayRefRecSchema.setPayRefFee(prpJplanFeeSchema.getPlanFee());
						      prpJpayRefRecSchema.setRemark("");	 
						      } 
						 blPrpJpayRefRec.preInvoicePrpall(arrCertiType, arrCertiNo,
			                        arrSerialNo, arrPayRefReason, arrPlanFee, arrPayrefFee,
			                        arrCurrency2, arrRealPayRefFee, prpJpayRefRecSchema,
			                        blPrpInvoicePrintInfoCI.getArr(0).getOperatorCode(),strQueryType,"",arrCertiType.length,strPreVisaCode,strPreVisaSerialNo);
					}
			 }		 
		  }
		}
		catch(Exception e){
    		e.printStackTrace();
            throw e;
    	}
		
		}
    }
    public void echoVisaForInvoiceEndorse(String endorseNo,String visaCode,String visaserialNo) throws Exception
    {
		BLPrpInvoicePrintInfo blPrpInvoicePrintInfo = new BLPrpInvoicePrintInfo();
		BLPrpJpayRefRec blPrpJpayRefRec = new BLPrpJpayRefRec();
		BLPrpJplanFee blPrpJplanFee = new BLPrpJplanFee ();
		PrpJplanFeeSchema  prpJplanFeeSchema = new PrpJplanFeeSchema();
		PrpJpayRefRecSchema prpJpayRefRecSchema  = new PrpJpayRefRecSchema();
		BLPrpJinvoiceLoan blPrpJinvoiceLoan = new BLPrpJinvoiceLoan(); 
		PrpJinvoiceLoanSchema prpJinvoiceLoanSchema = new PrpJinvoiceLoanSchema(); 
		BLVsCodeSet blVsCodeSet = new BLVsCodeSet();
		BLPrpPmain blPrpPmain = new BLPrpPmain();
		BLPrpCmainSub blPrpCmainSub = new BLPrpCmainSub();
		Visa  visa  = new Visa ();
		String strPreVisaCode = "";
		String strPreVisaSerialNo = "";
		String strVisaName="";
		String	strPrpJplanFee ="";
		String policyNo = "";
		String policyNoCI = "";
		String strWhere ="";
		String strUserCode = "";
		String strComCode="";
		strWhere = "endorseNo = '"+endorseNo+"'";
		blPrpPmain.query(strWhere);
		if(blPrpPmain.getSize()>0){
			strUserCode = blPrpPmain.getArr(0).getHandler1Code();//保单补录时按照归属业务员来判断是否可用
			strComCode = blPrpPmain.getArr(0).getComCode();
		}
		try {
    	blPrpInvoicePrintInfo.getData(endorseNo);
		if(blPrpInvoicePrintInfo.getSize()>0){
		String 	iWherePart = "visaCode = '"+blPrpInvoicePrintInfo.getArr(0).getVisaCode()+"'";
		blVsCodeSet.query(iWherePart);
		if(blVsCodeSet.getSize()>0){
			strVisaName = blVsCodeSet.getArr(0).getVisaName();
		}
		
		/*当blPrpInvoicePrintInfo表中存在数据时证明是粤港两地车，粤港两地车发票补录时收付费系统的处理，分单打发票和合打发票
		  PrpInvoicePrintInfo的flag 0.单打 1.合打
		*/
        //当单证流水号可用时方可进行收付费得处理
/*		
		if(visa.checkUsedReady(strUserCode,blPrpInvoicePrintInfo.getArr(0).getVisaCode(),blPrpInvoicePrintInfo.getArr(0).getVisaSerialNo()))
		  {
			String strQueryType = "1";
			if("0".equals(blPrpInvoicePrintInfo.getArr(0).getFlag())){//当是单打发票时
				strPrpJplanFee = " CertiType = 'E'  AND CertiNo = '"+endorseNo+"'";
			}
			blPrpJplanFee.query(strPrpJplanFee);
			blPrpJinvoiceLoan.query(strPrpJplanFee);
			  String[] arrCertiType = new String[blPrpJplanFee.getSize()];
			  String[] arrCertiNo = new String[blPrpJplanFee.getSize()];
			  String[] arrSerialNo = new String[blPrpJplanFee.getSize()];
			  String[] arrPayRefReason = new String[blPrpJplanFee.getSize()];
			  String[] arrPlanFee = new String[blPrpJplanFee.getSize()];
			  String[] arrCurrency2 = new String[blPrpJplanFee.getSize()];
			  String[] arrPayrefFee = new String[blPrpJplanFee.getSize()];
			  String[] arrRealPayRefFee = new String[blPrpJplanFee.getSize()];
			  String[] arrAppliName = new String[blPrpJplanFee.getSize()];
			  String[] arrPayRefTimes = new String[1];
			  
			  for (int j = 0; j < blPrpJplanFee.getSize(); j++) {
			      prpJplanFeeSchema  = blPrpJplanFee.getArr(j);
						arrCertiType[j] = prpJplanFeeSchema.getCertiType();
						
						arrCertiNo[j]= prpJplanFeeSchema.getCertiNo();
						arrSerialNo[j] = "1";
						arrPayRefReason[j]= prpJplanFeeSchema.getPayRefReason();
						arrPlanFee[j]= prpJplanFeeSchema.getPlanFee();
						arrCurrency2[j]= prpJplanFeeSchema.getCurrency1();
						arrPayrefFee[j]= prpJplanFeeSchema.getPlanFee();
						arrRealPayRefFee[j]= prpJplanFeeSchema.getPlanFee();
						arrAppliName[j]= prpJplanFeeSchema.getAppliName();				  
			      prpJpayRefRecSchema.setOperateDate(blPrpInvoicePrintInfo.getArr(0).getOperateDate());
			    //modify by huabaoguo 20081201 交换OperatorCode 和 PrinterCode
			      prpJpayRefRecSchema.setOperatorCode(blPrpInvoicePrintInfo.getArr(0).getOperatorCode());
			      prpJpayRefRecSchema.setPrinterCode(strUserCode);
			      prpJpayRefRecSchema.setOperateUnit(strComCode);
			      prpJpayRefRecSchema.setCurrency2(prpJplanFeeSchema.getCurrency1());
			      prpJpayRefRecSchema.setVisaCode(blPrpInvoicePrintInfo.getArr(0).getVisaCode());
			      prpJpayRefRecSchema.setVisaName(strVisaName);
			      prpJpayRefRecSchema.setVisaSerialNo(blPrpInvoicePrintInfo.getArr(0).getVisaSerialNo());
			      prpJpayRefRecSchema.setPrintDate(blPrpInvoicePrintInfo.getArr(0).getOperateDate());
			      prpJpayRefRecSchema.setVisaHandler(strUserCode);
			      prpJpayRefRecSchema.setPayRefName("");  //粤港两地车无发票抬头
			      prpJpayRefRecSchema.setPayRefFee(prpJplanFeeSchema.getPlanFee());
			      prpJpayRefRecSchema.setRemark("");
			      blPrpJpayRefRec.preInvoicePrpall(arrCertiType, arrCertiNo,
	                        arrSerialNo, arrPayRefReason, arrPlanFee, arrPayrefFee,
	                        arrCurrency2, arrRealPayRefFee, prpJpayRefRecSchema,
	                        blPrpInvoicePrintInfo.getArr(0).getOperatorCode(),strQueryType,"",arrCertiType.length,strPreVisaCode,strPreVisaSerialNo);	 
			      } 
		  }
		}
		  if(!"".equals(visaCode)&&visaCode!=null&&!"".equals(visaserialNo)&&visaserialNo!=null){
			if(visa.checkUsedReady(strUserCode,visaCode,visaserialNo))//批单的打印流水号的作废
			{
				visa.useTrans(strUserCode,visaCode,visaserialNo,endorseNo);
			}
		   }
		 
		}
		catch(Exception e){
    		e.printStackTrace();
            throw e;
    	}
		
		
    }
	   //added by gengxiaobo begin 20080708 判断05007是否自动核保
	   public String checkAutoProposalToPolicy(String strProposalNo,String strComCode)throws Exception
	   {
	   	BLPrpTcarshipTax blPrpTcarshipTax = new BLPrpTcarshipTax();
	   	BLPrpTmain blPrpTmain = new BLPrpTmain();
	   	BLPrpTengage blPrpTengage = new BLPrpTengage();
	   	String strTaxRelifFlag = "";
	   	String strRtnTemp = "12";
	   	blPrpTmain.getData(strProposalNo);
   	    blPrpTengage.getData(strProposalNo);
   	    DateTime strStartDate = new DateTime(blPrpTmain.getArr(0).getStartDate());	    	 
   	    DateTime strEndDate = new DateTime(blPrpTmain.getArr(0).getEndDate());	
   	    String strEndDateForYear ;
   	    int intStartHour = 0;
   	    int intEndHour = 24;
   	    intStartHour = Integer.parseInt(blPrpTmain.getArr(0).getStartHour());
    	intEndHour = Integer.parseInt(blPrpTmain.getArr(0).getEndHour());
	   	blPrpTcarshipTax.getData(strProposalNo);
	     if(blPrpTcarshipTax.getSize()>0)
	     {
	     	strTaxRelifFlag = blPrpTcarshipTax.getArr(0).getTaxRelifFlag().trim();
	     }
	     //黑龙江单出较强险时手工核保，本方法在单出较强险时调用
	     if(SysConfig.getProperty("PERMITCOMCODE_05007").indexOf(strComCode.substring(0,2))>=0)
	     {
	    	 return strRtnTemp = "11";
	     }
	     //河南关闭焦作市营销服务部(41080000),交强险“车船税标志”为“纳税”以外的保单自动核保功能，改为由人工核保方式处理。
	     if(!"1N".equals(strTaxRelifFlag.trim())&&"41080000".equals(strComCode.trim()))
	     {
	    	 return strRtnTemp = "11";
	     }
	     if("1409".equals(strComCode.substring(0,4)))
	     {
	    	 return strRtnTemp = "11";
	     }
	     // add by zhangfan 取消深圳单独投保交强险自动核保 20080911 begin
	     if("4403".equals(strComCode.substring(0,4)))
	     {
	    	 return strRtnTemp = "11";
	     }
        //	add by zhangfan 取消深圳单独投保交强险自动核保 20080911 end
	     //云南根据实际业务需要决定05007是否自动核保
	     if("53".equals(strComCode.trim().substring(0,2)))
	     {
	    	 
	    	 if(DateTime.intervalYear(strStartDate, intStartHour, strEndDate, intEndHour)<1
	    			 ||blPrpTengage.getSize()>0
	    			 ||Double.parseDouble(blPrpTmain.getArr(0).getDiscount())>0.2)
	    	 {
	    		 return strRtnTemp = "11";
	    	 }
	     }	
	     //add by zhangruifeng 20081118 reason:保单的保险止期与保险起期相差的精确年数不等于1年，转人工核保
	     if("11".equals(strComCode.trim().substring(0,2)))
	     {
	    	 strEndDateForYear=this.getNextMonthFullDate(blPrpTmain.getArr(0).getStartDate(),12);
	    	 
	        // * @return int intReturn 1 （First）大于（second）、0 相等、-1 （First）小于（second）
	    	 if(!(this.compareDate( strEndDateForYear,blPrpTmain.getArr(0).getEndDate())==0)){
	    		 return strRtnTemp = "11";   
	    	 }
	     }
         //add by panyafeng begin 20081224
	     if("11".equals(strComCode.trim().substring(0,2)))
	     {
	    	 BLPrpTitemCar blPrpTitemCar = new BLPrpTitemCar();
	    	 blPrpTitemCar.getData(strProposalNo);
	    	 String strOtherFlag8 = blPrpTitemCar.getArr(0).getOtherNature().substring(7, 8);
	    	 if("1".equals(strOtherFlag8) || "3M".equals(strTaxRelifFlag.trim()) || "6Q".equals(strTaxRelifFlag.trim())){
	    		 return strRtnTemp = "11";
	    	 }
	     }
	     //add by panyafeng end 20081224
	     return strRtnTemp;
	   }  
	 	//added by gengxiaobo end 20080708 判断05007是否自动核保      */
    
	/**
	 * 去掉List中为空的对象
	 */
	@SuppressWarnings("unchecked")
	public static List takeOffNullObject(List list) {
		List newList = new ArrayList();
		for (Object object : list) {
			if (object != null) {
				newList.add(object);
			}
		}
		return newList;
	}
	
	/**
	 * 去掉List中为空的对象
	 * 广东去空对象方法 不返回新list
	 */
	@SuppressWarnings("unchecked")
	public static void takeOffNullObjectGD(List list) {
		if(list == null || list.size()==0){
			return;
		}
		for(int i = list.size()-1;i>=0;i--){
			if(list.get(i)==null){
				list.remove(i);
			}
		}
	}
	
	/**
	 * <p>
	 * java.util.Date类型的时间转化为STRING
	 * </p>
	 * 
	 * @param prpCmain
	 * @return list
	 * @throws Exception
	 * @throws Exception
	 */
    public static String formatDate(java.util.Date date) {
	/*strreturn = ""
		+ (date.getYear() + 1900)
		+ ((date.getMonth() + 1) < 10 ? ("0" + (date.getMonth() + 1))
			: ("" + (date.getMonth() + 1))) + date.getDate();*/
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	return df.format(date);
    }

    /**
     * 格式化日期的显示格式
     * 
     * @param date
     *                待显示的日期对象
     * @param pattern
     *                格式化的日期pattern，如yyyy-MM-dd yyyy/MM/dd yyyy年MM月d日等
     * @return 返回的是格式化后的日期显示字符串
     */
    public static String formatDate(java.util.Date date, String pattern) {
	// 建立日期FORMAT的实例
	SimpleDateFormat df = new SimpleDateFormat(pattern);
	return df.format(date);
    }

    /**
     * String 转 Date
     * 
     * @param dateString8个字符的日期
     * @return YYYY-MM-DD形式的日期
     */
    public static java.util.Date stringToDate(String dateString) {
	if (dateString == null || dateString.equals("")) {
	    return new java.util.Date();
	}
	if (dateString.length() < 8) {
	    throw new IllegalArgumentException(dateString
		    + "的日期格式不对，必须为大于8位的纯数字的字符串");
	}
	DateTime result =  new DateTime(dateString, DateTime.YEAR_TO_DAY);
	return result;
    }
	
    
    public static String getMapValue(Map<String,String> map,String key){
    	String result = "";
    	key = key.trim();
    	if(map == null || map.isEmpty() || StringUtils.isEmpty(key)){
    		return "";
    	}

    	Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			if(it.next().equals(key)){
				result = map.get(key);
				break;
			}
		}
    	return result;
    }
//    public static PrpQitemKind searchQ(PrpQmain prpQmain,Integer itemKindNo)
//     {
//	PrpQitemKind prpQitemKind = new PrpQitemKind();
//	for (int i = 0; i < prpQmain.getPrpQitemKinds().size(); i++) {
//	    if (prpQmain.getPrpQitemKinds().get(i).getId().getItemKindN()
//		    .intValue() == itemKindNo.intValue()) {
//		prpQitemKind = prpQmain.getPrpQitemKinds().get(i);
//		break;
//	    }
//	}
//	return prpQitemKind;
//    }
}
