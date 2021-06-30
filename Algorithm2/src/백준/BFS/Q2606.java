package น้มุ.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {
	static int cpu[][];
	static int visit[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cpuCount = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		cpu = new int[cpuCount + 1][cpuCount + 1];
		visit = new int[cpuCount + 1];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			cpu[a][b] = 1;
			cpu[b][a] = 1;
		}
		System.out.println(bfs());
	}

	static int bfs() {
		Queue<Integer> queue = new LinkedList<>();
		visit[1] = 1;
		queue.offer(1);
		int cnt = 0;
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i = 1; i < cpu.length; i++) {
				if (cpu[x][i] == 1 && visit[i] != 1) {
					queue.offer(i);
					visit[i] = 1;
					cnt++;
				}
			}
		}
		return cnt;
	}
}
