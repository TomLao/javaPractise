package Chapter07;

import java.util.*;

public class third {
	public static void main(String[] args) {
		TreeMap treeMap = new TreeMap();
		treeMap.put(2, "John"); // ����ֵ������
		treeMap.put(1, "Lucy");
		treeMap.put(3, "Lao");
		treeMap.put(5, "ze");
		treeMap.put(4, "he");

		// ����һ����foreach��ֱ�ӷ���treeMap�ļ�ֵ
		for (Object key : treeMap.keySet()) {
			System.out.println(treeMap.get(key));
		}

		// ������������ȡtreeMap�ļ�ֵ������һ��set�����У�
		// Ȼ�����õ�����������set�еļ�ֵ�����ʶ�Ӧ��value
		Set set = treeMap.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(treeMap.get(it.next())); // treeMap.get(key)ͨ����ֵ��ȡ����ֵ
		}
	}
}


//����Ƚ�����ʱû�ã�Ҫ֪����ôд�Ƚ�����ʵ��Comparetor�ӿ�
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String ele1 = (String) obj1;
		String ele2 = (String) obj2;
		return ele2.compareTo(ele1);
	}
}
