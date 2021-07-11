package 백준.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q11508 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, sum;
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		input();
		sol();
		System.out.println(sum);
	}
	
	static void input() throws Exception{
		N = Integer.parseInt(br.readLine());
		arr = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
	}
	
	static void sol() throws Exception{
		Arrays.sort(arr, Comparator.reverseOrder());
		for(int i=0; i<arr.length; i++) {
			if(i % 3 == 2) continue;
			else sum += arr[i];
		}
	}
}
