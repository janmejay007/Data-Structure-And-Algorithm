package MiddleElementOfSinglyLinkedList;

public class LeftMiddleElement {

	public static class Node {
		private int data;
		private Node next;
		private Node head;

		public Node() {
			head = null;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
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
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
			return true;
		}

		public void display() {
			Node show = head;
			while (show != null) {
				System.out.print(show.data + " ");
				show = show.next;
			}
		}

		// Q.Printing left middle in case of even and middle in case of odd
		public void leftmiddle() {
			System.out.println();
			int count = 0;
			Node slow = head;
			Node fast = head;
			Node med = head;
			Node temp = head;

			while (temp != null) {
				count++;
				temp = temp.next;
			}
			// System.out.println(count);
			while (fast != null && fast.next != null) {
				med = slow;
				slow = slow.next;

				fast = fast.next.next;
			}
			if (count % 2 != 0) {
				System.out.println(slow.data);
			} else {
				System.out.println(med.data);
			}
		}
		//Deleting middle of linked list
		public void deleteMiddle() {
			if(head.next==null) {
				head=null;
				return;
			}
			Node slow=head;
			Node fast=head;
//			Node temp=head;
			while(fast.next.next!=null&&fast.next.next.next!=null) {
			
				//temp=slow;
				slow=slow.next;
				fast=fast.next.next;
			}
//			temp.next=slow.next;
			slow.next=slow.next.next;
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node();
		n1.insert(10);
//	n1.insert(11);
//	n1.insert(12);
//	n1.insert(13);
//		n1.insert(14);
//		n1.insert(15);
//		n1.insert(17);
//		n1.insert(18);
		n1.display();
		//n1.leftmiddle();
		System.out.println();
		n1.deleteMiddle();
		n1.display();

	}

}
