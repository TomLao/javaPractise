package Chapter07;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			list.add(i);
		
		Iterator<Integer> iterator=list.iterator();	//迭代器
		while(iterator.hasNext()) {			//是否有下一个元素
			Object object=iterator.next();	//取出集合中的元素
			System.out.print(object+" ");
		}
		System.out.println();
		for(Object temp: list) {			//foreach法递归
			System.out.print(temp+" ");
		}
	}

}
