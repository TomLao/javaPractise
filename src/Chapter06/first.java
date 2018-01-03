package Chapter06;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld";
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder sBuilder2 = new StringBuilder();

		// 将字符串转为数组
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				sBuilder.append(String.valueOf(ch[i]).toUpperCase()); // 转为string才能用转化大小写函数
			else
				sBuilder.append(String.valueOf(ch[i]).toLowerCase());
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch2 = str.charAt(i);
			//String str2=""+ch2;		//valueOf()可以用str=""+a替代
			sBuilder2.append(
					ch2 >= 'a' && ch2 <= 'z' ? String.valueOf(ch2).toUpperCase() : String.valueOf(ch2).toLowerCase());
		}			//用三元判断式直接判断

		System.out.println(sBuilder.toString());
		System.out.println(sBuilder2.toString());

	}

}
