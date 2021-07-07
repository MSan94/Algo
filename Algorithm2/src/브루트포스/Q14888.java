package ���Ʈ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//�Է�
// ù° �ٿ� ���� ���� N(2 �� N �� 11)�� �־�����. ��° �ٿ��� A1, A2, ..., AN�� �־�����. 
// (1 �� Ai �� 100) ��° �ٿ��� ���� N-1�� 4���� ������ �־����µ�, ���ʴ�� ����(+)�� ����, ����(-)�� ����, ����(��)�� ����, ������(��)�� �����̴�. 

//���
// ù° �ٿ� ���� �� �ִ� ���� ����� �ִ���, ��° �ٿ��� �ּڰ��� ����Ѵ�. �����ڸ� ��� �����־ �׻� -10�ﺸ�� ũ�ų� ����,
// 10�ﺸ�� �۰ų� ���� ����� ������ �Է¸� �־�����.
// ����, �տ������� ������� ��, �߰��� ���Ǵ� ���� ����� �׻� -10�ﺸ�� ũ�ų� ����, 10�ﺸ�� �۰ų� ����.

// int -21�� ~ 21���̹Ƿ� int ��� ����

/*
 
 1 2 3 . . . N - 1     ->   N-1���� ī�� �� �ߺ�����(���� ī��� �� �� ����ؼ� )  ,  N-1 ���� ���� �ְ� ����   ->  10! = 3628800    ->  2�ʸ��� ���� -> ���Ʈ���� ��� ����
 
 �ʿ亯�� ->  N , max, min      ,  nums[], operators[],  order[]
 
*/

public class Q14888 {
	static int N, max, min;
	static int[] nums, operators, order;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st, st2;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		input();
		rec_func(1); // ù��° ���Һ��� ��û
		sb.append(max).append('\n').append(min);
		System.out.println(sb.toString());
	}
	
	// order[1...N-1] �� �����ڵ��� ������� ����
	static void rec_func(int k) {
		if(k==N) {
			// �ϼ��� �Ŀ� �°� ����� �ؼ� ���信 ���� �۾�
			int value = calculator();
			max = Math.max(max, value);
			min = Math.min(min, value);
		}else {
			// k��° �����ڴ� ������ ������ ���ΰ�?
			for(int cand = 1; cand <= 4; cand++ ) {
				if(operators[cand] >= 1) {
					operators[cand]--;  //����Ѱ� �����Ͽ� ��� ó��
					order[k] = cand;
					rec_func(k+1);
					operators[cand]++;
					order[k] = 0;
				}
			}
		}
	}
	
	// �ϼ��� �Ŀ� �°� ����� �ؼ� ���信 ���� �۾�
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
