package Chapter03;

//����һ��ѧ����
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
		System.out.println("ѧ��1�������ǣ�" + stu1.getName() + ",�ɼ��ǣ�" + stu1.getGrade());
		System.out.println("ѧ��2�������ǣ�" + stu2.getName() + ",�ɼ��ǣ�" + stu2.getGrade());
	}

}
