package 백준.재귀;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q11729 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int num; //원판 갯수 
		num=scanner.nextInt(); 
		hanoi(1,2,3,num);

	}
 
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
 
	public static void hanoi(int from,int m,int to,int num){
		if(num==0)
			return; 
		hanoi(from,to,m,num-1); 
		System.out.printf("%d : %d -> %d\n",num,from,to);
		hanoi(m,from,to,num-1);
	}
}
