package Chapter06;

import java.util.Random;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		
		for(int i=0;i<5;i++) {
			//公式：生成一个范围[n~m]之间的整数的公式为：
			//n+(new Random()).nextInt(m-n+1)
			System.out.print(20+(new Random()).nextInt(50-20+1)+" ");
		}
		System.out.println();
		Random random=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=20+random.nextInt(31);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
