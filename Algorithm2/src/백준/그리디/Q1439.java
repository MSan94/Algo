package 백준.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1439 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int result, one , zero;
	static String str;
	public static void main(String[] args) throws Exception {
		input();
		sol();
		System.out.println(Math.min(one, zero));
	}
	static void input() throws Exception{
		str = br.readLine();
	}
	static void sol() {
		char check = str.charAt(0);
		if(check == '0') zero++;
		else one++;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i-1) != str.charAt(i)) {
				if(str.charAt(i) == '0') zero++;
				else one++;
			}
		}
	}
}
