package 백준.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1100_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static char[][] arr = new char[8][8];
	static int result;
	public static void main(String[] args) throws Exception {
		sol();
		System.out.println(result);
	}

	static void sol() throws Exception {
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
				
				if((i+j) % 2 == 0 && arr[i][j] == 'F') result++; 
			}
		}
	}

}
