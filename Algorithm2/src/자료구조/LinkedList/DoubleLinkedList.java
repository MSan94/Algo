package 자료구조.LinkedList;

public class DoubleLinkedList <T>{
	public Node<T> head = null;
	public Node<T> tail = null;
	
	public class Node<T>{
		T data;
		Node<T> prev = null;
		Node<T> next = null;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	public void addNode(T data) {
		if(this.head == null) {
			this.head = new Node<T>(data);
			this.tail = this.head;
		}else {
			Node<T> node = this.head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node<T>(data);
			node.next.prev = node;
			this.tail = node.next;
		}
	}
	//앞에서부터 찾기
	public T searchFromHead(T isData) {
		if(this.head == null) {
			return null;
		}else {
			Node<T> node = this.head;
			while(node != null) {
				if(node.data == isData) {
					return node.data;
				}else {
					node = node.next;
				}
			}
			return null;
		}
	}
	
	//뒤에서부터 찾기 
	public T searchFromTail(T isData) {
		if(this.head == null) {
			return null;
		}else {
			Node<T> node = this.tail;
			while(node != null) {
				if(node.data == isData) {
					return node.data;
				}else {
					node = node.prev;
				}
			}
			return null;
		}
	}
	
	
	public void printAll() {
		if(this.head != null) {
			Node<T> node = this.head;
			System.out.println(node.data);
			while(node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();
		MyLinkedList.addNode(1);
		MyLinkedList.addNode(2);
		MyLinkedList.addNode(3);
		MyLinkedList.addNode(4);
		MyLinkedList.addNode(5);
		MyLinkedList.printAll();
		System.out.println(MyLinkedList.searchFromHead(10));
		System.out.println(MyLinkedList.searchFromTail(3));
	}
}
