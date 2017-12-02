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

我：主要想法：每个柜台是一个线程，一个取号机是一个线程
即每个柜台和一个取号机在同时工作中，都是个进程，
处理好多线程，取号机同时发号，柜台叫号
 */
package Experiment04;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class callingSystem extends Thread {
	private int maxTicket = 200;
	private int maxWindow = 5;
	private int currentTicket = 0;
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
		// new callingSystem();
		Client client = new Client(); // 领号系统
	}

	public boolean isCallVip() {
		double count = 0;
		// 统计当前窗口普通客户数
		for (int i = 0; i < maxWindow; i++) {
			if (bankWindows[i].getTicket() != null && !((bankWindows[i].getTicket()).isVip()))
				count++;
		}
		return (count / maxWindow) >= 0.3 ? false : true;// 保持普通用户不少于0.3
	}

	// TO DO LIST,同時叫vip和普通失敗

	// 启用主线程，银行线程
	public void run() {
		while (true) {
			synchronized (this) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				for (int i = 0; i < maxWindow; i++) {
					if (bankWindows[i].isNotClient() && (!vipQueue.isEmpty() || !normalQueue.isEmpty())) {
						synchronized (this) {
							try {
								Thread.sleep(10);
							} catch (InterruptedException e1) {
								// TODO: handle exception
								e1.printStackTrace();
							}
							if ((!vipQueue.isEmpty() || !normalQueue.isEmpty()) && bankWindows[i].isNotClient()
									&& isCallVip() && !vipQueue.isEmpty())
								// if (bankWindows[i].isNotClient()&& !vipQueue.isEmpty())
								bankWindows[i].setTicket(vipQueue.poll());
							else if (bankWindows[i].isNotClient() && !normalQueue.isEmpty()) { // 该窗口没人
								bankWindows[i].setTicket(normalQueue.poll());
							}
						}
					}
				}
			}
		}
	}

	// 入队
	public void addNormalClient(String kindsOfClient) {
		synchronized (this) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
			if (kindsOfClient == "normal") {
				System.out.println("普通客户，您是第 " + (++currentTicket) + " 号票，请稍等");
				normalQueue.offer(new Ticket(currentTicket, false)); // 入队
			} else {
				System.out.println("尊贵的vip客户，您是第 " + (++currentTicket) + " 号票，请稍等");
				vipQueue.offer(new Ticket(currentTicket, true));
			}
		}
	}
}
