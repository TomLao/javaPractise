package Chapter10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class first {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//使用InetAddress类获取本地计算机的IP地址和主机名，www.oracle.com的IP
		
		InetAddress localAddress=InetAddress.getLocalHost();	//获取本地ip
		InetAddress oracleAddress=InetAddress.getByName("www.tomlao.xin");
		
		System.out.println("本地主机IP："+localAddress.getHostAddress());
		System.out.println("本地主机名："+localAddress.getHostName());
		System.out.println("oracle的ip:"+oracleAddress.getHostAddress());
	}

}
