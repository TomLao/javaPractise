package Chapter06;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld";
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder sBuilder2 = new StringBuilder();

		// ���ַ���תΪ����
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				sBuilder.append(String.valueOf(ch[i]).toUpperCase()); // תΪstring������ת����Сд����
			else
				sBuilder.append(String.valueOf(ch[i]).toLowerCase());
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch2 = str.charAt(i);
			//String str2=""+ch2;		//valueOf()������str=""+a���
			sBuilder2.append(
					ch2 >= 'a' && ch2 <= 'z' ? String.valueOf(ch2).toUpperCase() : String.valueOf(ch2).toLowerCase());
		}			//����Ԫ�ж�ʽֱ���ж�

		System.out.println(sBuilder.toString());
		System.out.println(sBuilder2.toString());

	}

}
