package Chapter08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class second {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// ��װ�����ַ���
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String password = "";
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			System.out.println("input you password");
			password = bfr.readLine(); // ��ϵͳ��׼�������ж�ȡһ��
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
