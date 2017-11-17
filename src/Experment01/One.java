package Experment01;

import javax.swing.JOptionPane;

public class One {

	public static void main(String[] args) {
		String str;
		str = JOptionPane.showInputDialog(null, "Enter inverstment amount:");
		int investmentAmount = Integer.parseInt(str);
		str = JOptionPane.showInputDialog(null, "Enter monthly interest rate:");
		double monthlyInterestRate = Double.parseDouble(str);
		str = JOptionPane.showInputDialog(null, "Enter number of years:");
		int numberOfYears = Integer.parseInt(str);

		double futureInvestmentValue = investmentAmount
				* Math.pow(1 + monthlyInterestRate / 12 * 0.01, numberOfYears * 12);
		System.out.println("Accumulated value is:" + futureInvestmentValue);
	}
}
