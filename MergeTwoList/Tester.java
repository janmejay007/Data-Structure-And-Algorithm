package MergeTwoList;



public class Tester {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		LinkedList l3=new LinkedList();
		
		l1.insert(20);
		l1.insert(10);
		l1.insert(30);
		l1.insert(20);
		l1.insert(100);
		l1.insert(10);
		l1.insert(40);
		l1.insert(70);
		l1.insert(20);
		l1.insert(20);
		l2.insert(11);
		l2.insert(33);
		l2.insert(22);
		l2.insert(101);
		l2.insert(11);
		l2.insert(41);
		l2.insert(77);
		l2.insert(23);
		
		l1.display();
		
		System.out.println();
		l2.display();
		
		l3.mergeList(l1, l2);
		l3.display();
		
		
		
	}

}
