package Cycle;



public class LinkedList {
	
	private Node head;

	public LinkedList() {
		head = null;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}

		last.setNext(newNode);
		return true;
	}

	public void display() {
		Node show = head;
		System.out.println();
		while (show != null) {
			System.out.print(show.getData() + " ");
			show = show.getNext();
		}
	}
	
	public void Cycle() {
		Node curr1=head;
		Node curr2=head;
		while(true) {
			
			curr1=curr1.getNext().getNext(); 
			curr2=curr2.getNext();
			if(curr1==curr2) {
				System.out.println(curr1.getData());
				System.out.println(curr1);
				break;
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
