package Chapter03;

//������
class Father {
	private static String name = "zhangjun";
	
	// �ڲ��࣬������
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
		System.out.println("sonA�ĸ�����:" + sonA.introFather());
	}

}
