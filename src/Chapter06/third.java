package Chapter06;

import java.util.Random;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		
		for(int i=0;i<5;i++) {
			//��ʽ������һ����Χ[n~m]֮��������Ĺ�ʽΪ��
			//n+(new Random()).nextInt(m-n+1)
			System.out.println(20+(new Random()).nextInt(50-20+1));
		}
	}

}
