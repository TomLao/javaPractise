package Chapter04;
//125ҳ��������abstract
abstract class Animal1{
	abstract void shout();	//������󷽷�
}

class Dog1 extends Animal1{
	void shout() {
		System.out.println("��������");
	}
}

public class Page125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dog=new Dog1();
		dog.shout();
	}

}
