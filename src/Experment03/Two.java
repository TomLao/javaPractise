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
	private double overdueExpenses=0.05;	//逾期默认罚款金额
	private double price;
	private double maxOverdueExpenses;
	private int year;
	private int month;
	private int day;
	private BookTracker bt=new BookTracker();
	public overdueChecker() {
		Scanner sc=new Scanner(System.in);	//定义输入函数对象
		while(true) {
			int select;
			System.out.println("Please Input your choose");
			System.out.println("1——add one book     2——showAllBook");
			System.out.println("           3——break               ");
			select=sc.nextInt();			//输入函数，int型
			if(select==3)
				break;
			switch(select) {
			case 1:
				System.out.println("请依次输入书本信息(包括书本名称，借书时间，价格，归还日期，逾期费用(默认为0.05元)，最高逾期费(默认为书本价格)");
				sc.nextLine();
				bookName=sc.next();
				year=sc.nextInt();	//输入借书时间
				month=sc.nextInt();
				day=sc.nextInt();
				borrowDate=new date(year,month,day);
				price=sc.nextDouble();
				year=sc.nextInt();	//还书时间
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
