package ins.domain.upload.service.facade;

import java.util.List;

import ins.domain.schema.model.FileInfoMsg;

/**
 * 保存上传文件信息
 * 2012-10-22
 */
public interface FileInfoMsgService {
	/**
	 * 保存信息
	 * @param fileInfoMsg
	 */
    public void addFileInfoMsg(FileInfoMsg fileInfoMsg);
    /**
     * 查询出taskId下的所有图片
     * 
     */
    public List<FileInfoMsg> getFileInfoMsgList(String taskId);
    /**
     * 查询出报案号下的所有图片
     * @param registNo
     * @return
     */
    public List<FileInfoMsg> getFileInfoMsgListByRegistNo(String registNo);
    
    /**
     * @param taskId 任务号
     * @return 返回存在的信息
     */
    public FileInfoMsg getFileInfoMsg(String bizId);
    /**
     * 更新数据库的信息 
     * @param fileInfoMsg
     */
    public void updateFileInfoMsg(FileInfoMsg fileInfoMsg);
    
    /**
     * @param bizId
     */
    public void deleteFileInfoMsg(String bizId);
    
    public void deleteInvalidPhotos();
}
