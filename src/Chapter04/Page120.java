package Chapter04;
//120ҳ���̳�
class Animal{
	
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a dog");
	}
	
	public Animal(String name) {
		System.out.println("I am a "+name);
	}
}

class Dog extends Animal{
	public Dog() {}
}

public class Page120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
	}

}
