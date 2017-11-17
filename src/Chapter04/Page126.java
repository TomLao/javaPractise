package Chapter04;
//126页，接口
interface Animal2{
	int ID=1;		//定义全局变量
	void breathe();	//定义抽象方法breathe（）
	void run();		//定义抽象方法run()
}

class Dog2 implements Animal2{
	public void breathe() {
		System.out.println("breathing");
	}
	public void run() {
		System.out.println("running");
	}
}
public class Page126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog=new Dog2();
		dog.breathe();
		dog.run();
	}

}