package ins.domain.upload.server.serverImpl;

import ins.domain.schema.model.FileInfoMsg;
import ins.domain.schema.vo.MsgInfoVo;
import ins.domain.upload.server.TCPServer;
import ins.domain.upload.service.facade.FileInfoMsgService;
import ins.domain.util.BASE64Encoder;
import ins.domain.util.Converter2Type;
import ins.framework.common.ServiceFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import org.apache.log4j.Logger;
/**
 * TODO Put here a description of what this class does.
 * 服务器端为每个socket提供的处理类
 * Created 2012-10-17.
 */
public class TCPHandler implements Runnable{

	private Logger log = Logger.getLogger(TCPHandler.class);
	
	//来自客户端的socket
	private Socket socket=null;
	
	//线程开关
	private boolean isUpload = false;
	//所有使用的流
	private InputStream in;
	private OutputStream out;
	private DataOutputStream Oout;
	private DataInputStream Oin;
    
	private FileInfoMsg vo=null;
	//最终保存数据库的
	private FileInfoMsg fvo=null;
	// 文件操作对象
	private File file = null;
	
	// 断点流;
	private RandomAccessFile random = null;
	
	public TCPHandler(Socket socket){
		this.socket=socket;
	}
	
	public void run() {
		try {
			init();
			auth();
			transfer();
		} catch (Exception e) {
			this.log.info("客户端线程关闭:"+e.getMessage());
		}finally{
			destroy();
		}
	}
	
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @throws IOException
	 */
	public void init() throws IOException {
		this.in = this.socket.getInputStream();
		this.Oin = new DataInputStream(this.in);
		this.out = this.socket.getOutputStream();
		this.Oout = new DataOutputStream(this.out);
	}
	
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @throws Exception
	 */
	public void auth() throws Exception{
		this.log.info("---进入数据验证！");
		this.log.info("客户端地址："+this.socket.getInetAddress());
		// 读取认证信息 并且解析
		String request = this.Oin.readUTF();
		this.log.info("rqeuest="+request);
		this.vo=Converter2Type.FileInfoVo2Object(request);
	
		
	    //输入有就从Map里拿  没有就创建存放下来
	    if(TCPServer.datas.containsKey(this.vo.getBizId())){
	    	
	    	this.vo=TCPServer.datas.get(this.vo.getBizId());
	    	//如果集合中有就直接拿出来
	    	this.file=new File(this.vo.getFilePath().substring(0 ,this.vo.getFilePath().lastIndexOf(this.vo.getFileName()) -1),this.vo.getFileName());
	    }else{
	    	FileInfoMsgService fileInfoMsgService =(FileInfoMsgService) ServiceFactory.getService("fileInfoMsgService");
			FileInfoMsg msg=fileInfoMsgService.getFileInfoMsg(this.vo.getBizId());
			if(msg != null){
				this.vo = msg;
				this.file=new File(msg.getFilePath());
			}else{
				String path=this.vo.getTaskId();
				//设置存放的位置与当前应用的位置有关
				File dir=new File("checkPic" + File.separator + path);
				//判断是否存在
				if(!dir.exists()){
					dir.mkdirs();
				}
				this.file=new File(dir,this.vo.getFileName());
				//保存文件在服务器上的路径
				
				this.vo.setFilePath(this.file.getAbsolutePath());
				TCPServer.datas.put(this.vo.getBizId(),this.vo);
			}
	    }
	    
		//告诉客户端从那个位置开始传输
	    MsgInfoVo ms=new MsgInfoVo();
	    ms.setOffset(this.vo.getOffset());
	    ms.setSize(this.vo.getFileSize());
	    ms.setState(1);
	    
	    String response=Converter2Type.MsgInfo2String(ms);
	    this.log.info("response="+response);
	    //回写数据
	    this.Oout.writeUTF(response);
	   
	    this.random=new RandomAccessFile(this.file,"rwd");
		this.isUpload=true;
		this.log.info("---数据验证结束,保存路径为:"+this.file.getAbsolutePath());
	}
	
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @throws IOException
	 */
	public void transfer() throws IOException{
		this.log.info("---正文保存开始");
		if(this.isUpload){
			byte[] by=new byte[1024];
		   	this.random.seek(this.vo.getOffset());
		   	int len=-1;
		   	//拿到集合中的本次记录 记录偏移量
		    this.fvo=TCPServer.datas.get(this.vo.getBizId());
		    
		    while((len=this.in.read(by))!=-1)
		    {
		    	
		    	System.out.println("文件传输大小："+len);
		    	//图片二进制字段
//		        String str= BASE64Encoder.encode(by);
//		        this.fvo.setFileData(this.fvo.getFileData() + str);
		        
		    	this.random.write(by,0,len);
		    	
		    	//拿到文件传输的偏移量（因为是引用类型所以改变后会保留结果）
		    	this.log.info("文件的传输进度："+this.random.getFilePointer());
		    	//记录偏移量
		    	this.fvo.setOffset(this.random.getFilePointer());
		    }
		    
		    this.log.info("----文件接收完毕！");
		 
		}
	 
		this.log.info("---正文保存完毕！");
	}
	
	/**
	 * 线程关闭
	 *
	 */
	public void destroy() {
		//进行数据库保存......进行中
		try{
			//如果传输完成 把Map中的数据清除掉
		    if(this.fvo!=null){
		    	FileInfoMsgService fileInfoMsgService =(FileInfoMsgService) ServiceFactory.getService("fileInfoMsgService");
				FileInfoMsg msg=fileInfoMsgService.getFileInfoMsg(this.fvo.getBizId());
				if(msg!=null&&msg.getFileName()!=null&&!msg.getFileName().equals("")){
				   fileInfoMsgService.updateFileInfoMsg(this.fvo);
				}else{
				   fileInfoMsgService.addFileInfoMsg(fvo);
				}
				if((this.fvo.getOffset() + "").equals(this.fvo.getFileSize() + "")){
		    	    TCPServer.datas.remove(fvo.getBizId());
				}
		    }
		}catch(Exception e){
			this.log.info("--储存图片信息发生异常！");
			System.err.println("--储存图片信息发生异常！异常信息为："+e.getMessage());
		}
		
		// 如果跳出循环 表示这里要已经接收完毕 可以关闭资源了
		this.log.info("此线程关闭 ");
		try {
			this.isUpload = false;
			if(this.in!=null){
				this.in.close();
			}
			if(this.Oin!=null){
				this.Oin.close();
			}
			if(this.out!=null){
				this.out.close();
			}
			if(this.Oout!=null){
				this.Oout.close();
			}
			if(this.random!=null){
				this.random.close();
			}
			if(this.socket!=null){
				this.socket.close();	
			}
		} catch (Exception e) {
              this.log.info("关闭线程失败！"+e.getMessage());
		}
	}
	

}
