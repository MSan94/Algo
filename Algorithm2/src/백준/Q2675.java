package น้มุ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			String result = "";
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<num; k++) {
					sb.append(str.charAt(j));
				}
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
