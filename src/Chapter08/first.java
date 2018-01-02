package Chapter08;

import java.io.*;

public class first {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream=new FileInputStream("wordList.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("wordListCopy.txt");
		byte[] buf=new byte[1024];	//定义读取字符数组		
		int len;		
		while((len=fileInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, len);
		}
		fileInputStream.close();
		fileOutputStream.close();
		
		BufferedReader bfr=new BufferedReader(new FileReader("wordList.txt"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("wordListCopy.txt"));
		String str;
		while((str=bfr.readLine())!=null) {
			bfw.write(str);
			bfw.newLine();
		}
		bfr.close();
		bfw.close();
	}

}
