package Chapter10;

import java.io.IOException;
import java.net.*;

//UDP通信，测试网络编程
//接受端

public class UDP_receive_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024]; // 长度1024的字节数组，用于接受数据
		DatagramSocket dSocket = new DatagramSocket(6789); // 定义对象，监听端口6789
		DatagramPacket dPacket = new DatagramPacket(buf, 1024);// 定义包对象，用于接收数据
		System.out.println("waiting");
		for (int i = 0; i < 5; i++) {
			dSocket.receive(dPacket); // 等待接受数据，没有数据就阻塞
			String string = new String(dPacket.getData(), 0, dPacket.getLength()) + "from"
					+ dPacket.getAddress().getHostAddress() + ":" + dPacket.getPort();
			System.out.println(string); // 打印
		}
		dSocket.close(); // 释放资源
	}

}
