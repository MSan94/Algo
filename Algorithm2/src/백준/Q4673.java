package น้มุ;

public class Q4673 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		boolean arr[] = new boolean[10001];
		for(int i=1; i<10001; i++) {
			int num = i;
			int sum = num;
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if(sum < 10001) {
				arr[sum] = true;
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			if(!arr[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb.toString());
	}
}
