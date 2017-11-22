package mid_term;

import java.util.Scanner;

public class LaoHeze {

	public static boolean isValid(String password) {
		int numberChar = 0;
		int numberDigit = 0;
		int numberOthers = 0;

		for (int i = 0; i < password.length(); i++) {
			if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
					|| (password.charAt(i) == 'A' && password.charAt(i) <= 'Z'))
				numberChar++;
			else if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
				numberDigit++;
			else
				numberOthers++;
		}

		if ((numberChar + numberDigit + numberOthers < 8) || (numberOthers > 0) || (numberDigit == 0)
				|| (numberChar == 0) || (numberDigit < 2))
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		Scanner sc = new Scanner(System.in);
		password = sc.nextLine();
		if (isValid(password) == true)
			System.out.println("valid password");
		else
			System.out.println("invalid password");
	}

}
