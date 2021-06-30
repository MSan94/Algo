package น้มุ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tmp {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st1.nextToken());
		int max = Integer.parseInt(st1.nextToken());
		int arr[] = new int[n];
		int idx = 0;
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		while(st2.hasMoreElements()) {
			arr[idx++] = Integer.parseInt(st2.nextToken());
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < max) {
				sb.append(arr[i] + " ");
			}
		}
		System.out.println(sb);
	}
}
