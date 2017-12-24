package Chapter10;

import java.io.*;
import java.net.*;
import java.util.*;

//TCPЭ�飬�ͻ���
//����ģ�ͣ��ȿ����������������ȴ���Ȼ��ͻ������к�������˵�accept��ʼ��������
//	������������������������									��������������������������
//	|			| InputStream	 --->	OutputStream|			|
//	|   �ͻ��� 	|������������������������������ ~~~~ ����������������������������|   �������� 	|
//	|	Socket	|									|	Socket	|
//	|			| OutputStream	 <---	InputStream	|			|
//	|			|������������������������������ ~~~~ ����������������������������|			|
//	������������������������									 ������������������������

public class TCP_Client_1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new TCPClient().connect(); // ������󲢵���connect()����
	}
}

class TCPClient {
	private static final int PORT = 6666;
	public void connect() throws Exception {
		Socket client = new Socket(InetAddress.getLocalHost(), PORT);
		InputStream iStream = client.getInputStream(); // �õ��������ݵ���
		OutputStream oStream = client.getOutputStream(); // ��ȡ�ͻ��˵������
		byte[] buf = new byte[1024]; // ���建����
		Scanner scanner = new Scanner(System.in);
		String string;// = scanner.nextLine();

		for (int i = 0; i < 5; i++) {
			//���ֲ��Է�ʽ��Ӧ
			
			//1.console����ͻ�����Ϣ
//			string = scanner.nextLine();
//			int len = iStream.read(buf); // �����ݶ�����������
//			System.out.println(new String(buf, 0, len)); // ���������е��������
			
			//2.console�������ͻ��˷���
			string = scanner.nextLine();
			oStream.write(string.getBytes());
		}
		client.close();
	}
}