package DoublyLinkedList;

public class Node {
	
	private int data;
	Node prev,next;
	
	public Node(int data) {
		this.data=data;
		this.prev=null;
		this.next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
