package Experiment06;

import java.io.*;
import java.util.*;

public class ComputeGrades {

	Vector<String> students = new Vector<String>();

	// �������췽��
	public ComputeGrades() {
		readData();
	}

	public ComputeGrades(int size) {

	}

	// ���
	public void printResult() {
		String line;
		char index;
		for (int i = 0; i < students.size(); i++) {
			line = students.elementAt(i);
			//TODO ��֪����ô��
			System.out.println(line.charAt(line.indexOf("	")));
//			System.out.println(line);
		}
	}

	// ����
	public void computeGrade() {

	}

	// ��ȡ�ļ�
	public void readData() {
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("Grades_Ep06.txt"));
			String line = null;
			while ((line = bReader.readLine()) != null) {
				if (!line.equals("END")) // ����ENDʱֹͣ
					students.add(line);
				else
					break;
				// System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException("��ȡʧ��");
		} finally {
			try {
				if (bReader != null)
					bReader.close();
			} catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("�ر�ʧ��");
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