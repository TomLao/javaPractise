package Experiment04;

import java.io.IOException;

public class Ticket extends Thread {
	private int totalTickets=500;
	int input;
	int currentTicket=1;
	public void run() {
		while(true) {
			System.out.print("ȡ�ţ�");
			try {
				input=System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(input=='1') {
				Thread thread=Thread.currentThread();
				String thName=thread.getName();
				System.out.println(thName+"���ڷ��� "+(currentTicket++)+" ��Ʊ");
			}
		}
	}
}
