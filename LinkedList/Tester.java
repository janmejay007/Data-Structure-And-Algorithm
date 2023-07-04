package LinkedList;

public class Tester {
			
	
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertAtLast(10);
		l1.insertAtLast(20);
		l1.insertAtPosition(12, 1);
		l1.insertAtPosition(12, 4);
		l1.display();

		System.out.println();
		l1.deleteAtLast();

		
		l1.display();
	}
	
}
