package Chapter10;

import java.io.IOException;
import java.net.*;

//UDPͨ�ţ�����������
//���ܶ�

public class UDP_receive_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024]; // ����1024���ֽ����飬���ڽ�������
		DatagramSocket dSocket = new DatagramSocket(6789); // ������󣬼����˿�6789
		DatagramPacket dPacket = new DatagramPacket(buf, 1024);// ������������ڽ�������
		System.out.println("waiting");
		for (int i = 0; i < 5; i++) {
			dSocket.receive(dPacket); // �ȴ��������ݣ�û�����ݾ�����
			String string = new String(dPacket.getData(), 0, dPacket.getLength()) + "from"
					+ dPacket.getAddress().getHostAddress() + ":" + dPacket.getPort();
			System.out.println(string); // ��ӡ
		}
		dSocket.close(); // �ͷ���Դ
	}

}
