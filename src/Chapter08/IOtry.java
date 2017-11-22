package Chapter08;

import java.io.*;

public class IOtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//标准的io异常处理
		FileWriter fW=null;	//创建变量在外面，反正新建对象时错误
		try {						
			fW=new FileWriter("IOdemo.txt");//try建对象时错误，文件位置，这种创建会先删除原文件
			fW.write("abcdefg");//try写入错误，注意这是写入流，没写入文件中，
								//写入文件可以用fw.flush(),刷新流不关闭流
								//还可以fw.close(),关闭前刷新流
		}
		catch (IOException e){	//catch异常
			System.out.println(e.toString());
		}
		finally {	//如果创建成功了无论如何都要执行的close()文件
			try {
				if(fW!=null)//要在成功创建文件才能close(),加判断条件
					fW.close();//关闭文件并刷新流
			} catch (IOException e2) {	//异常处理
				// TODO: handle exception
				System.out.println(e2.toString());
			}
		}
	}

}
