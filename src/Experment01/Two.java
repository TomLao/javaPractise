package Experment01;

import javax.swing.JOptionPane;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, first, middle, last, space, monogram;
		space = " ";
		name = JOptionPane.showInputDialog(null, "Enter your full name(first, middle, last)", "�м��ÿո����");

		first = name.substring(0, name.indexOf(space)); // ��ȡname�Ĵ�0���ո�
		name = name.substring(name.indexOf(space) + 1, name.length());// ��name���̿ո�+1,�����
		middle = name.substring(0, name.indexOf(space));
		last = name.substring(name.indexOf(space) + 1, name.length());

		monogram = first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
		JOptionPane.showConfirmDialog(null, "your monogram is " + monogram);
		// ��һ��JOptionPane,showConfirmDialog
	}
}
