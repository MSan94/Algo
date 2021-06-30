package 백준.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=1; i<1000001; i++) {
			int num = i;
			int sum = num;
			while(num > 0) {
				int tmp = num % 10;
				num /= 10;
				sum += tmp;
			}
			if(sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
