package Chapter10;

import java.io.*;
import java.net.*;

public class second_send {

	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		InputStreamReader isr=new InputStreamReader(System.in);
		DatagramSocket dSocket=new DatagramSocket(3000);
		String str="hello world!";
		
		DatagramPacket dPacket=new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(), 8001);
		
		dSocket.send(dPacket);
		dSocket.close();
	}

}
