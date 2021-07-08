package 백준.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2914 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, AVG, result;

	public static void main(String[] args) throws Exception {
		input();
		sol();
		System.out.println(result);
	}

	static void input() throws Exception {
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		AVG = Integer.parseInt(st.nextToken());
	}

	static void sol() throws Exception {
		result = N * (AVG - 1) + 1;
	}
}
