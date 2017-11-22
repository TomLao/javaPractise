package mid_term;

public class MyInteger {
	int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() { // 是否偶数
		return this.value % 2 == 0;
	}

	public boolean isOdd() { // 是否奇数
		return this.value % 2 == 1;
	}

	public boolean isPrime() { // 是否素数
		if (this.value == 1)
			return false;
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int value) { // 传值来判断是否偶数
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) { // 传值来判断是否奇数
		return value % 2 == 1;
	}

	public static boolean isPrime(int value) { // 传值来判断是否素数
		if (value == 1)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public boolean isEven(MyInteger obj) { // 传另一个类进来判断它的value是否偶数
		return isEven(obj.getValue());
	}

	public boolean isOdd(MyInteger obj) { // 传另一个类进来判断它的value是否奇数
		return isOdd(obj.getValue());
	}

	public boolean isPrime(MyInteger obj) { // 传另一个类进来判断它的value是否素数
		return isPrime(obj.getValue());
	}

	public boolean equals(int value) { // 是否相等
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
				throw new ArithmeticException();// 抛出异常
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
			System.out.println("char数组=" + valueChar + " string数组=" + valueString);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("parseInt函数使用错误，含有非数字字符");
		}
	}
}
