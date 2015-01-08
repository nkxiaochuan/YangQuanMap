package ins.domain.upload.service.spring;

import java.io.File;
import java.util.List;
import java.util.Properties;

import cn.com.sinosoft.intf.common.DeleteDiskPhotos;
import cn.com.sinosoft.mobileplat.common.util.PubTools;
import ins.domain.schema.model.FileInfoMsg;
import ins.domain.upload.service.facade.FileInfoMsgService;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;

public class FileInfoMsgServiceSpringImpl extends 
GenericDaoHibernate<FileInfoMsg,String> implements FileInfoMsgService{

	public void addFileInfoMsg(FileInfoMsg fileInfoMsg) {
		super.save(fileInfoMsg);
	}

	public List<FileInfoMsg> getFileInfoMsgList(String taskId) {
		QueryRule query=QueryRule.getInstance();
		query.addEqual("taskId", taskId);
		List<FileInfoMsg> list=super.find(query);
		return list;
	}

	public FileInfoMsg getFileInfoMsg(String bizId) {
		return super.get(bizId);
	}

	public void updateFileInfoMsg(FileInfoMsg fileInfoMsg) {
		super.update(fileInfoMsg);		
	}

	public List<FileInfoMsg> getFileInfoMsgListByRegistNo(String registNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteFileInfoMsg(String bizId) {
		// TODO Auto-generated method stub
		super.deleteByPK(bizId);
	}

	public void deleteInvalidPhotos() {
		// TODO Auto-generated method stub
		//以后改为从库里取
//		String beforeDays = "30";
		Properties properties = new PubTools().getProperties("SimpConfig.properties");
		String beforeDays = properties.getProperty("beforeDays");
		String sql ="select f.bizid,f.filepath from fileInfomsg f where to_date(SUBSTR(f.filedate,1,10),'yyyy-mm-dd') <= TRUNC(sysdate - ";
		sql = sql + beforeDays + ")";
		
		List msgs = this.findBySql(sql);
		if(msgs != null){
			String filePath = (String)((Object[])msgs.get(0))[1];
			//截取到任务号
			String dirPath = filePath.substring(0,filePath.lastIndexOf((String)((Object[])msgs.get(0))[0]) - 1);
			//截取到任务好上层，默认checkPic
			String path = dirPath.substring(0, dirPath.lastIndexOf(File.separator));
			String taskId = "";
			String taskIds = "";
			String pathTemp = "";
			Object[] a;
			//删除数据库记录，并统计任务号
			for(Object obj: msgs){
				a = (Object[]) obj;
				pathTemp = (String)a[1];
				this.deleteByPK((String)a[0]);
				//照片存放路径，暂时写死
				taskId = pathTemp.substring(pathTemp.indexOf("checkPic") + 9,pathTemp.lastIndexOf((String)a[0]) - 1);
//				taskId = pathTemp.substring(pathTemp.lastIndexOf(File.separator) + 1);
				//避免重复调用
				if(taskIds.indexOf(taskId) < 0){
					taskIds += taskId + ",";
				}
			}
			if(!"".equals(taskIds)){
				String[] dirs = taskIds.split(",");
				for(int i =0 ;i <dirs.length;i++){
					DeleteDiskPhotos.delFolder(path + File.separator + dirs[i]);
				}
			}
		}
	}
     
}
