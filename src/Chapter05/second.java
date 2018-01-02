package Chapter05;

class MyThread implements Runnable{
	int i=0;
	public void run() {
		while(true) {
			i++;
			if(i<50) {
				System.out.println("new");
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else
				break;
		}
	}
}

public class second {

	public static void main(String[] args) {
		MyThread myT=new MyThread();
		int i=0;
		new Thread(myT).start();
		while(true) {
			i++;
			if(i<100) {
				System.out.println("main");
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
				break;
		}
	}
}
