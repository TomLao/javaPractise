package Chapter10;

import java.io.*;
import java.net.*;
import java.util.*;

//TCP协议，服务器端
//用于接收客户端发送的数据

public class TCP_Server_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new TCPServer().listen(); // 创建TCPServer对象，并调用listen()方法
	}
}

class TCPServer {
	private static final int PORT = 6666; // 定义端口
	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(PORT);// 创建ServerSocket对象
		Socket client = serverSocket.accept(); // accept()方法接受对象
		OutputStream oStream = client.getOutputStream(); // 获取客户端的输出流
		InputStream iStream = client.getInputStream(); // 得到接受数据的流
		byte[] buf = new byte[1024]; // 定义缓冲区
		Scanner scanner = new Scanner(System.in);
		String string;// = scanner.nextLine();
		System.out.println("Start to interaction");
		for (int i = 0; i < 5; i++) {
			//1.console输入后向客户端发送
//			string = scanner.nextLine();
//			oStream.write(string.getBytes());
			
			//2.console输出客户端信息
			int len=iStream.read(buf);
			System.out.println(new String(buf, 0, len)); // 将缓冲区中的数据输出

//			Thread.sleep(5000); // 模拟执行其他功能占用的时间
		}
		System.out.println("This is the end of interaction");
		oStream.close();
		client.close();
	}
}
