package Chapter05;

//ģ���������й��˺������ˡ����Ӻ͵���

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
				synchronized (chopsticks) {	//ͬ������飬chopsticks������
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
		
		//�������໥���жԷ�������ִ��ʱ�Ῠס
		new Thread(new DeadLockThread(true),"�й���").start();
		new Thread(new DeadLockThread(false),"�׹���").start();

	}
}

