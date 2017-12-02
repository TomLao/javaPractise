package Experiment04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//客户交互取票面板,注意只是个通信的面板
public class Client extends JFrame {
	int currentTicket = 1;
	JButton normalButton = new JButton("普通客户");// 设置两个按钮
	JButton vipButton = new JButton("VIP客户");
	callingSystem callingS = new callingSystem();

	public Client() {

		this.setTitle("欢迎光临宇宙第一银行");// 设置窗口布局
		this.setSize(600, 400);

		this.setLayout(new FlowLayout());// 设置布局，流式布局管理器

		this.add(normalButton);// 向布局添加两个按钮
		this.add(vipButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 添加点击关闭按钮时默认关闭窗口
		this.setVisible(true);

		// 点击领票
		normalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					callingS.addNormalClient("normal");	//入队一个普通客户
			}
		});

		vipButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					callingS.addNormalClient("vip");//入队一个vip客户
			}
		});
	}

	public void main(String[] args) {
		new Client();
	}
}