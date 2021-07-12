package 백준.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10809 {

	static int[] alph = new int[26];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String str;

	public static void main(String[] args) throws Exception {
		init();
		sol();
		System.out.println(sb.toString());
	}

	static void init() throws Exception {
		str = br.readLine();
	}

	static void sol() throws Exception {
		for (int i = 0; i < alph.length; i++) {
			alph[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i) - 97;
			if(alph[tmp] == -1)
			alph[tmp] = i;

		}

		for (int i = 0; i < alph.length; i++) {
			sb.append(alph[i]).append(" ");
		}
	}

}
