package mid_term;

public class MyInteger {
	int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() { // �Ƿ�ż��
		return this.value % 2 == 0;
	}

	public boolean isOdd() { // �Ƿ�����
		return this.value % 2 == 1;
	}

	public boolean isPrime() { // �Ƿ�����
		if (this.value == 1)
			return false;
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int value) { // ��ֵ���ж��Ƿ�ż��
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) { // ��ֵ���ж��Ƿ�����
		return value % 2 == 1;
	}

	public static boolean isPrime(int value) { // ��ֵ���ж��Ƿ�����
		if (value == 1)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public boolean isEven(MyInteger obj) { // ����һ��������ж�����value�Ƿ�ż��
		return isEven(obj.getValue());
	}

	public boolean isOdd(MyInteger obj) { // ����һ��������ж�����value�Ƿ�����
		return isOdd(obj.getValue());
	}

	public boolean isPrime(MyInteger obj) { // ����һ��������ж�����value�Ƿ�����
		return isPrime(obj.getValue());
	}

	public boolean equals(int value) { // �Ƿ����
		return this.value == value;
	}

	public boolean equals(MyInteger obj) {
		return equals(obj.getValue());
	}

	public static int parseInt(char number[]) {
		int i = 0, value = 0;
		while (number[i] != '\0') {
			if (number[i] >= '0' && number[i] <= '9')
				value = value * 10 + (number[i] - '0');
			else
				throw new ArithmeticException();// �׳��쳣
			i++;
		}
		return value;
	}

	public static int parseInt(String str) {
		int i = 1, value = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				value = value * 10 + (str.charAt(i) - '0');
			else
				throw new ArithmeticException();
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char number[] = { '1', '2', '3', '4', '\0' };
		String str = "1234";
		int valueChar;
		int valueString;
		try {
			valueChar = parseInt(number);
			valueString = parseInt(str);
			System.out.println("char����=" + valueChar + " string����=" + valueString);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("parseInt����ʹ�ô��󣬺��з������ַ�");
		}
	}
}
