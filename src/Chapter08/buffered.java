package Chapter08;

import java.io.*;

import javax.management.RuntimeErrorException;

public class buffered {

	public static void main(String[] args){
//		//�������ĳ�����Ϊ�����������Ч��
//		//�ڴ���������ǰҪ����������
//		FileWriter fw=new FileWriter("IOdemo.txt");
//		
//		//���������ļ��������������
//		BufferedWriter bufw=new BufferedWriter(fw);
//		
//		bufw.write("abcd");
//		
//		//�رջ������������ڹرջ������е������󣬲���fw.close();
//		bufw.close();
		
		//ͨ��buffered�����ļ�
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		try {
			bufr =new BufferedReader(new FileReader("IOdemo.txt"));
			bufw=new BufferedWriter(new FileWriter("buffered_copy"));
			String line=null;
			//readLine�������κλ��ŷ�
			while((line=bufr.readLine())!=null) {
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}			
		}
		catch(IOException e) {
			throw new RuntimeException("��дʧ��");
		}
		finally {
			try {
				if(bufr!=null)
					bufr.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("��ȡ�ر�ʧ��");
			}
		}
	}
}
