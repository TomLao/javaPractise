package Chapter08;

import java.io.*;

//模拟带行号的读取流
public class myLineNumberReader {
	
	private Reader r;
	private int lineNumber;
	public myLineNumberReader(Reader r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	
	public String myReadLine() throws IOException {
		StringBuilder sb=new StringBuilder();
		
		int ch=0;
		
		while((ch=r.read())!=-1) {
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	
	public void myClose() throws IOException {
		r.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模拟主函数省略
	}

}
