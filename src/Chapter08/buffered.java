package Chapter08;

import java.io.*;

import javax.management.RuntimeErrorException;

public class buffered {

	public static void main(String[] args){
//		//缓冲区的出现是为了提高流操作效率
//		//在创建缓冲区前要先有流对象
//		FileWriter fw=new FileWriter("IOdemo.txt");
//		
//		//缓冲区与文件操作对象相关联
//		BufferedWriter bufw=new BufferedWriter(fw);
//		
//		bufw.write("abcd");
//		
//		//关闭缓冲区，就是在关闭缓冲区中的流对象，不用fw.close();
//		bufw.close();
		
		//通过buffered复制文件
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		try {
			bufr =new BufferedReader(new FileReader("IOdemo.txt"));
			bufw=new BufferedWriter(new FileWriter("buffered_copy"));
			String line=null;
			//readLine不包含任何换号符
			while((line=bufr.readLine())!=null) {
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}			
		}
		catch(IOException e) {
			throw new RuntimeException("读写失败");
		}
		finally {
			try {
				if(bufr!=null)
					bufr.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("读取关闭失败");
			}
		}
	}
}
