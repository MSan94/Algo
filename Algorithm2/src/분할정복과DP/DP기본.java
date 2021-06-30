package 분할정복과DP;

public class DP기본 {
//  재귀사용
//	public static void main(String[] args) {
//		 int n = 9;
//		 System.out.println(fibo(10));
//	}
//	
//	static int fibo(int n) {
//		if(n <= 1) {
//			return n;
//		}
//		return fibo(n-1) + fibo(n-2);
//	}
	
//  DP 사용
	public static void main(String[] args) {
		System.out.println(fibo(10));
	}
	static int fibo(int n) {
		Integer[] cache = new Integer[n+1];
		cache[0] = 0;
		cache[1] = 1;
		for(int i=2; i<cache.length; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		return cache[n];
	}
}
