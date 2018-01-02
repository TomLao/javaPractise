package Chapter06;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld";
		
		//将字符串转为数组
		char[] ch=str.toCharArray();
		StringBuilder sBuilder=new StringBuilder();
		
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]>='a'&&ch[i]<='z')
				sBuilder.append(String.valueOf(ch[i]).toUpperCase());	//转为string才能用转化大小写函数
			else
				sBuilder.append(String.valueOf(ch[i]).toLowerCase());
		}
		
		System.out.println(sBuilder.toString());
	}

}
