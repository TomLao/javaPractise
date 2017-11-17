package Chapter03;

//单例模式
//私有构造函数
//静态，自己new自己,然后放回自己new的对象
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