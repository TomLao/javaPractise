//package Experment03;	//��������ͼ����鼮���ܷ���
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
//	public double getCharge() {	//�����Խ��컹���б�����������ܳ��ڷ���
//		double sum=0;
//		GregorianCalendar today=new GregorianCalendar();
//		for(LibraryBook tempBook:LibraryBooks) {
//			sum+=tempBook.computeCharge(today);
//		}
//		return sum;
//	}
//	
//	public double getCharge(GregorianCalendar returnDate) {	//���㴫�����ڵ��ܷ���
//		double sum=0;
//		for(LibraryBook tempBook:LibraryBooks) {
//			sum+=tempBook.computeCharge(returnDate);
//		}
//		return sum;
//	}
//	
//	public String getList() {	//���������ر�ʾ����ͼ����Ϣ��һ���ַ���
//		return LibraryBooks.toString();
//	}
//}
//
//class OverdueChecker {
//	BookTracker books;		//һ��ͼ��ݶ���
//
//	public void start() {		//�������򣬿�����������
//		inputBooks();
//		while(isContinue()) {	//�������룿
//			
//		}
//	}
//	
////	����libraryBook����
//	private LibraryBook createBook(String bookName, double chargePerDay, double maxCharge, GregorianCalendar dueDate) {
//		
//		return null;
//	}
//	
////	���Ҫ��ӡ����Ϣ
//	private void display(String text) {
//		
//	}
//	
////	���صõ�������ͼ��ĳ��ڷ����������׼����
//	private void displayTotalCharge(double charge) {
//		
//	}
//	
////	����ͼ����Ϣ������librarybook���󣬱��浽bookTracker
//	private void inputBooks() {
//		String str;
//		str = JOptionPane.showInputDialog(null, "Enter a bookname:");
//		
//		LibraryBook tempBook=new LibraryBook(str);
//		
//		books.add(tempBook);
//	}
//	
////	�Ƿ����ִ��
//	private boolean isContinue() {
//		String str;
//		str = JOptionPane.showInputDialog(null, "isContinue:(Y/n)");
//		if(str=="Y"||str=="y")
//			return true;
//		else
//			return false;
//	}
//	
////	������Ϣ֮��
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