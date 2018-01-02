package Chapter10;

import java.net.*;

public class second_receive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] bs=new byte[1024];	//定义字符数组做缓存区
		DatagramSocket dSocket=new DatagramSocket(8001);	//接收端ds对象，调用receive()接收对象
		DatagramPacket dPacket=new DatagramPacket(bs, 1024);//封装数据
		
		System.out.println("waiting");
		dSocket.receive(dPacket);		//等待接受DatagramPacket对象
										//构建string来读取输出数据
		String str=new String(dPacket.getData(),0,dPacket.getLength())+" "+dPacket.getAddress()+" "+dPacket.getPort();
		System.out.println(str);
		dSocket.close();
	}

}
