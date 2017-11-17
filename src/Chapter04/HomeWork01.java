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
		System.out.println("ѧ������:" + name + " ѧ�����䣺" + age);
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
		System.out.println("ѧ��ѧλ:" + degree);
	}
}

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("�ͺ���", 20);
		Undergraduate s2 = new Undergraduate("LapHeze", 20, "����");
		s1.show();
		s2.show();
	}

}
