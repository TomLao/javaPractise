package Chapter05;

class addThread extends Thread {
	private int sum;
	private int begin;

	public int getSum() {
		System.out.println(sum);
		return sum;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = begin; i < begin + 10; i++)
			sum += i;
	}

	public addThread(int begin) {
		super();
		this.sum = 0;
		this.begin = begin;
	}
}

public class HomeWork01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		addThread[] sumThread = new addThread[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sumThread[i] = new addThread(i * 10 + 1);
			sumThread[i].start();
		}
		for (int i = 0; i < 10; i++) {
			sumThread[i].join();
		}
		for (int i = 0; i < 10; i++) {
			sum += sumThread[i].getSum();
		} 
		System.out.println(sum);
	}
}
