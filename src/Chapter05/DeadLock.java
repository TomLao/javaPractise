package Chapter05;

//模拟死锁，中国人和美国人、筷子和刀叉

class DeadLockThread implements Runnable{
	static Object chopsticks = new Object();
	static Object knifeAndFork = new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag=flag;
	}
	
	public void run() {
		if(flag) {
			while(true) {
				synchronized (chopsticks) {	//同步代码块，chopsticks锁对象
					System.out.println(Thread.currentThread().getName()+"----chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"----knifeAndFork");
					}
				}
			}
		}
		else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"----knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"----chopsticks");
					}
				}
			}
		}
	}
}

public class DeadLock {

	public static void main(String[] args) {
		
		//这两个相互持有对方的锁，执行时会卡住
		new Thread(new DeadLockThread(true),"中国人").start();
		new Thread(new DeadLockThread(false),"米国人").start();

	}
}

