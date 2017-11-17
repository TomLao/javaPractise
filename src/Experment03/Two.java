//package Experment03;	//计算逾期图书馆书籍的总费用
//
//import java.awt.DisplayMode;
//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//import javax.swing.JOptionPane;
//
//class LibraryBook{
//	String bookName;
//	GregorianCalendar dueDate;
//	double chargePerDay;
//	double maximumCharge;
//	
//	public LibraryBook(String bookName) {
//		super();
//		this.bookName = bookName;
//	}
//
//	public LibraryBook(String bookName, GregorianCalendar dueDate) {
//		super();
//		this.bookName = bookName;
//		this.dueDate = dueDate;
//	}
//
//	public LibraryBook(String bookName, GregorianCalendar dueDate, double chargePerDay) {
//		super();
//		this.bookName = bookName;
//		this.dueDate = dueDate;
//		this.chargePerDay = chargePerDay;
//	}
//
//	public LibraryBook(String bookName, GregorianCalendar dueDate, double chargePerDay, double maximumCharge) {
//		super();
//		this.bookName = bookName;
//		this.dueDate = dueDate;
//		this.chargePerDay = chargePerDay;
//		this.maximumCharge = maximumCharge;
//	}
//
//	@Override
//	public String toString() {
//		return "LibraryBook [bookName=" + bookName + ", dueDate=" + dueDate + ", chargePerDay=" + chargePerDay
//				+ ", maximumCharge=" + maximumCharge + "]";
//	}
//	
//	public double computeCharge(GregorianCalendar returnDate) {
//		
//	}
//
//	public String getBookName() {
//		return bookName;
//	}
//
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//
//	public GregorianCalendar getDueDate() {
//		return dueDate;
//	}
//
//	public void setDueDate(GregorianCalendar dueDate) {
//		this.dueDate = dueDate;
//	}
//
//	public double getChargePerDay() {
//		return chargePerDay;
//	}
//
//	public void setChargePerDay(double chargePerDay) {
//		this.chargePerDay = chargePerDay;
//	}
//
//	public double getMaximumCharge() {
//		return maximumCharge;
//	}
//
//	public void setMaximumCharge(double maximumCharge) {
//		this.maximumCharge = maximumCharge;
//	}
//	
//	
//}
//
//class BookTracker{
//	ArrayList<LibraryBook> LibraryBooks=new ArrayList<LibraryBook>();
//
//	public BookTracker() {
//		super();
//	}
//	
//	public void add(LibraryBook book) {
//		LibraryBooks.add(book);
//	}
//	
//	public double getCharge() {	//计算以今天还书列表中所有书的总超期费用
//		double sum=0;
//		GregorianCalendar today=new GregorianCalendar();
//		for(LibraryBook tempBook:LibraryBooks) {
//			sum+=tempBook.computeCharge(today);
//		}
//		return sum;
//	}
//	
//	public double getCharge(GregorianCalendar returnDate) {	//计算传入日期的总费用
//		double sum=0;
//		for(LibraryBook tempBook:LibraryBooks) {
//			sum+=tempBook.computeCharge(returnDate);
//		}
//		return sum;
//	}
//	
//	public String getList() {	//不懂，返回表示所有图书信息的一个字符串
//		return LibraryBooks.toString();
//	}
//}
//
//class OverdueChecker {
//	BookTracker books;		//一个图书馆对象
//
//	public void start() {		//启动程序，控制整个程序
//		inputBooks();
//		while(isContinue()) {	//继续输入？
//			
//		}
//	}
//	
////	创建libraryBook对象
//	private LibraryBook createBook(String bookName, double chargePerDay, double maxCharge, GregorianCalendar dueDate) {
//		
//		return null;
//	}
//	
////	输出要打印的信息
//	private void display(String text) {
//		
//	}
//	
////	返回得到的所有图书的超期费用输出到标准窗口
//	private void displayTotalCharge(double charge) {
//		
//	}
//	
////	输入图书信息，创立librarybook对象，保存到bookTracker
//	private void inputBooks() {
//		String str;
//		str = JOptionPane.showInputDialog(null, "Enter a bookname:");
//		
//		LibraryBook tempBook=new LibraryBook(str);
//		
//		books.add(tempBook);
//	}
//	
////	是否继续执行
//	private boolean isContinue() {
//		String str;
//		str = JOptionPane.showInputDialog(null, "isContinue:(Y/n)");
//		if(str=="Y"||str=="y")
//			return true;
//		else
//			return false;
//	}
//	
////	返回信息之类
//	private double readDouble(String prompt) {
//		
//		
//	}
//	
//	private GregorianCalendar readDate(String Prompt) {
//		
//		
//	}
//	
//	private String readString(String prompt) {
//		
//	}
//}
//public class Two {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		OverdueChecker admin=new OverdueChecker();
//		admin.start();
//	}
//
//}
//class Solution 
//{
//public int countBattleships(vector<vector<char>>& board)
//    {
//        int count = 0;
//        int row = board.size();
//        int column = board[0].size();
//        for (int i = 0; i < row; ++i)
//        {
//            for (int j = 0; j < column; ++j)
//            {
//                if (board[i][j] == 'X')
//                {
//                    if (i == 0 && j == 0)
//                    {
//                        ++count;
//                    }
//                    else if (i == 0 && board[i][j - 1] != 'X')
//                    {
//                        ++count;
//                    }
//                    else if (j == 0 && board[i - 1][j] != 'X')
//                    {
//                        ++count;
//                    }
//                    else if (i != 0 && j != 0 && board[i][j - 1] != 'X' && board[i - 1][j] != 'X')
//                    {
//                        ++count;
//                    }
//                }
//            }
//        }
//        return count;
//    }
//};