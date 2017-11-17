package Chapter04;

interface Shape {
	double area(double x);
}

class Square implements Shape {
	public double area(double x) {
		return x * x;
	}
}

class Circle implements Shape {
	public double area(double x) {
		return 3.14 * x * x;
	}
}

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square one = new Square();
		Circle two = new Circle();
		System.out.println(one.area(2));
		System.out.println(two.area(3));

	}

}
