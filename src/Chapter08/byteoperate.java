//����һ��ͼƬ,���ֽ�������

package Chapter08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteoperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("E:\\pictures\\����.JPG");
			fos=new FileOutputStream("E:\\pictures\\1my.jpg");
			byte[] buf=new byte[1024];//���ֽ���������
			int len=0;
			while((len=fis.read(buf))!=-1)
				fos.write(buf,0,len);
		}
		catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException("�����ļ�ʧ��");
		}
		finally {
			try {
				if(fis!=null)
					fis.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("��ȡ�ر�ʧ��");
			}
			try {
				if(fos!=null)
					fos.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("д��ر�ʧ��");
			}
		}
	}

}
