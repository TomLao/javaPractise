/*
 * �����ź�ϵͳ

�ܶ������ڰ���ҵ���ʱ��������Դ���ޣ���Թ˿ͽ����źš�
���лῪ���ɸ����ڰ���ҵ��
���˿ͽ������а���ҵ��ʱ���ᱻҪ��ȡ�Ż�ȡһ���ţ�
���ڿ���ʱ����нкţ��кŻᰴ˳����У�һ����˵�����õ����ȱ��е���
VIP�ͻ��õ��ĺŻ�������������ͨ�ͻ���������ȱ��е���
VIP�ͻ�֮��һ���и��Ⱥ�˳��һ�����ú��ȱ��е���
������Σ���Ҫ���ٱ�֤30%���ҵĴ����ڰ�����ͨ�ͻ���ҵ�񣬼���������ͨ�ͻ������ڵȴ���
�еĴ��ڲ���Ա���ܻ���;��Ϣ������ͣ����ҵ��
�����������������õ��ŵĿͻ���ҵ������°ࣻ
��ҵ�����ܴ�ʱ����ֹͣȡ�š�

�в����׵ĵط��뵽����ȥ����鿴������

��дһ�����򣬶����е�����ҵ���������ģ�⣬����ʾģ������
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
	private BankWindow[] bankWindows = new BankWindow[maxWindow]; // ���崰������

	public callingSystem() {
		super();
		this.start();
		for (int i = 0; i < maxWindow; i++) {
			this.bankWindows[i] = new BankWindow(); // ���崰�ڶ���
			new Thread(this.bankWindows[i], "����" + (i + 1)).start();
			// this.bankWindows[i].start(); //�����߳�����
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ticket t=new Ticket();
		// new Thread(t,"ȡ��").run();
		new callingSystem();
	}

	// �������̣߳������߳�
	public void run() {
		while (true) {
			Thread thread = Thread.currentThread();
			String thName = thread.getName();
			System.out.println(thName + "�߳���������");
		}
	}

}
