package 백준.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14501 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[][] arr;
	static int N, T, P , sum;
	public static void main(String[] args) throws Exception {
		input();
		dfs(0,0);
		System.out.println(sum);
	}
	
	static void input() throws Exception{
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
	}
	
	static void dfs(int T, int P) throws Exception{
		if(T >= N) {
			sum = Math.max(sum, P);
			return;
		}
		if(T + arr[T][0] <= N) {
			dfs(T + arr[T][0] , P + arr[T][1]);
		}else {
			dfs(T + arr[T][0], P);
		}
		dfs(T+1, P);
	}
}
