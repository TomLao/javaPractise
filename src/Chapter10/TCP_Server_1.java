package Chapter10;

import java.io.*;
import java.net.*;
import java.util.*;

//TCPЭ�飬��������
//���ڽ��տͻ��˷��͵�����

public class TCP_Server_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new TCPServer().listen(); // ����TCPServer���󣬲�����listen()����
	}
}

class TCPServer {
	private static final int PORT = 6666; // ����˿�
	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(PORT);// ����ServerSocket����
		Socket client = serverSocket.accept(); // accept()�������ܶ���
		OutputStream oStream = client.getOutputStream(); // ��ȡ�ͻ��˵������
		InputStream iStream = client.getInputStream(); // �õ��������ݵ���
		byte[] buf = new byte[1024]; // ���建����
		Scanner scanner = new Scanner(System.in);
		String string;// = scanner.nextLine();
		System.out.println("Start to interaction");
		for (int i = 0; i < 5; i++) {
			//1.console�������ͻ��˷���
//			string = scanner.nextLine();
//			oStream.write(string.getBytes());
			
			//2.console����ͻ�����Ϣ
			int len=iStream.read(buf);
			System.out.println(new String(buf, 0, len)); // ���������е��������

//			Thread.sleep(5000); // ģ��ִ����������ռ�õ�ʱ��
		}
		System.out.println("This is the end of interaction");
		oStream.close();
		client.close();
	}
}
