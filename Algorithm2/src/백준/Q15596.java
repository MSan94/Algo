package น้มุ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q15596 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a[] = { 1,2,3,4,5};
		long result = sum(a);
		System.out.println(result);
	}
	
	static long sum(int[] a) {
		long result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
