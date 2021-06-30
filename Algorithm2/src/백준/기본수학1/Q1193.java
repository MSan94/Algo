package 백준.기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1193 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int cnt = 1; // 대각선 요소 수
		int prev_count_sum = 0; // 해당 대각선, 직전 대각선 까지의 칸의 누적 합

		while (true) {
			if (N <= prev_count_sum + cnt) {
				if (cnt % 2 == 1) {
					System.out.println((cnt - (N - prev_count_sum - 1)) + "/" + (N - prev_count_sum));
					break;
				}else {
					System.out.println((N - prev_count_sum) + "/" + (cnt - (N - prev_count_sum - 1)));
					break;
				}
			} else {
				prev_count_sum += cnt;
				cnt++;
			}
		}

	}
}
