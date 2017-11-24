/*
 * Ϊ�ĵ��еĶ�ȡ��ͳ������ĸ���ִ��������������������һ���ĵ�
 */
package Experiment05;

import java.io.*;

//���������������������ʱ�
class WordConcordance {

	private String str = null;
	private FileManager fManager = new FileManager();
//	private WordList wList = new WordList();
	private Pattern pt = new Pattern();
	private int[] count = new int[26];

	public void run() {
		FileManager fManager = new FileManager();

		str = fManager.openFile("wordList.txt");

		pt.patternWords(str, count);	//ƥ��
		
		fManager.saveFile("concordance.txt", count);
	}
}

// �ļ�����
class FileManager {

	// ��ȡ�ļ�
	public String openFile(String fileName) {
		BufferedReader bufr = null;

		String str = "", line = null;

		try {
			bufr = new BufferedReader(new FileReader(fileName));
			while ((line = bufr.readLine()) != null) {
				
				str += line;
			}
			str.replaceAll(" ", "");
			return str;
		} catch (IOException e) {
			throw new RuntimeException("��ȡʧ��");
		} finally {
			try {
				if (bufr != null)
					bufr.close();
			} catch (IOException e) {
				throw new RuntimeException("��ȡ�ر�ʧ��");
			}
		}
	}

	public void saveFile(String fileName, int[] count) {
		FileWriter fw = null;
		try {
			char alpet='a';
			fw = new FileWriter(fileName);
			for (int i = 0; i < 26; i++) {
//				System.out.println((alpet++) + ":" + count[i]);

				fw.write((alpet++) + ":" + count[i] + "\r\n");
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
	}
}

// ά���ֱ�,��ӵ�wordlist��
//class WordList {
//
//	public boolean add(String word) {
//
//	}
//}

// ģʽƥ���������
class Pattern {

	public void patternWords(String str, int[] count) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				count[str.charAt(i) - 'a']++;
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				count[str.charAt(i) - 'A']++;
		}
	}
}

public class WordConcordanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordConcordance wc = new WordConcordance();
		wc.run();
	}

}
