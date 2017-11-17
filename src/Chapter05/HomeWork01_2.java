package Chapter05;
class Add extends Thread{
	private int sum=0;
	private int nowSum;
	private int begin;

	public Add() {}
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		nowSum=sum;
		if(nowSum==100) {
			System.out.println(sum);
		}
		sum+=10;
	}
}
public class HomeWork01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add=new Add();
		for(int i=1;i<=10;i++)
			add.start();
	}

}
