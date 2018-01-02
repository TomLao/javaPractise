package Chapter07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			int temp=it.next();
			System.out.println(temp);
		}
	}
}
