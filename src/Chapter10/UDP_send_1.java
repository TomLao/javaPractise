package Chapter10;

import java.net.*;
import java.util.Scanner;

//���Ͷ�

public class UDP_send_1 {

	public static void main(String[] args) throws Exception {
		DatagramSocket dSocket = new DatagramSocket(6666);	//ָ���˿�
		String string = "afsdasdfasdffasdfasdf";
		Scanner scanner = new Scanner(System.in);
		/**
		 * ����һ��Ҫ���͵����ݰ����������ݣ����ȣ�ip���˿�
		 */
		for (int i = 0; i < 5; i++) {
			string = scanner.nextLine();
			DatagramPacket dPacket = new DatagramPacket(string.getBytes(), string.length(),
					InetAddress.getByName("localhost"), 6789);
			System.out.println("������Ϣ");
			dSocket.send(dPacket);
		}
		dSocket.close();
	}
}
