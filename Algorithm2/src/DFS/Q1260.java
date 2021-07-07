package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/*
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.


첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
탐색을 시작할 정점의 번호 V가 주어진다. 
*/
public class Q1260 {
	
	static int N,M,V,start,end;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] map;
	static boolean[] visited;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) throws Exception{
		input();
		initArr();
		drawMap();
		dfs(V);
		initVisited();
		sb.append('\n');
		bfs(V);
		System.out.println(sb.toString());
	}
	
	static void dfs(int point) {
		Stack<Integer> stack = new Stack<>();
		stack.push(point);
		visited[point] = true;
		sb.append(point).append(" ");
		while(!stack.isEmpty()) {
			for(int i=1; i<=N; i++) {
				if(map[point][i] == 1 && visited[i] == false) {
					stack.push(i);
					visited[i] = true;
					dfs(i);
				}
			}
			stack.pop();
		}
	}
	
	static void bfs(int point) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(point);
		visited[point] = true;
		while(!queue.isEmpty()) {
			int x = queue.poll();
			sb.append(x).append(" ");
			for(int i=1; i<=N; i++) {
				if(map[x][i] == 1 && visited[i] == false) {
					visited[i] = true;
					queue.offer(i);
				}
			}
		}
	}
	
	static void initVisited() {
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
	}
	
	
	
	static void input() throws Exception{
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
	}
	static void initArr() throws Exception{
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
	}
	static void drawMap() throws Exception{
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			map[start][end] = 1;
			map[end][start] = 1;
		}
	}
}
