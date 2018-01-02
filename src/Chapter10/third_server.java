package Chapter10;

import java.io.OutputStream;
import java.net.*;

public class third_server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new TCP_Server().listen();
	}
}

class TCP_Server {
	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(8002);
		Socket client = serverSocket.accept();
		OutputStream os = client.getOutputStream();
		os.write("hello world!".getBytes()); // 向客户端输出

		Thread.sleep(500);
		os.close();
		client.close();
	}
}