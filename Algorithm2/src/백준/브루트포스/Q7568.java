package 백준.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int arr[][];
	static int N,x,y;
	public static void main(String[] args) throws Exception{
		init();
		sol();
		System.out.println(sb.toString());
	}
	static void init() throws Exception{
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
	}
	static void sol() throws Exception{
		for(int i=0; i<N; i++) {
			int rank = 1;
			for(int j=0; j<N; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] ) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
	}
}
