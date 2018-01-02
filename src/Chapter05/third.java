package Chapter05;

class MyThread2 implements Runnable{
	private int exams=80;
	public void run() {
		while(true) {
			if(exams>0) {
//				Thread d=;
				System.out.println(Thread.currentThread().getName()+"姝ｅ湪鍒嗗彂绗�"+exams--+"浠借瘯鍗凤紒");
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt2=new MyThread2();
		new Thread(mt2,"鑰佸笀a").start();	
		new Thread(mt2,"鑰佸笀b").start();
		new Thread(mt2,"鑰佸笀c").start();
		new Thread(mt2,"鑰佸笀d").start();
	}
}
