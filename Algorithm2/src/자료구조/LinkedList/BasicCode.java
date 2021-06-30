package 자료구조.LinkedList;

class SingleLinkedList<T> {
	public Node<T> head = null;
	
	// 노드 생성
	public class Node<T> {
		T data;
		Node<T> next = null;

		public Node(T data) {
			this.data = data;
		}
	}

	public void addNode(T data) {
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> node = this.head;
			// 끝 노드까지 가도록 구성
			while(node.next != null) {
				node = node.next;
			}
			// 노드 연결
			node.next = new Node<T>(data);
		}
	}
	
	// 데이터 중간 삽입
	public void addNodeInside(T data, T isData) {
		Node<T> searchedNode = this.search(isData);
		
		if(searchedNode == null) {
			// null이면 해당 값을 가진 데이터가 없음
			this.addNode(data); // 맨위에 넣기
		}else {
			// 데이터가 있다면
			Node<T> nextNode = searchedNode.next;
			searchedNode.next = new Node<T>(data); //원래 있던 노드가 새 노드의 주소를 가리킴
			searchedNode.next.next = nextNode; // 기존에 데이터가 가지고 있던 다음 노드의 주소 가짐
		}
	}
	
	// 특정 데이터 삭제
	public boolean delNode(T isData) {
		if(this.head == null) {
			return false;
		}else {
			Node<T> node = this.head;
			if(node.data == isData) {
				this.head = this.head.next; //head가 가리키고 있던 객체를 this.head가 가리키고 있던 객체가 있는데 this.head.next로 바꿔줬기에 기존에 가리키던얘는 gb에 의해 삭제
				return true;
			}else {
				while(node.next != null) {
					if(node.next.data == isData) {
						node.next = node.next.next;
						return true;
					}
					node = node.next;
				}
			}
			return false;
		}
	}
	
	// 데이터 찾기
	public Node<T> search(T data){
		if(this.head == null) {
			return null;
		}else {
			Node<T> node = this.head;
			while(node != null) {
				if(node.data == data) {
					return node;
				}else {
					node = node.next;
				}
			}
			// 검사 후 해당 노드가 없다면
			return null;
		}
	}
	
	public void printAll() {
		if(head != null) {
			Node<T> node = this.head;
			System.out.println(node.data);
			while(node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}
}

public class BasicCode {

	public static void main(String[] args) {
		SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
		MyLinkedList.addNode(1);
		MyLinkedList.addNode(2);
		MyLinkedList.addNode(3);
		MyLinkedList.addNode(4);
		MyLinkedList.addNode(5);

		MyLinkedList.delNode(3);
		MyLinkedList.delNode(1);
		MyLinkedList.delNode(5);
		MyLinkedList.delNode(23);
		
//		MyLinkedList.addNodeInside(5, 2);;

//		System.out.println(MyLinkedList.head.data);
//		System.out.println(MyLinkedList.head.next.data);
		MyLinkedList.printAll();
		
	}

}
