package Chapter08;

import java.io.*;

public class IOtry_fileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Ҫ��֤���ļ����Ѿ����ڵģ���������ڻᷢ���쳣FileNotFoundException
		FileReader fr=new FileReader("IOdemo.txt");
		int ch=0;
		//һ������������󷵻�-1,����ֵ��int���ͣ�Ȼ����ǿ��ת��
		while((ch=fr.read())!=-1) {
			System.out.println("ch="+(char)ch);
		}
		fr.close();
		
		FileReader fr1=new FileReader("IOdemo.txt");
		//����һ���ַ����飬���ڴ洢�����ַ�
		//��read(char[])����ֵ�Ƕ������ַ�����
		char[] buf =new char[1024];//1024��2k
		int num=0;
		while((num=fr1.read(buf))!=-1)
			System.out.println(new String(buf,0,num));//buf�Ĵ�0��numλ����
		fr1.close();
		
		//��ȡһ��java�ļ������
		FileReader fr2=new FileReader("IOtry.java");
		num=0;
		while((num=fr2.read(buf))!=-1)
			System.out.print(new String(buf,0,num));//buf�Ĵ�0��numλ����
		fr2.close();
		
		//��a�ж���д�뵽b��
		copy();
	}
	public static void copy() {
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw=new FileWriter("b.txt");//ʾ������������
			fr=new FileReader("a.txt");
			
			char[] cbuf=new char[1024];
			int len=0;
			while((len=fr.read(cbuf))!=-1)
				fw.write(cbuf,0,len);
		}
		catch(IOException e){
			throw new RuntimeException("��дʧ��");
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
