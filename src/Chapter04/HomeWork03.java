package Chapter04;

class NoThisSoundException extends Exception { // �̳�Exception��

	public NoThisSoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoThisSoundException(String message) {// �����쳣������ֵ��Ϣ�ַ���
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class Player {

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	int play(int index) throws NoThisSoundException {// ����Ҫ�ں���ͷ������throw�����������׳��쳣
		if (index > 10)
			throw new NoThisSoundException("�����ŵĸ��������ڣ�");// �׳��쳣

		return index;
	}

}

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player one = new Player();
		try { // try-catch�����쳣
			one.play(20);
		} catch (NoThisSoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
