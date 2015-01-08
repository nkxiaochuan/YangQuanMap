package ins.domain.schema.vo;


import java.io.Serializable;

/**
 * 服务器给客户端传送的简要信息
 *
 */
@SuppressWarnings("serial")
public class MsgInfoVo implements Serializable{
	//文件大小 字节
	private long size = 0;
	//文件需要发送自己的偏移量
	private long offset = 0;
	//0代表 这次数据库交互成功
	//1进行传输
	//2代表 这次交互出错
	//3代表 服务器检测到文件尾部 通知客户端准备退出
	private int state=0;
	
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public long getOffset() {
		return offset;
	}
	public void setOffset(long offset) {
		this.offset = offset;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
