package Chapter05;

public class forth extends Thread{

	private int startNum;
	public static int sum;
	
	public forth(int startNum) {
		this.startNum=startNum;
	}
	
	
	public static synchronized void add(int num) {
		sum+=num;
	}
	
	public void run() {
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=startNum+i;
		}
		add(sum);	
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread[] threadList = new Thread[10];	
		for(int i=0;i<10;i++) {
			threadList[i]=new forth(10*i+1);
			threadList[i].start();
		}
		for(int i=0;i<10;i++) {
			threadList[i].join();
			//Waits for this thread to die.
			//An invocation of this method behaves in exactly the same way as the invocation
		}
		System.out.println("sum is: "+sum);
	}
}
