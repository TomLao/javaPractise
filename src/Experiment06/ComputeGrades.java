package Experiment06;

import java.io.*;
import java.util.*;

public class ComputeGrades {

	Vector<String> students = new Vector<String>();

	// 两个构造方法
	public ComputeGrades() {
		readData();
	}

	public ComputeGrades(int size) {

	}

	// 输出
	public void printResult() {
		String line;
		char index;
		for (int i = 0; i < students.size(); i++) {
			line = students.elementAt(i);
			//TODO 不知道怎么做
			System.out.println(line.charAt(line.indexOf("	")));
//			System.out.println(line);
		}
	}

	// 计算
	public void computeGrade() {

	}

	// 读取文件
	public void readData() {
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("Grades_Ep06.txt"));
			String line = null;
			while ((line = bReader.readLine()) != null) {
				if (!line.equals("END")) // 读到END时停止
					students.add(line);
				else
					break;
				// System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException("读取失败");
		} finally {
			try {
				if (bReader != null)
					bReader.close();
			} catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("关闭失败");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeGrades cG = new ComputeGrades();
		cG.printResult();
	}

}

// helper class
class OutputBox {

}