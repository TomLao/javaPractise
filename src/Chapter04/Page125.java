package Chapter04;
//125页，抽象类abstract
abstract class Animal1{
	abstract void shout();	//定义抽象方法
}

class Dog1 extends Animal1{
	void shout() {
		System.out.println("汪汪。。");
	}
}

public class Page125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dog=new Dog1();
		dog.shout();
	}

}
