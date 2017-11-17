package Experment01;

import javax.swing.JOptionPane;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, first, middle, last, space, monogram;
		space = " ";
		name = JOptionPane.showInputDialog(null, "Enter your full name(first, middle, last)", "中间用空格隔开");

		first = name.substring(0, name.indexOf(space)); // 提取name的从0到空格
		name = name.substring(name.indexOf(space) + 1, name.length());// 将name缩短空格+1,到最后
		middle = name.substring(0, name.indexOf(space));
		last = name.substring(name.indexOf(space) + 1, name.length());

		monogram = first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
		JOptionPane.showConfirmDialog(null, "your monogram is " + monogram);
		// 查一下JOptionPane,showConfirmDialog
	}
}
