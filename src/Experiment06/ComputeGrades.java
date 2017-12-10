package Experiment06;

import java.io.*;
import java.util.*;

/**input test data
 * 
U John Doe 87 78 90
G Jill Jones 90 95 87
G Jack Smith 67 77 68
U Mary Hines 80 85 80
U Mick Taylor 76 69 79
END
 */

public class ComputeGrades {

	private Vector<Student> students = new Vector<Student>();

	// 两个构造方法
	public ComputeGrades() {
		readData();
	}

	public ComputeGrades(int size) {
		
	}

	// 读取文件
	public void readData() {
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("Grades_Ep06.txt"));
			String line = null;
			while ((line = bReader.readLine()) != null) {
				if (!line.equals("END")) // 读到END时停止
					creatStudent(line);
				else
					break;
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

	// 创建学生对象并赋值，然后加入到vector容器
	public void creatStudent(String line) {
		Student student = new Student();
		// 默认是Java的分隔符，可自定义。建议用split，但我不会。。
		//分割String
		StringTokenizer parser = new StringTokenizer(line);
		String temp;

		student.setType(parser.nextToken()); // setting student type

		student.setName(parser.nextToken(), parser.nextToken());// set first and last name

		for (int testNum = 0; testNum < Student.NUM_OF_TESTS; testNum++) {
			student.setTestsGrade(testNum,Integer.parseInt(parser.nextToken()));
		}

		student.computeCourseGrade();

		students.add(student);	//add a Obj of student to the vector of students
	}

	public void printResult() {
		for(Student student: students) {
			System.out.print(student.getType()+"	"+student.getName()+"	");
			for(int testNum=0;testNum<Student.NUM_OF_TESTS;testNum++) {
				System.out.print(student.getTestGrade()[testNum]+"	");
			}
			System.out.println(student.getCourseGrade());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeGrades computeGrades = new ComputeGrades();
		computeGrades.printResult();
	}
}

// helper class
class OutputBox {

}