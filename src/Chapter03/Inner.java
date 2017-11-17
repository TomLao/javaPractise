package Chapter03;

/**
 * Title:Outer_Inner类<br>
 * Description:三种内部类定义方式:1,不同内部类，2,静态内部类，3,方法内部类
 * @author Heze
 * @version 1.0
 *
 */

/**
 * 1,普通外部类中包含内部类
 * @param name 普通内部类
 * @param num 数量
 * @return null
 *
 */

class Outer{
	private int num=4;
	public void test() {
		Inner inner=new Inner();
		inner.show();
	}
	//定义内部类
	class Inner{
		//在内部类中定义方法
		void show() {
			System.out.println("num="+num);//访问外部类成员
		}
	}
}

//2,外部类包含静态内部类
class Outer_Static{
	private static int num=6;
	static class Inner{
		void show() {
			System.out.println("num="+num);//静态内部类
		}
	}
}

//3,方法内部类：成员方法中定义内部类
class Outer_Method{
	private int num=8;
	public void test() {
		//成员方法中定义内部类
		class Inner{
			void show() {
				System.out.println("num="+num);
			}
		}
		Inner inner=new Inner();
		inner.show();
	}
}
public class Inner {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法1：定义外部类对象后通过外部类访问内部类方法
		Outer outer=new Outer();
		outer.test();
		
		//方法2：创建内部类对象
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
		
		//创建静态内部类对象
		Outer_Static.Inner inner2=new Outer_Static.Inner();
		inner2.show();
		
		//创建外部类对象，调用方法并创建方法内部类
		Outer_Method outer2=new Outer_Method();
		outer2.test();
	}

}