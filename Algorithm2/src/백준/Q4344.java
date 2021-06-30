package น้มุ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			int sum = 0;
			int top = 0;
			int arr[] = new int[num];
			for(int j=0; j<num; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			for(int j=0; j<num; j++) {
				if(arr[j] > (sum / num)) {
					top++;
				}
			}
			sb.append( Math.ceil((((double)top/num) * 100)/0.1) ).append('\n');
		}
		System.out.println(sb);
	}
}
