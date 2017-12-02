package Experiment04;

//银行柜台面板
public class BankWindow extends Thread {
	
	private Ticket ticket = null;
	String thName;
	public void run() {

		while (true) {
			synchronized (this) {
				// 呼叫用户
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (ticket != null) {
					thName = Thread.currentThread().getName();
					System.out.println(ticket.getNumber() + "号用户请到" + thName + "办理业务");
					try {

						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}

					// 办公中
					thName = Thread.currentThread().getName();
					System.out.println(thName + "正在办理业务中");
					
					// 办完了
					
					try {
						Thread.sleep((int)(Math.random())%5*2000);	//随机数，在2到10秒内
//						sleep(5000);
					} catch (InterruptedException e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}
					thName = Thread.currentThread().getName();
					System.out.println(thName + " 空闲");
					ticket = null;	//置呼票为空，表示当前没人
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
