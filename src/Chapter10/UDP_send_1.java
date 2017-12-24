package Chapter10;

import java.net.*;
import java.util.Scanner;

//发送端

public class UDP_send_1 {

	public static void main(String[] args) throws Exception {
		DatagramSocket dSocket = new DatagramSocket(6666);	//指定端口
		String string = "afsdasdfasdffasdfasdf";
		Scanner scanner = new Scanner(System.in);
		/**
		 * 创建一个要发送的数据包，包括数据，长度，ip，端口
		 */
		for (int i = 0; i < 5; i++) {
			string = scanner.nextLine();
			DatagramPacket dPacket = new DatagramPacket(string.getBytes(), string.length(),
					InetAddress.getByName("localhost"), 6789);
			System.out.println("发送信息");
			dSocket.send(dPacket);
		}
		dSocket.close();
	}
}
