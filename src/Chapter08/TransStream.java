package Chapter08;

import java.io.*;

public class TransStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in = System.in;	//��ȡ����¼�����
		InputStreamReader isr =new InputStreamReader(in);//���ֽ���תΪ�ַ�������
		BufferedReader bufr=new BufferedReader(isr);//���Ч�ʣ����ַ������л���������
		String line =null;
		while((line=bufr.readLine())!=null) {
			if(line.equals("over"))
				break;
			System.out.println(line.toUpperCase());
		}
		bufr.close();
	}

}
