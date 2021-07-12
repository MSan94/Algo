package ��Ʈ��ŷ;

import java.util.ArrayList;

public class NQueen {
	
	public static void main(String[] args) {
		NQueen nObject = new NQueen();
		nObject.dfsFunc(4,0,new ArrayList<Integer>());
	}
	
	public boolean isAvailable(ArrayList<Integer> candidate, Integer currentCol) {
		Integer currentRow = candidate.size();
		for(int i=0; i<currentRow; i++) {
			// ���� �÷���ġ - �� �÷� ��ġ ���ų�,   ����row - ��row�� ������  ( Promising )
			if((candidate.get(i)==currentCol) || (Math.abs(candidate.get(i) - currentCol) == currentRow - i)) {
				return false;
			}
		}
		return true;
	}
	
	// currentRow -> ���� üũ�ؾ��� ���� �������
	// currentCandidate -> ���� ���� x�� üũ�ϴµ� �� ������ ������ ���� ������� �˷���
	public void dfsFunc(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate) {
		if(currentRow == N) { //��ü ���� �ٵ��� ������ �ظ� ã�Ҵٴ� �ǹ� 
			System.out.println(currentCandidate);
			return;
		}
		
		// ��� ���� (��ȸ)
		for(int i=0; i<N; i++) {
			// true -> �ش���ġ�� ����
			if(this.isAvailable(currentCandidate, i) == true) { // ������ ���� ��ġ��� �Բ� ��� ��ġ�� üũ�� ������
				currentCandidate.add(i);
				this.dfsFunc(N,currentRow+1, currentCandidate);
				
				// ���ǿ� �����ϴ°� ������ �ش� candidate�� ���� ( Pruning )
				currentCandidate.remove(currentCandidate.size() - 1);
			}
		}
		
	}
}
