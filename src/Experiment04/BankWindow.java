package Experiment04;

public class BankWindow extends Thread {

	// public BankWindow(int i) {
	// // TODO Auto-generated constructor stub
	// this.currentThread()
	// }
	public void run() {
		while (true) {
			Thread thread = Thread.currentThread();
			String thName = thread.getName();
			System.out.println(thName + "正在运行");
		}
	}

}
