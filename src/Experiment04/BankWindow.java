package Experiment04;

//���й�̨���
public class BankWindow extends Thread {
	
	private Ticket ticket = null;
	String thName;
	public void run() {

		while (true) {
			synchronized (this) {
				// �����û�
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (ticket != null) {
					thName = Thread.currentThread().getName();
					System.out.println(ticket.getNumber() + "���û��뵽" + thName + "����ҵ��");
					try {

						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}

					// �칫��
					thName = Thread.currentThread().getName();
					System.out.println(thName + "���ڰ���ҵ����");
					
					// ������
					
					try {
						Thread.sleep((int)(Math.random())%5*2000);	//���������2��10����
//						sleep(5000);
					} catch (InterruptedException e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}
					thName = Thread.currentThread().getName();
					System.out.println(thName + " ����");
					ticket = null;	//�ú�ƱΪ�գ���ʾ��ǰû��
				}
			}
		}
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket=ticket;
	}
	
	public Ticket getTicket() {
		return this.ticket;
	}
	
	public boolean isNotClient() {
		return ticket==null;
	}
}
