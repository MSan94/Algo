package 백준.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st1.nextToken());
		int max = Integer.parseInt(st1.nextToken());
		int[] arr = new int[n];
		int idx = 0;
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		while (st2.hasMoreElements()) {
			arr[idx++] = Integer.parseInt(st2.nextToken());
		}
		
		int result = 0;
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] > result && arr[i] + arr[j] + arr[k] <= max) {
						result = arr[i]+arr[j]+arr[k];
					}
				}
			}
		}
		System.out.println(result);
	}
}
