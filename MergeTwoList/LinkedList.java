package MergeTwoList;

import MiddleElementOfSinglyLinkedList.Node;

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

	public void mergeList(LinkedList l1, LinkedList l2) {
		if (l1.head == null) {
			head = l2.head;
		}
		if (l2.head == null) {
			head = l1.head;
		}
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		Node curr = null;
		if (head == null) {
			head = temp1;
			curr = temp1;
			temp1 = temp1.getNext();
			while (temp1 != null && temp2 != null) {

				curr.setNext(temp2);
				curr = temp2;
				temp2 = temp2.getNext();

				Node dummy = temp1;
				temp1 = temp2;
				temp2 = dummy;
			}
			if (temp1 != null) {
				curr.setNext(temp1);
			}
			if (temp2 != null) {
				curr.setNext(temp2);
			}

//		Node show=head;
//		System.out.println();
//		while(show!=null) {
//			System.out.print(show.getData()+" ");
//			show=show.getNext();
//		}

		}

	}
}
