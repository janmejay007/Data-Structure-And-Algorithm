package DoublyLinkedList;

public class DLL  {
	
	private Node head;
	
	public DLL() {
		head=null;	
	}
	
	
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
		newNode.setPrev(temp);
		
		return true;
		
	}
	
	@SuppressWarnings("unused")
	public boolean insertPos(int data,int pos) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		if(pos==1) {
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
			return true;
		}
		
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
		}
		temp.getNext().setPrev(newNode);
		newNode.setPrev(temp);
		
//		newNode.setNext(temp.getNext());
//		newNode.setPrev(temp);
		
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
