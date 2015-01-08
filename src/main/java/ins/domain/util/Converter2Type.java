package ins.domain.util;

import ins.domain.schema.model.FileInfoMsg;
import ins.domain.schema.vo.MsgInfoVo;



/**
 * TODO Put here a description of what this class does.
 *
 *         Created 2012-10-17.
 */
public class Converter2Type {
    /**
     * TODO Put here a description of what this method does.
     *
     * @param info
     * @return 返回堆笑
     */
    public static FileInfoMsg FileInfoVo2Object(String info){
    	FileInfoMsg vo=new FileInfoMsg();
    	String[] items=info.split(",");
    	vo.setBizId(items[0].substring(items[0].indexOf("=")+1));
    	vo.setSerialNo(new Integer(items[1].substring(items[1].indexOf("=")+1)));
    	vo.setTaskId(items[2].substring(items[2].indexOf("=")+1));
		vo.setFileName(items[3].substring(items[3].indexOf("=")+1));
		vo.setFilePath(items[4].substring(items[4].indexOf("=")+1));
		vo.setOffset(new Long(items[5].substring(items[5].indexOf("=")+1)));
		vo.setFileType(items[6].substring(items[6].indexOf("=")+1));
		vo.setFileRemark(items[7].substring(items[7].indexOf("=")+1));
		vo.setFileSize(new Long(items[8].substring(items[8].indexOf("=")+1)));
		vo.setFileAddress(items[9].substring(items[9].indexOf("=")+1));
		vo.setFileDate(items[10].substring(items[10].indexOf("=")+1));
		//图片二进制不保存到数据库
//		vo.setFileData(items[11].substring(items[11].indexOf("=")+1));
		vo.setAddfileType(items[12].substring(items[12].indexOf("=")+1));
		vo.setCarId(items[13].substring(items[13].indexOf("=")+1));
		vo.setFileOriginalInfo(items[14].substring(items[14].indexOf("=")+1));
		vo.setFileKeyType(items[15].substring(items[15].indexOf("=")+1));
		vo.setFileKeyValue(items[16].substring(items[16].indexOf("=")+1));
    	return vo;
    }
    
    /**
     * TODO Put here a description of what this method does.
     *
     * @param vo
     * @return 返回字符串
     */
    public static String FileInfoVo2String(FileInfoMsg vo){
    	return "bizId="+vo.getBizId()+",serialNo="+vo.getSerialNo()+",taskId="+vo.getTaskId()+",fileName="+vo.getFileName()
    			+",filePath="+vo.getFilePath()+",offset="+vo.getOffset()+",fileType="+vo.getFileType()+",fileRemark="+vo.getFileRemark()
    			+",fileSize="+vo.getFileSize()+",fileAddress="+vo.getFileAddress()+",fileDate="+vo.getFileDate()+
//    			",fileData="+vo.getFileData()+
    			",addfileType="+vo.getAddfileType()+",carId="+vo.getCarId(); 
    }
    
    /**
     * TODO Put here a description of what this method does.
     *
     * @param info
     * @return 返回对象
     */
    public static MsgInfoVo MsgInfo2Object(String info){
    	MsgInfoVo ms=new MsgInfoVo();
    	String[] items=info.split(",");
    	ms.setOffset(new Long(items[0].substring(items[0].indexOf("=")+1)));
    	ms.setSize(new Long(items[1].substring(items[1].indexOf("=")+1)));
    	ms.setState(Integer.parseInt(items[2].substring(items[2].indexOf("=")+1)));
    	return ms;
    }
    
    /**
     * TODO Put here a description of what this method does.
     *
     * @param ms
     * @return 返回对象
     */
    public static String MsgInfo2String(MsgInfoVo ms){
    	return "offset="+ms.getOffset()+",size="+ms.getSize()+
    			",state="+ms.getState()+"";
    }
    
}
