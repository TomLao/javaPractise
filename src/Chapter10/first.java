package Chapter10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class first {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//ʹ��InetAddress���ȡ���ؼ������IP��ַ����������www.oracle.com��IP
		
		InetAddress localAddress=InetAddress.getLocalHost();	//��ȡ����ip
		InetAddress oracleAddress=InetAddress.getByName("www.tomlao.xin");
		
		System.out.println("��������IP��"+localAddress.getHostAddress());
		System.out.println("������������"+localAddress.getHostName());
		System.out.println("oracle��ip:"+oracleAddress.getHostAddress());
	}

}
