package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
public class Q15649 {
	static StringBuilder sb = new StringBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, M;
	static int[] selected, used;

	static void input() throws Exception {
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M + 1];
		used = new int[M+1];
	}

	static void rec_func(int k) {
		if (k == M + 1) { // 다골랐음
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');
		} else {
			for (int cand = 1; cand <= N; cand++) {
				if (used[cand] == 1) {
					continue;
				}
				selected[k] = cand;
				used[cand] = 1;
				rec_func(k + 1);
				selected[k] = 0; // 탐색 끝낸후 k번째 원소의 기록이 필요없어서 0으로 지움
				used[cand] = 0;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		input();
		rec_func(1);
		System.out.println(sb.toString());
	}
}
