package Chapter07;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			list.add(i);
		
		Iterator<Integer> iterator=list.iterator();	//������
		while(iterator.hasNext()) {			//�Ƿ�����һ��Ԫ��
			Object object=iterator.next();	//ȡ�������е�Ԫ��
			System.out.print(object+" ");
		}
		System.out.println();
		for(Object temp: list) {			//foreach���ݹ�
			System.out.print(temp+" ");
		}
	}

}
