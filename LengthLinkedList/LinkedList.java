package LengthLinkedList;

public class LinkedList {
	
	
	private Node head;
	
	public LinkedList() {
		head=null;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(newNode);
		return true;
		
		
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	int count=0;
	
	public int size() {
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	

}
