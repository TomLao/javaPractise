package Chapter06;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DATE, 100); 	// �������ϼ���100��
		Date date=calendar.getTime();		//ת��ΪDate���Ͷ���
		DateFormat fullFormat=DateFormat.getDateInstance(DateFormat.FULL);//FULL��ʽ��DateFormat����
			
		System.out.println(fullFormat.format(date));//DateFormat����ֻ��������Date�࣬����Ҫת��
	}

}
