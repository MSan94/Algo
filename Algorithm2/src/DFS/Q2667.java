package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2667 {
	static int[][] map = new int[25][25];	// 집의 존재 입력할 2차원 배열
	static boolean[][] visit = new boolean[25][25];	// 탐색할 집의 방문 여부 체크
	private static int[] dx = {0, -1, 0, 1};	// dx, dy = 상하좌우
	private static int[] dy = {-1, 0, 1, 0};	
	static int count = 1;	// 방문한 단지 번호(연결된 단지가 아닐경우 1씩 증가)
	static int N;	
	
	
	public static void main(String[] args) throws Exception {
		input();
		init();
	}

	static void input() throws Exception {
	}

	static void init() throws Exception {
	
		
	}

}
