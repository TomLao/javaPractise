package Experiment04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//�ͻ�����ȡƱ���,ע��ֻ�Ǹ�ͨ�ŵ����
public class Client extends JFrame {
	int currentTicket = 1;
	JButton normalButton = new JButton("��ͨ�ͻ�");// ����������ť
	JButton vipButton = new JButton("VIP�ͻ�");
	callingSystem callingS = new callingSystem();

	public Client() {

		this.setTitle("��ӭ���������һ����");// ���ô��ڲ���
		this.setSize(600, 400);

		this.setLayout(new FlowLayout());// ���ò��֣���ʽ���ֹ�����

		this.add(normalButton);// �򲼾����������ť
		this.add(vipButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ��ӵ���رհ�ťʱĬ�Ϲرմ���
		this.setVisible(true);

		// �����Ʊ
		normalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					callingS.addNormalClient("normal");	//���һ����ͨ�ͻ�
			}
		});

		vipButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					callingS.addNormalClient("vip");//���һ��vip�ͻ�
			}
		});
	}

	public void main(String[] args) {
		new Client();
	}
}