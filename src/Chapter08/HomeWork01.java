package Chapter08;

import java.io.*;

public class HomeWork01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String password="";
		boolean b=false;
		for(int i=0;i<5;i++) {
			System.out.println("Please input password");
			password=br.readLine();//'\n'或'\r'换行结束
			if(password.equals("123456")) {
				System.out.println("恭喜进入游戏");
				b=true;	//标识符
				break;
			}
		}
		if(!b) {
			System.out.println("密码错误，结束游戏");
			System.exit(0);
		}
	}
}

