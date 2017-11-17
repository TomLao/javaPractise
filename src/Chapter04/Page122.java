package Chapter04;
//123页，final修饰关键字
class Student1{
	final String name="Heze";	//final修饰的变量要预先设定好，不能改变
	public void introduce() {
		System.out.println("我的名字叫"+name);
	}
}
public class Page122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student=new Student1();
		student.introduce();
		
	}

}
