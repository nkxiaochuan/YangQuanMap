package ins.domain.util;

import ins.domain.schema.model.FileInfoMsg;
import ins.domain.upload.server.TCPServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileInfoUtil {
	
    public static List<FileInfoMsg> getFileInfoMsgList(String taskId){
    	List<FileInfoMsg> list=new ArrayList<FileInfoMsg>();
    	//得到上传过来的图片信息集合
        Map<String,FileInfoMsg> data=TCPServer.datas;
        for (String item : data.keySet()) {
        	FileInfoMsg msg=data.get(item);
        	if(msg.getTaskId().equals(taskId)){
        		list.add(msg);
        		//把它移除掉
        		TCPServer.datas.remove(item);
        	}
		}
    	return list;
    }
}
