package com.sinosoft.test;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;

/**
 * TODO Put here a description of what this class does.
 * 
 * Created 2012-10-17.
 */
public class Client {
	// 需要连接的IP地址
	private String ip = "192.168.1.101:7001";
	// 上传的端口号
	private int port = 9527;

	private Socket s;
	private InputStream in = null;
	private OutputStream out = null;

	private DataOutputStream dout;
	private DataInputStream din;
    
	//控制暂停或开始
	public boolean con=false;
	// 文件操作 对象
	private File file = null;
	private RandomAccessFile random = null;
//	private PhotoInfo  photo;//照片对象，上传完改变状态
//	private FileInfoMsg info = null;
//	private MsgInfoVo msg = null;
//	private Handler handler;//添加一个消息体发送上传进度
	private long offsetLength = 0;
	 private  boolean  isFinish;//任务是否完成
//	 private Context  context;
	 private  boolean  isFirst = true;
	 
	 
	 private String msg;
	/**
	 * TODO Put here a description of what this constructor does.
	 * 
	 * @param file
	 * @param info
	 * @param port
	 * @param ip
	 */
//	public Client(File file, FileInfoMsg info, int port, String ip,Handler handler,PhotoInfo  photo) {
//		this.file = file;
//		this.info = info;
//		this.port = port;
//		this.ip = ip;
//		this.handler = handler;
//		this.photo = photo;
//		this.context = ConfigHelper.context;
//		this.isFirst = true;
//	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 
	 * 初始化
	 * 
	 * @throws IOException
	 */
	public void init() throws IOException {
		this.s = new Socket(this.ip, this.port);
		this.in = this.s.getInputStream();
		this.din = new DataInputStream(this.in);
		this.out = this.s.getOutputStream();
		this.dout = new DataOutputStream(this.out);
		this.random = new RandomAccessFile(this.file, "r");
	}

	/**
	 * 
	 * 验证
	 * 
	 * @throws IOException
	 */
	public void auth() throws IOException {
		System.out.println("---发送数到服务器");
		this.dout.writeUTF("bizId=20122421022428.jpg,serialNo=1,taskId=104360515072386,fileName=20122421022428.jpg,filePath=/sdcard/ClaimDemo/20122421022428_s.jpg,offset=0,fileType=5001,fileRemark=,fileSize=482679,fileAddress=北京,fileDate=2012-12-21 14:24:28,fileData=,addfileType=5001,carId=1,fileOriginalInfo =拍照时间：2012:12:21 14:24:25<br>         EXIF版本：48 50 50 48<br>         相机品牌：ZTE                            <br>         相机型号：ZTE U960s3                     <br>         光圈：2.8<br>         快門：99994/1000000<br>,fileKeyType=MD5,fileKeyValue=D29AE806626A1C30B92C9CA05685BF1C");
		System.out.println("---发送数据结束，等待返回数据");
		this.msg = this.din.readUTF();
		System.out.println("---接受数据为：" + this.msg);
//		this.msg = Converter2Type.MsgInfo2Object(line);
		System.out.println("---验证结束");
	}

	/**
	 * 执行文件传输
	 * 
	 * @throws Exception
	 */
	public void transfer( ) throws Exception {
		byte[] by = new byte[1024];
		int length = -1;
		// 进入文件的传输
		System.out.println("---进入正文传输阶段");
//		System.out.println("offset=" + this.msg.getOffset());
//		// 计算偏移量
//		this.random.seek(this.msg.getOffset());
		// 累计进度
		if ("111111".equals(this.msg)) {
				
			System.out.println("文件已经传输完毕");
			
		}else{
			System.out.println("失败");
		}
	}

	/**
	 * @return 文件传输的进度
	 */
	public long getOffsetLength() {
		return this.offsetLength;
	}

	/**
	 * 线程关闭
	 * 
	 */
	public void destroy() {
		// 如果跳出循环 表示这里要已经接收完毕 可以关闭资源了
		// System.out.println("服务器 : 数据传输中断 开始善后");
		try {
			if (this.in != null) {
				this.in.close();
			}
			if (this.din != null) {
				this.din.close();
			}
			if (this.out != null) {
				this.out.close();
			}
			if (this.dout != null) {
				this.dout.close();
			}
			if (this.random != null) {
				this.random.close();
			}
			if (this.s != null) {
				this.s.close();
			}
		} catch (Exception e) {
			System.err.println("关闭线程发成异常！");
		}
	}

	public void run() {
		
		try {
			System.out.println("rrrrrrrrrrrrrrrrrr");
			this.init();
			this.auth();
			this.transfer();
		
		} catch (Exception e) {
			System.err.println("访问服务器传输数据发生异常！");
			e.printStackTrace();
		} finally {
			this.destroy();
		}
	}
	/**
	 * 暂停
	 */
	public void stop(){
		try {
		  this.con=true;
//		  ConfigHelper.isStopUpload = true;
		} catch (Exception e) {
			System.err.print("客户端暂停！");
			e.printStackTrace();
		}
	}
	
	/**
	 * 开始
	 */
	public void begin(){
		this.con=false;
//		ConfigHelper.isStopUpload = false;
	}

	public boolean isFinish() {
		return isFinish;
	}

	public void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}
	
}
