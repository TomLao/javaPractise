package Experment02;

import javax.swing.JOptionPane;

class Loan {
	double amount, rate, period;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		this.period = period;
	}

	public double getMonthlyPayment() {
		return amount * rate * 0.01 / 12 * Math.pow((1 + rate * 0.01 / 12), (period * 12))
				/ (Math.pow(1 + rate * 0.01 / 12, period * 12) - 1);
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * period * 12;
	}

}

public class Three_LoanCalculator {

	static void Start() {
		Loan person_A = new Loan();

		getInput(person_A);

		displayOutput(person_A);

	}

	private static void displayOutput(Loan person_A) {
		System.out.println(person_A.getMonthlyPayment());
		System.out.println(person_A.getTotalPayment());
	}

	private static void getInput(Loan person_A) {
		String str;

		str = JOptionPane.showInputDialog(null, "Enter inverstment amount:");
		person_A.setAmount(Integer.parseInt(str));
		str = JOptionPane.showInputDialog(null, "Enter monthly interest rate:");
		person_A.setRate(Double.parseDouble(str));
		str = JOptionPane.showInputDialog(null, "Enter number of years:");
		person_A.setPeriod(Integer.parseInt(str));
	}

	public static void main(String[] args) {
		Start();
	}

}
