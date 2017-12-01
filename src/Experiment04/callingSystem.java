/*
 * 银行排号系统

很多银行在办理业务的时候，由于资源有限，会对顾客进行排号。
银行会开若干个窗口办理业务；
当顾客进入银行办理业务时，会被要求到取号机取一个号；
窗口空闲时会进行叫号，叫号会按顺序进行，一般来说是先拿到号先被叫到；
VIP客户拿到的号会优先于所有普通客户，最可能先被叫到；
VIP客户之间一样有个先后顺序，一般先拿号先被叫到；
无论如何，都要至少保证30%左右的窗口在办理普通客户的业务，即不能让普通客户无限期等待；
有的窗口操作员可能会中途休息，即暂停办理业务；
当天必需办理完所有拿到号的客户的业务才能下班；
当业务量很大时，会停止取号。

有不明白的地方请到银行去亲身查看！！！

请写一个程序，对银行的这种业务现象进行模拟，并显示模拟结果。
 */
package Experiment04;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class callingSystem extends Thread {
	private int maxTicket = 200;
	private int maxWindow = 5;
	private Queue<Ticket> normalQueue = new LinkedList<Ticket>();
	private Queue<Ticket> vipQueue = new LinkedList<Ticket>();
	private BankWindow[] bankWindows = new BankWindow[maxWindow]; // 定义窗口数组

	public callingSystem() {
		super();
		this.start();
		for (int i = 0; i < maxWindow; i++) {
			this.bankWindows[i] = new BankWindow(); // 定义窗口对象
			new Thread(this.bankWindows[i], "窗口" + (i + 1)).start();
			// this.bankWindows[i].start(); //窗口线程启用
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ticket t=new Ticket();
		// new Thread(t,"取号").run();
		new callingSystem();
	}

	// 启用主线程，银行线程
	public void run() {
		while (true) {
			Thread thread = Thread.currentThread();
			String thName = thread.getName();
			System.out.println(thName + "线程正在运行");
		}
	}

}
