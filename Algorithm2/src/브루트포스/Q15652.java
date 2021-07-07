package ���Ʈ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1���� N���� �ڿ��� �߿��� M���� �� ����
���� ���� ���� �� ��� �ȴ�.
�� ������ �񳻸������̾�� �Ѵ�.
���̰� K�� ���� A�� A1 �� A2 �� ... �� AK-1 �� AK�� �����ϸ�, �񳻸������̶�� �Ѵ�.
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
		if (k == M + 1) { // �ٰ����
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
				selected[k] = 0; // Ž�� ������ k��° ������ ����� �ʿ��� 0���� ����
			}
		}
	}

	public static void main(String[] args) throws Exception {
		input();
		rec_func(1);
		System.out.println(sb.toString());
	}
}
