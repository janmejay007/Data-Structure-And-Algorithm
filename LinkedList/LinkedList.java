package LinkedList;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		head=null;
	}
	
	@SuppressWarnings("unused")
	public boolean insertAtLast(int data) {
		
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
	@SuppressWarnings("unused")
	public boolean insertAtPosition(int data,int pos) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
		}
		if(pos==1) {
			newNode.setNext(head);;
			head=newNode;
			return true;
		}
		Node temp=head;
		
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
			if(temp==null) {
				return false;
			}
			
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		temp=newNode;//doubt
		
		return true;
	}
	
	public boolean deleteAtBeg() {
		head=head.getNext();
		return true;
	}
	
	public boolean deleteAtLast() {
		Node temp=head;
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);;
		return true;
	}
	
	public void display() {
		Node show=head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
			
		}
	}

}
