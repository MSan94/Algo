package 백트래킹;

import java.util.ArrayList;

public class NQueen {
	
	public static void main(String[] args) {
		NQueen nObject = new NQueen();
		nObject.dfsFunc(4,0,new ArrayList<Integer>());
	}
	
	public boolean isAvailable(ArrayList<Integer> candidate, Integer currentCol) {
		Integer currentRow = candidate.size();
		for(int i=0; i<currentRow; i++) {
			// 현재 컬럼위치 - 퀸 컬럼 위치 같거나,   현재row - 퀸row가 같으면  ( Promising )
			if((candidate.get(i)==currentCol) || (Math.abs(candidate.get(i) - currentCol) == currentRow - i)) {
				return false;
			}
		}
		return true;
	}
	
	// currentRow -> 지금 체크해야할 행이 어디인지
	// currentCandidate -> 현재 행은 x를 체크하는데 그 위에서 선정된 퀸은 어디인지 알려줌
	public void dfsFunc(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate) {
		if(currentRow == N) { //전체 행을 다돌고 적절한 해를 찾았다는 의미 
			System.out.println(currentCandidate);
			return;
		}
		
		// 재귀 돌림 (순회)
		for(int i=0; i<N; i++) {
			// true -> 해당위치가 적합
			if(this.isAvailable(currentCandidate, i) == true) { // 기존의 퀸의 위치들과 함께 어느 위치를 체크할 것인지
				currentCandidate.add(i);
				this.dfsFunc(N,currentRow+1, currentCandidate);
				
				// 조건에 부합하는게 없으면 해당 candidate를 빼줌 ( Pruning )
				currentCandidate.remove(currentCandidate.size() - 1);
			}
		}
		
	}
}
