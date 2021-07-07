package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//입력
// 첫째 줄에 수의 개수 N(2 ≤ N ≤ 11)가 주어진다. 둘째 줄에는 A1, A2, ..., AN이 주어진다. 
// (1 ≤ Ai ≤ 100) 셋째 줄에는 합이 N-1인 4개의 정수가 주어지는데, 차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수이다. 

//출력
// 첫째 줄에 만들 수 있는 식의 결과의 최댓값을, 둘째 줄에는 최솟값을 출력한다. 연산자를 어떻게 끼워넣어도 항상 -10억보다 크거나 같고,
// 10억보다 작거나 같은 결과가 나오는 입력만 주어진다.
// 또한, 앞에서부터 계산했을 때, 중간에 계산되는 식의 결과도 항상 -10억보다 크거나 같고, 10억보다 작거나 같다.

// int -21억 ~ 21억이므로 int 사용 가능

/*
 
 1 2 3 . . . N - 1     ->   N-1개의 카드 중 중복없이(같은 카드는 한 번 사용해서 )  ,  N-1 개를 순서 있게 나열   ->  10! = 3628800    ->  2초만에 가능 -> 브루트포스 사용 가능
 
 필요변수 ->  N , max, min      ,  nums[], operators[],  order[]
 
*/

public class Q14888 {
	static int N, max, min;
	static int[] nums, operators, order;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st, st2;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		input();
		rec_func(1); // 첫번째 원소부터 요청
		sb.append(max).append('\n').append(min);
		System.out.println(sb.toString());
	}
	
	// order[1...N-1] 에 연산자들이 순서대로 저장
	static void rec_func(int k) {
		if(k==N) {
			// 완성된 식에 맞게 계산을 해서 정답에 갱신 작업
			int value = calculator();
			max = Math.max(max, value);
			min = Math.min(min, value);
		}else {
			// k번째 연산자는 무엇을 선택할 것인가?
			for(int cand = 1; cand <= 4; cand++ ) {
				if(operators[cand] >= 1) {
					operators[cand]--;  //사용한건 감소하여 사용 처리
					order[k] = cand;
					rec_func(k+1);
					operators[cand]++;
					order[k] = 0;
				}
			}
		}
	}
	
	// 완성된 식에 맞게 계산을 해서 정답에 갱신 작업
	static int calculator() {
		// nums, order
		int value = nums[1];
		for(int i=1; i<=N-1; i++) {
			// value , order[i],  num[i+1]
			if(order[i] == 1) {
				value = value + nums[i+1];
			}
			if(order[i] == 2) {
				value = value - nums[i+1];
			}
			if(order[i] == 3) {
				value = value * nums[i+1];
			}
			if(order[i] == 4) {
				value = value / nums[i+1];
			}
		}
		return value;	
	}
	
	static void input() throws Exception{
		N = Integer.parseInt(br.readLine());
		nums = new int[N+1];
		operators = new int[5];
		order = new int[N+1];
		
		int idx = 0;
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreElements()) {
			nums[idx++] = Integer.parseInt(st.nextToken());
		}
		idx = 0;

		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreElements()) {
			operators[idx++] = Integer.parseInt(st.nextToken());
		}
		
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
	}
	
}
