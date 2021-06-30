package Àç±Í;

import java.util.Scanner;

public class SimpleRe {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = recur(n);
		System.out.println(result);
	}
	static int recur(int n) {
		if(n <= 1 && n == 0) {
			return 1;
		}
		return n * recur(n-1);
	}
}
