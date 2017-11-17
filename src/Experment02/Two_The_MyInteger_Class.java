package Experment02;

class MyInteger {
	int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	boolean isEven() { // 是否偶数
		if (this.value % 2 == 1)
			return false;
		else
			return true;
	}

	boolean isOdd() { // 是否奇数
		if (this.value % 2 == 1)
			return true;
		else
			return false;
	}

	boolean isPrime() { // 是否素数
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}

	static boolean isEven(int x) { // 传值来判断是否偶数
		if (x % 2 == 1)
			return false;
		else
			return true;
	}

	static boolean isOdd(int x) { // 传值来判断是否奇数
		if (x % 2 == 1)
			return true;
		else
			return false;
	}

	static boolean isPrime(int x) { // 传值来判断是否素数
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	boolean isEven(MyInteger temp) { // 传另一个类进来判断它的value是否偶数
		if (temp.value % 2 == 1)
			return false;
		else
			return true;
	}

	boolean isOdd(MyInteger temp) { // 传另一个类进来判断它的value是否奇数
		if (temp.value % 2 == 1)
			return true;
		else
			return false;
	}

	boolean isPrime(MyInteger temp) { // 传另一个类进来判断它的value是否素数
		for (int i = 2; i < temp.value; i++) {
			if (temp.value % i == 0)
				return false;
		}
		return true;
	}

	boolean equals(int x) { // 是否相等
		if (x == this.value)
			return true;
		else
			return false;
	}

	boolean equals(MyInteger temp) {
		if (this.value == temp.value)
			return true;
		else
			return false;
	}

	void parseInt(char Array[]) {
		this.value = Array.length; // 数组长度赋值value
	}

	void parseInt(String str) {
		this.value = str.length();
	}
}

public class Two_The_MyInteger_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger one=new MyInteger(3);
		System.out.println(one.getValue());
		System.out.println(one.isEven());
		System.out.println(one.isOdd());
		System.out.println(one.isPrime());
		
		System.out.println(MyInteger.isEven(6));
		System.out.println(MyInteger.isOdd(6));
		System.out.println(MyInteger.isPrime(6));
		
		MyInteger two= new MyInteger(10);
		System.out.println(one.isEven(two));
		System.out.println(one.isOdd(two));
		System.out.println(one.isPrime(two));
		
		System.out.println(one.equals(3));
		System.out.println(one.equals(two));
		
		char a[]= {'a','b'};
		one.parseInt(a);
		
		String str="I am Heze!";
		one.parseInt(str);
	}

}
