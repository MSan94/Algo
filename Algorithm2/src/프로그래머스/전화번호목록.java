package ���α׷��ӽ�;

import java.util.HashMap;
import java.util.Map;

public class ��ȭ��ȣ��� {
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
