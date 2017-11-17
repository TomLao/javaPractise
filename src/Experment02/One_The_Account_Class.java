package Experment02;

import java.util.Date;

import java.text.SimpleDateFormat;

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new java.util.Date();//创建时间，非sql语句用util
	
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
//accessor mehtods粗略可以理解为get方法
//mutator methods理解为set方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate/12;	//返回monthly interest rate月利率
	}
	
	int withDraw(double amount) {	//withdraw s specified amount from the account
		if(this.balance-amount < 0)
			return 0;
		else {
			this.balance-=amount;
			return 1;
		}
	}
	
	void deposit(double amount) {	//deposit a specified amount to the account
		this.balance+=amount;
	}
}

public class One_The_Account_Class {

	public static void main(String[] args) {

		Account my = new Account();
		my.setId(1122);
		my.setBalance(20000);
		my.setAnnualInterestRate(0.045);
		
		my.withDraw(2500);
		my.deposit(3000);
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd,mm-ss");
		System.out.println("blanace:"+my.getBalance()+",monthly interest:"+my.getMonthlyInterestRate()+",data:"+now.format(my.getDateCreated()));
	}
	
}
