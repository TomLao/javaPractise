package Chapter06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//p235编程题2
public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		System.out.println(date.getTime());

		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date.getTime());// 转换格式
		System.out.println(str);

		date.add(Calendar.DATE, 100);
		System.out.println(date.getTime()); // 注意输出是date.getTime()
	}

}
