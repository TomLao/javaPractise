package Chapter08;

import java.io.*;

public class TransStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in = System.in;	//获取键盘录入对象
		InputStreamReader isr =new InputStreamReader(in);//将字节流转为字符流对象
		BufferedReader bufr=new BufferedReader(isr);//提高效率，用字符串进行缓冲区操作
		String line =null;
		while((line=bufr.readLine())!=null) {
			if(line.equals("over"))
				break;
			System.out.println(line.toUpperCase());
		}
		bufr.close();
	}

}
