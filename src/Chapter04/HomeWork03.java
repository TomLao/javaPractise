package Chapter04;

class NoThisSoundException extends Exception { // 继承Exception类

	public NoThisSoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoThisSoundException(String message) {// 接收异常，并赋值信息字符串
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class Player {

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	int play(int index) throws NoThisSoundException {// 这里要在函数头部加上throw才能在下面抛出异常
		if (index > 10)
			throw new NoThisSoundException("您播放的歌曲不存在！");// 抛出异常

		return index;
	}

}

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player one = new Player();
		try { // try-catch接收异常
			one.play(20);
		} catch (NoThisSoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
