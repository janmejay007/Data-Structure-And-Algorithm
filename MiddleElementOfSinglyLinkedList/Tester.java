package MiddleElementOfSinglyLinkedList;



public class Tester {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		l1.insert(20);
		l1.insert(10);
		l1.insert(30);
		l1.insert(20);
		l1.insert(100);
		l1.insert(10);
		l1.insert(40);
		l1.insert(70);
		l1.insert(20);
		
		l1.display();
		System.out.println();
		//l1.delete();
		//l1.display();
		System.out.println(l1.middleElement());
		
	}

}
