package Chapter09;

import java.awt.*;
import java.awt.event.*;

public class tryOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f=new Frame("myFrame");
		f.setLayout(new FlowLayout());
		f.setSize(300,400);
		f.setLocation(300, 200);
		f.setVisible(true);
		
		f.addWindowListener(new MyWindowListener());//Ϊ�������ע�������
		
		Button btn=new Button("���ǰ�ťaaaaaa");	//������ť�������
		f.add(btn);//�Ѱ�ť������ص�������
//		btn.addMouseListener(new MouseAdapter() {	//�����ڲ���
//			public void mouseClicked(MouseEvent e) {
//				System.exit(0);//��ť�رճ���
//			}
//		});
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�ɿ�");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("����");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ȥ");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("����");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("����");
				if(e.getButton()==e.BUTTON2)//�м���1��2�У�3�Ҽ�
					System.out.println("�м�");
			}
		});
		
	}
}

//����MyWindowListenerʵ��WindowListener�ӿ�
//����,���ڼ�����
//class MyWindowListener extends WindowAdapter{
//	public void windowClosing (WindowEvent e) {
//		Window window=(Window)e.getComponent();
//		window.dispose();
//	}
//}
class MyWindowListener implements WindowListener{
	
	public void windowClosing(WindowEvent e) {
		Window window =e.getWindow();
		System.out.println("���ڹر�");
		window.setVisible(false);//���ֻ�������˲��ɼ��������ں�̨����
		window.dispose();//�ͷŴ���
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�ѹر�");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ͣ��");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ȡ��ͼ�껯");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ͼ�껯");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��");
	}
}
