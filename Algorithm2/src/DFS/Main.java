package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static boolean[] visited;
	static int[][] map;
	static BufferedReader br;
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static int N, M, start, end;

	public static void main(String[] args) throws Exception {
		input();
		init();
		initGraph();
		dfs(1);
		System.out.println(sb.toString());
	}

	static void dfs(int point) {
		Stack<Integer> stack = new Stack<>();
		stack.push(point);
		visited[point] = true;
		sb.append(point).append(" ");
		while (!stack.isEmpty()) {
			for (int i = 1; i <= N; i++) {
				if (map[point][i] == 1 && visited[i] == false) { // 다음 정점과 연결되어 있고 아직 방문하지 않았다면
					stack.push(i);
					visited[i] = true;
					dfs(i);
				}
			}
			stack.pop();
		}
	}

	static void input() throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	}

	static void init() {
		map = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
	}

	static void initGraph() throws Exception {
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			map[start][end] = 1;
			map[end][start] = 1;
		}
	}
}