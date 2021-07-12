package 프로그래머스;

import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
	public static void main(String[] args) {
		String[] phone_book = { "123","456","789" };
		boolean answer = true;
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < phone_book.length; i++) {
			hm.put(phone_book[i], i);
		}

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 1; j < phone_book[i].length(); j++) {
				System.out.println(phone_book[i].substring(0, j));
				if (hm.containsKey(phone_book[i].substring(0, j))) {
					answer = false;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
