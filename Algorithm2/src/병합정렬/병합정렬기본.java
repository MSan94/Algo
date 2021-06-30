package 병합정렬;

import java.util.ArrayList;
import java.util.Arrays;

public class 병합정렬기본 {
	public static void main(String[] args) {
		System.out.println(splitFunc(new ArrayList<Integer>(Arrays.asList(8,1,9,5,3,7))));
	}

	// 분할 메서드
	static ArrayList<Integer> splitFunc(ArrayList<Integer> dataList) {
		if (dataList.size() <= 1) {
			return dataList;
		}
		int mid = dataList.size() / 2;
		ArrayList<Integer> leftArr = new ArrayList<Integer>();
		ArrayList<Integer> rightArr = new ArrayList<Integer>();

		leftArr = splitFunc(new ArrayList<Integer>(dataList.subList(0, mid))); // 0부터 mid - 1 인덱스 까지 서브배열로 추출
		rightArr = splitFunc(new ArrayList<Integer>(dataList.subList(mid, dataList.size())));
		return mergeFunc(leftArr, rightArr);
	}

	// 병합 메서드
	static ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		int leftPoint = 0;
		int rightPoint = 0;
		
		// CASE1 : left/right 둘 다 있을때
		while(leftList.size() > leftPoint && rightList.size() > rightPoint) {
			if(leftList.get(leftPoint) > rightList.get(rightPoint)) {
				mergedList.add(rightList.get(rightPoint));
				rightPoint++;
			}else {
				mergedList.add(leftList.get(leftPoint));
				leftPoint++;
			}
		}
		// CASE2 : right 데이터가 없을 때
		while(leftList.size() > leftPoint) {
			mergedList.add(leftList.get(leftPoint));
			leftPoint++;
		}
		
		
		// CASE3 : left 데이터가 없을 때
		while(rightList.size() > rightPoint) {
			mergedList.add(rightList.get(rightPoint));
			rightPoint++;
		}
		
		return mergedList;
	}
}
