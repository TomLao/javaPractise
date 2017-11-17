package Chapter03;

//构建一个学生类
class Student {
	private String name;
	private int grade;

	public Student() {
	}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}

public class HomeWork01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student("Lao", 100);
		stu1.setGrade(99);
		stu1.setName("Heze");
		System.out.println("学生1的名字是：" + stu1.getName() + ",成绩是：" + stu1.getGrade());
		System.out.println("学生2的名字是：" + stu2.getName() + ",成绩是：" + stu2.getGrade());
	}

}
