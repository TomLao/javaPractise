package Chapter08;

import java.io.*;

public class HomeWork01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String password="";
		boolean b=false;
		for(int i=0;i<5;i++) {
			System.out.println("Please input password");
			password=br.readLine();//'\n'��'\r'���н���
			if(password.equals("123456")) {
				System.out.println("��ϲ������Ϸ");
				b=true;	//��ʶ��
				break;
			}
		}
		if(!b) {
			System.out.println("������󣬽�����Ϸ");
			System.exit(0);
		}
	}
}

