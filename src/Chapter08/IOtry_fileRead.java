package Chapter08;

import java.io.*;

public class IOtry_fileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//要保证该文件是已经存在的，如果不存在会发生异常FileNotFoundException
		FileReader fr=new FileReader("IOdemo.txt");
		int ch=0;
		//一个个读，读完后返回-1,返回值是int类型，然后再强制转换
		while((ch=fr.read())!=-1) {
			System.out.println("ch="+(char)ch);
		}
		fr.close();
		
		FileReader fr1=new FileReader("IOdemo.txt");
		//定义一个字符数组，用于存储读到字符
		//该read(char[])返回值是督导的字符个数
		char[] buf =new char[1024];//1024是2k
		int num=0;
		while((num=fr1.read(buf))!=-1)
			System.out.println(new String(buf,0,num));//buf的从0到num位数字
		fr1.close();
		
		//读取一个java文件并输出
		FileReader fr2=new FileReader("IOtry.java");
		num=0;
		while((num=fr2.read(buf))!=-1)
			System.out.print(new String(buf,0,num));//buf的从0到num位数字
		fr2.close();
		
		//从a中读，写入到b中
		copy();
	}
	public static void copy() {
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw=new FileWriter("b.txt");//示例，不能运行
			fr=new FileReader("a.txt");
			
			char[] cbuf=new char[1024];
			int len=0;
			while((len=fr.read(cbuf))!=-1)
				fw.write(cbuf,0,len);
		}
		catch(IOException e){
			throw new RuntimeException("读写失败");
		}
		finally {
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e2) {
					// TODO: handle exception
					
				}
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e3) {
					// TODO: handle exception
					
				}
		}
	}

}
