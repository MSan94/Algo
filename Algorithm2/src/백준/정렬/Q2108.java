//package 백준.정렬;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Q2108 {
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(br.readLine());
//		int arr[] = new int[N];
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//			sum += arr[i];
//		}
//		sb.append((Math.round((float)sum / N ))).append('\n');
//		sb.append(middle(arr)).append('\n');
//		
//		System.out.println(sb);
//	}
//	static int middle(int[] arr) {
//		Arrays.sort(arr);
//		int mid = arr[arr.length/2];
//		return mid;
//	}
//	static int choi(int[] arr) {
//		
//	}
//}
