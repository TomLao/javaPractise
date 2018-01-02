package Chapter07;

import java.util.*;

public class third {
	public static void main(String[] args) {
		TreeMap treeMap = new TreeMap();
		treeMap.put(2, "John"); // 按键值来排序
		treeMap.put(1, "Lucy");
		treeMap.put(3, "Lao");
		treeMap.put(5, "ze");
		treeMap.put(4, "he");

		// 方法一，用foreach来直接访问treeMap的键值
		for (Object key : treeMap.keySet()) {
			System.out.println(treeMap.get(key));
		}

		// 方法二，先提取treeMap的键值出来到一个set容器中，
		// 然后在用迭代器来遍历set中的键值来访问对应的value
		Set set = treeMap.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(treeMap.get(it.next())); // treeMap.get(key)通过键值获取具体值
		}
	}
}


//这个比较器暂时没用，要知道怎么写比较器，实现Comparetor接口
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String ele1 = (String) obj1;
		String ele2 = (String) obj2;
		return ele2.compareTo(ele1);
	}
}
