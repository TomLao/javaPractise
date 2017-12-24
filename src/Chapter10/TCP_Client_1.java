package Chapter10;

import java.io.*;
import java.net.*;
import java.util.*;

//TCP协议，客户端
//大致模型，先开启服务器端阻塞等待，然后客户端运行后服务器端的accept开始接受运行
//	————————————									—————————————
//	|			| InputStream	 --->	OutputStream|			|
//	|   客户端 	|——————————————— ~~~~ ——————————————|   服务器端 	|
//	|	Socket	|									|	Socket	|
//	|			| OutputStream	 <---	InputStream	|			|
//	|			|——————————————— ~~~~ ——————————————|			|
//	————————————									 ————————————

public class TCP_Client_1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new TCPClient().connect(); // 定义对象并调用connect()方法
	}
}

class TCPClient {
	private static final int PORT = 6666;
	public void connect() throws Exception {
		Socket client = new Socket(InetAddress.getLocalHost(), PORT);
		InputStream iStream = client.getInputStream(); // 得到接受数据的流
		OutputStream oStream = client.getOutputStream(); // 获取客户端的输出流
		byte[] buf = new byte[1024]; // 定义缓冲区
		Scanner scanner = new Scanner(System.in);
		String string;// = scanner.nextLine();

		for (int i = 0; i < 5; i++) {
			//两种测试方式对应
			
			//1.console输出客户端信息
//			string = scanner.nextLine();
//			int len = iStream.read(buf); // 将数据读到缓冲区中
//			System.out.println(new String(buf, 0, len)); // 将缓冲区中的数据输出
			
			//2.console输入后向客户端发送
			string = scanner.nextLine();
			oStream.write(string.getBytes());
		}
		client.close();
	}
}