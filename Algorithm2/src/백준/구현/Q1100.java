package 백준.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1100 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static char[][] arr = new char[8][8];
	static int result;

	public static void main(String[] args) throws Exception {
		input();
		sol();
		System.out.println(result);
	}

	static void input() throws Exception {
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
	}

	static void sol() throws Exception {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					compare(arr,i,j);
				} else if (i % 2 != 0 && j % 2 != 0) {
					compare(arr,i,j);
				}
			}
		}
	}
	static void compare(char[][] arr, int start, int end) {
		if (arr[start][end] == 'F')
			result++;
	}
}
