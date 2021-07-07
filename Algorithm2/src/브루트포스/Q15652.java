package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
고른 수열은 비내림차순이어야 한다.
길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.
*/
public class Q15652 {
	static StringBuilder sb = new StringBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M, start;
	static int[] selected;

	static void input() throws Exception {
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M + 1];
	}

	static void rec_func(int k) {
		if (k == M + 1) { // 다골랐음
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');
		} else {
			start = selected[k-1];
			if(start == 0) start = 1;
			for (int cand = start; cand <= N; cand++) {
				selected[k] = cand;
				rec_func(k + 1);
				selected[k] = 0; // 탐색 끝낸후 k번째 원소의 기록이 필요없어서 0으로 지움
			}
		}
	}

	public static void main(String[] args) throws Exception {
		input();
		rec_func(1);
		System.out.println(sb.toString());
	}
}
