package Chapter03;

//����ģʽ
//˽�й��캯��
//��̬���Լ�new�Լ�,Ȼ��Ż��Լ�new�Ķ���
class Single{
	private static Single INSTANCE=new Single();
	private Single() {}
	public static Single GetInstance() {
		return INSTANCE;
	}
}
public class SingleDesign {
	public static void main(String[] args) {
		Single s1=Single.GetInstance();
		Single s2=Single.GetInstance();
		System.out.println(s1==s2);;
	}
}