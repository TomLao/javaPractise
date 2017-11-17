package Chapter06;
//p235编程题1
public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("HelloWorld");
		System.out.println(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				System.out.print(str.toLowerCase().charAt(i)); // 遇到大写转小写
			else
				System.out.print(str.toUpperCase().charAt(i));
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++)
			sb.append(str.charAt(i));
		System.out.println("\n" + sb.toString());
		
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++)
			sb2.append(str.charAt(i));
		System.out.println(sb2.toString());
	}

}
