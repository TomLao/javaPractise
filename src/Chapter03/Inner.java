package Chapter03;

/**
 * Title:Outer_Inner��<br>
 * Description:�����ڲ��ඨ�巽ʽ:1,��ͬ�ڲ��࣬2,��̬�ڲ��࣬3,�����ڲ���
 * @author Heze
 * @version 1.0
 *
 */

/**
 * 1,��ͨ�ⲿ���а����ڲ���
 * @param name ��ͨ�ڲ���
 * @param num ����
 * @return null
 *
 */

class Outer{
	private int num=4;
	public void test() {
		Inner inner=new Inner();
		inner.show();
	}
	//�����ڲ���
	class Inner{
		//���ڲ����ж��巽��
		void show() {
			System.out.println("num="+num);//�����ⲿ���Ա
		}
	}
}

//2,�ⲿ�������̬�ڲ���
class Outer_Static{
	private static int num=6;
	static class Inner{
		void show() {
			System.out.println("num="+num);//��̬�ڲ���
		}
	}
}

//3,�����ڲ��ࣺ��Ա�����ж����ڲ���
class Outer_Method{
	private int num=8;
	public void test() {
		//��Ա�����ж����ڲ���
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
		//����1�������ⲿ������ͨ���ⲿ������ڲ��෽��
		Outer outer=new Outer();
		outer.test();
		
		//����2�������ڲ������
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
		
		//������̬�ڲ������
		Outer_Static.Inner inner2=new Outer_Static.Inner();
		inner2.show();
		
		//�����ⲿ����󣬵��÷��������������ڲ���
		Outer_Method outer2=new Outer_Method();
		outer2.test();
	}

}