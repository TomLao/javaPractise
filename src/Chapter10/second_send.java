package Chapter10;

import java.io.*;
import java.net.*;

public class second_send {

	public static void main(String[] args) throws Exception {
		// // TODO Auto-generated method stub
		// InputStreamReader isr=new InputStreamReader(System.in);
		DatagramSocket dSocket = new DatagramSocket(3000); // 绑定端口3000
		String str = "hello world!";
		
		// 以8001端口发送
		DatagramPacket dPacket = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(), 8001); 

		dSocket.send(dPacket);	//发送出去
		dSocket.close();
	}

}
