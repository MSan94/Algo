package 백준.스택;

// 17064KB  168ms

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String text = br.readLine();
			if (text.equals(".")) {
				System.out.println(sb.toString());
				return;
			}
			sb.append(isBalanced(text));
		}
	}

	static String isBalanced(String text) {
		boolean result = true;
		Stack<Character> stack = new Stack<Character>();

		for (char c : text.toCharArray()) {
			if(c == '[' || c == '(') {
				stack.push(c);
			}else if(c == ']') {
				if(stack.isEmpty() || stack.pop() != '[') {
					result = false;
					break;
				}
			}else if(c == ')') {
				if(stack.isEmpty() || stack.pop() != '(') {
					result = false;
					break;
				}
			}
		}
        if (!stack.isEmpty()) {
            result = false;
        }
		return result ? "yes\n" : "no\n";
	}
}
