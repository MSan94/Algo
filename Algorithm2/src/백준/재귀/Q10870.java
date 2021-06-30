package πÈ¡ÿ.¿Á±Õ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10870 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = fibo(n);
		System.out.println(result);
	}
	static int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
}
