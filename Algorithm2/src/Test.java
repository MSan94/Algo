import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String answer = "";
		int[] number = {6,10,2};
		Arrays.sort(number);
	
		for(int i=0; i<number.length; i++) {
			answer += String.valueOf(number[i]);
		}
		System.out.println(answer);
		
	}
}
