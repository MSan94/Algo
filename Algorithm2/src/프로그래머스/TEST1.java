package 프로그래머스;

public class TEST1 {
	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int answer = bfs(numbers,3,numbers[0], 1) + bfs(numbers,3,-numbers[0],1);
		System.out.println(answer);
	}
	static int bfs(int[] numbers, int target, int sum, int i) {
		if(i == numbers.length) {
			return sum == target ? 1 : 0;
		}
		int result = 0;
		result += bfs(numbers,target,sum+numbers[i], i+1);
		result += bfs(numbers,target,sum-numbers[i], i+1);
		return result;
	}
}
