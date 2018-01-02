package Chapter08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class second {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 包装输入字符流
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String password = "";
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			System.out.println("input you password");
			password = bfr.readLine(); // 从系统标准输入流中读取一行
			if (password.equals("123456")) {
				System.out.println("congralation");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("fail, game over");
			System.exit(0);
		}
	}

}
