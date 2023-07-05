package RemoveDuplicateFromUnsortedLinkedList;

import java.util.HashMap;
import java.util.Map;


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
	public boolean insertpos(int data,int pos) {
		System.out.println("haha");
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return true;
		}
		
		if(pos==1) {
			newNode.setNext(head);
			head=newNode;
		}
		return true;
		
	}
	
	public void delete() {
		Node prev=head;
		Node del=head;
		
		while(del.getNext()!=null) {
			prev=del;
			del=del.getNext();
		}
		
		prev.setNext(null);
	}
	public void deleteDuplicate() {
		
		Node var=head;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(var!=null) {
			map.put(var.getData(),var.getData());
			var=var.getNext();
		}
		
		System.out.println(map.keySet());
		
		LinkedList l2=new LinkedList();
//		for(int i=map.size();i>=1;i--) {
//			System.out.println(map.get(i));
//			l2.insertpos(,1);
//			System.out.println(i);
//		}
		for(int i:map.values()) {
			l2.insert(i);
		}
		
		l2.display();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
