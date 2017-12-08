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
		
		f.addWindowListener(new MyWindowListener());//为窗口组件注册监听器
		
		Button btn=new Button("我是按钮aaaaaa");	//创建按钮组件对象
		f.add(btn);//把按钮对象加载到窗口上
//		btn.addMouseListener(new MouseAdapter() {	//匿名内部类
//			public void mouseClicked(MouseEvent e) {
//				System.exit(0);//按钮关闭程序
//			}
//		});
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("松开");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("按下");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("出去");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("进入");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("按后");
				if(e.getButton()==e.BUTTON2)//中键，1左，2中，3右键
					System.out.println("中键");
			}
		});
		
	}
}

//创建MyWindowListener实现WindowListener接口
//法二,窗口监听器
//class MyWindowListener extends WindowAdapter{
//	public void windowClosing (WindowEvent e) {
//		Window window=(Window)e.getComponent();
//		window.dispose();
//	}
//}
class MyWindowListener implements WindowListener{
	
	public void windowClosing(WindowEvent e) {
		Window window =e.getWindow();
		System.out.println("正在关闭");
		window.setVisible(false);//这个只是设置了不可见，他还在后台运行
		window.dispose();//释放窗口
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("激活");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("已关闭");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("停用");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("取消图标化");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("图标化");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("打开");
	}
}
