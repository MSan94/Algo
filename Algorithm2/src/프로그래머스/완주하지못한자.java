package 프로그래머스;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한자 {
	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "kiki", "eden" };
		String answer = "";
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		
		for(String part : participant) {
			if(hm.get(part) == null) {
				hm.put(part, 1);
			}else {
				hm.put(part, hm.get(part) + 1);
			}
		}
		
		for(String comp : completion) {
			int val = hm.get(comp) - 1;
			hm.put(comp, val);
		}
		
		for(String key : hm.keySet()) {
			if(hm.get(key) == 1) {
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
