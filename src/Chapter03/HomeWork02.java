package Chapter03;

//父亲类
class Father {
	private static String name = "zhangjun";
	
	// 内部类，儿子类
	class Child {
		public String introFather() {
			return name;
		}
	}
}

public class HomeWork02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father.Child sonA = new Father().new Child();
		System.out.println("sonA的父亲是:" + sonA.introFather());
	}

}
