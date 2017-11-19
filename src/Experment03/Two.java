package Experment03;
import java.util.*;
class date{
	int year;
	int month;
	int day;
	public date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString() {
		if(day>=10)
			return year+"/"+month+"/"+day;
		else {
			return year+"/"+month+"/"+"0"+day;
		}
	}
	
}
class BookTracker{
	private ArrayList<LibraryBook> a1=new ArrayList<LibraryBook>();
	public void addBook(LibraryBook book) {
		a1.add(book);
	}
	public void showAll() {
		Iterator<LibraryBook> it=a1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
class LibraryBook{
	private String bookName;
	private date borrowDate;
	private date finalDate;
	private double price;
	private double maxOverdueExpenses;
	public LibraryBook(String bookName, date borrowDate, date finalDate, double price, double maxOverdueExpenses) {
		super();
		this.bookName = bookName;
		this.borrowDate = borrowDate;
		this.finalDate = finalDate;
		this.price = price;
		this.maxOverdueExpenses = maxOverdueExpenses;
	}
	@Override
	public String toString() {
		return "LibraryBook [bookName=" + bookName + ", borrowDate=" + borrowDate + ", finalDate=" + finalDate
				+ ", price=" + price + ", maxOverdueExpenses=" + maxOverdueExpenses + "]";
	}
}
class overdueChecker{
	private String bookName;
	private date borrowDate;
	private date finalDate;
	private double overdueExpenses=0.05;	//����Ĭ�Ϸ�����
	private double price;
	private double maxOverdueExpenses;
	private int year;
	private int month;
	private int day;
	private BookTracker bt=new BookTracker();
	public overdueChecker() {
		Scanner sc=new Scanner(System.in);	//�������뺯������
		while(true) {
			int select;
			System.out.println("Please Input your choose");
			System.out.println("1����add one book     2����showAllBook");
			System.out.println("           3����break               ");
			select=sc.nextInt();			//���뺯����int��
			if(select==3)
				break;
			switch(select) {
			case 1:
				System.out.println("�����������鱾��Ϣ(�����鱾���ƣ�����ʱ�䣬�۸񣬹黹���ڣ����ڷ���(Ĭ��Ϊ0.05Ԫ)��������ڷ�(Ĭ��Ϊ�鱾�۸�)");
				sc.nextLine();
				bookName=sc.next();
				year=sc.nextInt();	//�������ʱ��
				month=sc.nextInt();
				day=sc.nextInt();
				borrowDate=new date(year,month,day);
				price=sc.nextDouble();
				year=sc.nextInt();	//����ʱ��
				month=sc.nextInt();
				day=sc.nextInt();
				finalDate=new date(year,month,day);
				String fare=sc.next();
				if(fare.equals("")==false) {
					overdueExpenses=Double.parseDouble(fare);
				}
				String max=sc.next();
				if(max.equals("")==false) {
					maxOverdueExpenses=Double.parseDouble(max);
				}
				else {
					overdueExpenses=price;
				}
				LibraryBook lb=new LibraryBook(bookName,borrowDate,finalDate,price,overdueExpenses);
				bt.addBook(lb);
				break;
			case 2:
				bt.showAll();
			}
		}
	}
}
public class Two {

	public static void main(String[] args) {
			overdueChecker oc=new overdueChecker();
	}

}
