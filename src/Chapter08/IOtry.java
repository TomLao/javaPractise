package Chapter08;

import java.io.*;

public class IOtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��׼��io�쳣����
		FileWriter fW=null;	//�������������棬�����½�����ʱ����
		try {						
			fW=new FileWriter("IOdemo.txt");//try������ʱ�����ļ�λ�ã����ִ�������ɾ��ԭ�ļ�
			fW.write("abcdefg");//tryд�����ע������д������ûд���ļ��У�
								//д���ļ�������fw.flush(),ˢ�������ر���
								//������fw.close(),�ر�ǰˢ����
		}
		catch (IOException e){	//catch�쳣
			System.out.println(e.toString());
		}
		finally {	//��������ɹ���������ζ�Ҫִ�е�close()�ļ�
			try {
				if(fW!=null)//Ҫ�ڳɹ������ļ�����close(),���ж�����
					fW.close();//�ر��ļ���ˢ����
			} catch (IOException e2) {	//�쳣����
				// TODO: handle exception
				System.out.println(e2.toString());
			}
		}
	}

}
