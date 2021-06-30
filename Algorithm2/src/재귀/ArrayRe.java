package Àç±Í;

import java.util.ArrayList;

class Factorial{
	public int factorialFunc(ArrayList<Integer> dataList) {
		if(dataList.size() <= 0) {
			return 0;
		}
		return dataList.get(0) + this.factorialFunc(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
	}
}

public class ArrayRe {
	public static void main(String[] args) {
		Factorial fa = new Factorial();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			arr.add(i);
		}
		System.out.println(fa.factorialFunc(arr));
	}
}
