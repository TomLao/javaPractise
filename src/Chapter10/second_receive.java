package Chapter10;

import java.net.*;

public class second_receive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] bs=new byte[1024];	//�����ַ�������������
		DatagramSocket dSocket=new DatagramSocket(8001);	//���ն�ds���󣬵���receive()���ն���
		DatagramPacket dPacket=new DatagramPacket(bs, 1024);//��װ����
		
		System.out.println("waiting");
		dSocket.receive(dPacket);		//�ȴ�����DatagramPacket����
										//����string����ȡ�������
		String str=new String(dPacket.getData(),0,dPacket.getLength())+" "+dPacket.getAddress()+" "+dPacket.getPort();
		System.out.println(str);
		dSocket.close();
	}

}
