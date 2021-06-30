package 재귀;

// 4를 만들수 있는 방법의 수

public class Ques {
	public static void main(String[] args) {
		int num = 6;
		int result = factorialFunc(num);
		System.out.println(result);
	}
	static int factorialFunc(int data){
		if(data == 1) {
			return 1;
		}else if(data == 2) {
			return 2;
		}else if(data == 3) {
			return 4;
		}
		return factorialFunc(data-1) + factorialFunc(data-2) + factorialFunc(data-3);
	}
}
