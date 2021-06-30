/*

병합정렬
- 재귀용법을 활용한 정렬 알고리즘
	1. 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
	2. 각 부분 리스트를 재귀적으로 합볍 정렬을 이용하여 정렬
	3. 두 부분 리스트를 다시 하나의 정렬된 리스트로 합병
	
ex)  49,97,53,5,33,65,62,51	

- split 단계
	1. 49  97  53  5  33  65  62  51
	2. 49,97  5,53  33,65  51,62
	3. 5,49,53,97    33,51,62,65
	4. 5,33,49,51,53,62,65,97

알고리즘 이해
- 데이터가 들어오면, 두 단계로 분리해서 이해할 수 있다.
	1. 정렬되지 않은 배열을 끝까지 분리하는 단계
	2. 분리한 데이터를 단계별로 합치는 단계
	
- 분할	
	- 만약 배열 갯수가 한개이면 해당 값 리턴
	- 그렇지 않으면, 배열을 앞 뒤, 두개로 나누기
	- leftArr = mergeSplitFunc(앞)
	- reightArr = mergeSplitFunc(뒤)
	- return mergeFunc(leftArr, rightArr)

- 분할
	- ArrayList 만들기
	- leftPoint, rightPoint = 0
	- Case1 : leftList, RightList 둘다 있을 때
		- while(leftList.size() > leftPoint && rightList.size() > rightPoint)
			- 만약 leftPoint나 rightPoint가 이미 leftList 또는 rightList 배열을 다 순회했다면, 
			  그 반대쪽 데이터를 그대로 넣고, 해당 인덱스 1증가
			- if(leftList.get(leftPoint) > rightList.get(rightPoint))
				- mergedList.add(rightList.get(rightPoint));
				- rightPoint += 1;
			- else
				- mergedList.add(leftList.get(leftPoint));
				- leftPoint += 1;
	- Case2 : RightList만 없을 때 : 나머지 LeftList에 있는 데이터를 그대로 mergedList 뒤에 넣음
	- Case3 : LeftList만 없을 때 : 나머지 RightList에 있는 데이터를 그대로 mergedList 뒤에 넣음

- 알고리즘 분석
	- 몇 단계 깊이까지 만들어지는지를 depth라고 하고 i로 두자. 맨 위 단계는 0
		- 각 단계에 있는 하나의 노드 안의 배열의 길이는 n/2^i
		- 각 단계에는 2^i개의 노드가 있다.
	- 각 단계의 각 노드 안의 배열 데이터는 한번씩은 체크되므로, 각 단계는 각각 2^i * n/2^i = O(n) 시간 복잡도
	- 단계는 항상 log2n개 만큼 만들어짐, 시간 복잡도는 결국 O(log n), 2는 역시 상수이므로 삭제
	- 따라서, 단계별 시간복잡도는 O(n) ^ O(log n) = O(n log n)
*/
