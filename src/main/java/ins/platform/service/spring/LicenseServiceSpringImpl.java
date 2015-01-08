package ins.platform.service.spring;

import com.jsptz.util.common.Jsptzs;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.framework.exception.BusinessException;
import ins.platform.schema.model.UtiLicense;
import ins.platform.service.facade.LicenseService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("licenseService")
public class LicenseServiceSpringImpl extends
		GenericDaoHibernate<UtiLicense, String> implements LicenseService {
	private static final Log logger = LogFactory
			.getLog(LicenseServiceSpringImpl.class);

	public List<UtiLicense> findLocalLicense() {
		QueryRule queryRule = QueryRule.getInstance();
		logger.debug("获取证书列表");
		return super.find(queryRule);
	}

	public void saveLicense(UtiLicense utiLicense) {
		logger.debug("保存证书");
		if (checkLicense(utiLicense))
			super.save(utiLicense);
		else
			throw new BusinessException("验证失败，请检查输入信息", false);
	}

	private boolean checkLicense(UtiLicense utiLicense) {
		boolean flag = false;
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String serialNo = utiLicense.getSerialNo();
		String productCode = utiLicense.getProductCode();
		String prodectVersion = utiLicense.getProductVersion();
		String userName = utiLicense.getUserName();
		String validStartDate = df.format(utiLicense.getValidStartDate());
		String validEndDate = df.format(utiLicense.getValidEndDate());
		String cdKey = utiLicense.getCdKey();
		try {
			Jsptzs.validLicense(cdKey, serialNo, productCode, prodectVersion,
					userName, validStartDate, validEndDate);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean checkLocalLicense() {
//		boolean flag = false;
//		for (UtiLicense temp : findLocalLicense()) {
//			if (checkLicense(temp)) {
//				flag = true;
//				break;
//			}
//		}
		return true;
	}

	public UtiLicense findValidLicense() {
		for (UtiLicense temp : findLocalLicense()) {
			if (checkLicense(temp)) {
				return temp;
			}
		}
		return null;
	}
}