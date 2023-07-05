package MiddleElementOfSinglyLinkedList;





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
		
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		
		last.setNext(newNode);
		return true;
	}
	
	public void display() {
		Node show=head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
	}
	
	public int middleElement() {
		Node prev=head;
		Node temp=head;
		
		while(temp.getNext()!=null) {
			prev=prev.getNext();
			temp=temp.getNext().getNext();
		}
		return prev.getData();
	}
	
	


	
	
	
	
	
	
	
	
	

}
