package Chapter06;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DATE, 100); 	// 在日期上加上100天
		Date date=calendar.getTime();		//转化为Date类型对象
		DateFormat fullFormat=DateFormat.getDateInstance(DateFormat.FULL);//FULL格式的DateFormat对象
			
		System.out.println(fullFormat.format(date));//DateFormat对象只能作用与Date类，所以要转化
	}

}
