package Experiment04;

//Æ±Àà
public class Ticket {
	private int number;
	private boolean is_vip;

	public Ticket(int number, boolean is_vip) {
		this.number = number;
		this.is_vip = is_vip;
	}

	public int getNumber() {
		return this.number;
	}

	public boolean isVip() {
		return this.is_vip;	//ÊÇ·ñévip
	}
}