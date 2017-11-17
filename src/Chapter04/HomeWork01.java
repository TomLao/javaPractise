package Chapter04;

class Student {
	
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("学生姓名:" + name + " 学生年龄：" + age);
	}
}

class Undergraduate extends Student {

	String degree;

	public Undergraduate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}

	public void show() {
		super.show();
		System.out.println("学生学位:" + degree);
	}
}

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("劳和泽", 20);
		Undergraduate s2 = new Undergraduate("LapHeze", 20, "本科");
		s1.show();
		s2.show();
	}

}
