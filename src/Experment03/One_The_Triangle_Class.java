package Experment03;

public class One_The_Triangle_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle(3, 4,5);
		triangle.setColor("yellow");
		triangle.setFilled(true);

		System.out.println(triangle);
		System.out.println("The area is " + triangle.getArea());
		System.out.println("The perimeter is " + triangle.getPerimeter());
		System.out.println(triangle);
	}
}

class GeometricObject {
	String color;
	boolean filled;
}

class Triangle extends GeometricObject {

	double side1, side2, side3;

	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getPerimeter() {	//得到周长
		return side1+side2+side3;
	}

	public double getArea() {		//得到面积
		//return 0.5*side1*side2*Math.sqrt(1-Math.pow((side1*side1+side2*side2-side3*side3)/2*side1*side2, 2));
		
		double p=(side1+side2+side3)/2;		//海伦公式
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}

	public void setFilled(boolean filled) {
		this.filled=filled;
	}

	public void setColor(String color) {
		this.color=color;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

}