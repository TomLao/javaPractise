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

�ң���Ҫ�뷨��ÿ����̨��һ���̣߳�һ��ȡ�Ż���һ���߳�
��ÿ����̨��һ��ȡ�Ż���ͬʱ�����У����Ǹ����̣�
����ö��̣߳�ȡ�Ż�ͬʱ���ţ���̨�к�
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
		// new callingSystem();
		Client client = new Client(); // ���ϵͳ
	}

	public boolean isCallVip() {
		double count = 0;
		// ͳ�Ƶ�ǰ������ͨ�ͻ���
		for (int i = 0; i < maxWindow; i++) {
			if (bankWindows[i].getTicket() != null && !((bankWindows[i].getTicket()).isVip()))
				count++;
		}
		return (count / maxWindow) >= 0.3 ? false : true;// ������ͨ�û�������0.3
	}

	// TO DO LIST,ͬ�r��vip����ͨʧ��

	// �������̣߳������߳�
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
							else if (bankWindows[i].isNotClient() && !normalQueue.isEmpty()) { // �ô���û��
								bankWindows[i].setTicket(normalQueue.poll());
							}
						}
					}
				}
			}
		}
	}

	// ���
	public void addNormalClient(String kindsOfClient) {
		synchronized (this) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
			if (kindsOfClient == "normal") {
				System.out.println("��ͨ�ͻ������ǵ� " + (++currentTicket) + " ��Ʊ�����Ե�");
				normalQueue.offer(new Ticket(currentTicket, false)); // ���
			} else {
				System.out.println("����vip�ͻ������ǵ� " + (++currentTicket) + " ��Ʊ�����Ե�");
				vipQueue.offer(new Ticket(currentTicket, true));
			}
		}
	}
}
