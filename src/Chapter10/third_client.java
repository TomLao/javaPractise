package Chapter10;

import java.io.*;
import java.net.*;

public class third_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new TCP_Client().connect();
	}

}
class TCP_Client{
	public void connect()throws Exception{
		Socket client=new Socket(InetAddress.getLocalHost(), 8002);
		InputStream is=client.getInputStream();	//建立socket与流的联系
		byte[] buf=new byte[1024];
		int len=is.read(buf);		//用流读取
		System.out.println(new String(buf,0,len));
		client.close();
	}
}
