package Chapter08;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class HomeWork01 {

	public static void main(String[] args) {
//		BufferedReader
//		do {
//			
//		} while (condition);
		Map map=new HashMap();
		map.put("1", "LaoHeze");
		map.put("2", "Heze");
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
	}
}

