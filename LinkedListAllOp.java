package LinkedListP;

public class LinkedListAllOp {

	static class Node {
		private int data;
		private Node next;
		private Node head;

		public Node() {
			this.head = null;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		@SuppressWarnings("unused")
		public boolean insertData(int data) {
			Node newNode = new Node(data);
			if (newNode == null) {
				return false;
			}
			// insert first element
			if (head == null) {
				head = newNode;
				return true;
			}
			// insert at last
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			return true;

		}

		// insert at pos
		public boolean insertAtPosition(int data, int pos) {
			Node newNode = new Node(data);
			if (newNode == null)
				return false;

			if (head == null || pos < 1) {
				head = newNode;
				return true;
			}
			// AddAtFirstPos
			if (pos == 1) {
				newNode.next = head;
				head = newNode;
				return true;
			}
			// AddAtGivenPos
			Node temp = head;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.next;
				if (temp == null) {
					return false;
				}
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return true;
		}

		public void display() {
			Node show = head;
			while (show != null) {
				System.out.print(show.data + " ");
				show = show.next;
			}
			System.out.println();

		}

		public void reverseList() {
			Node temp = null;
			Node curr = head;
			Node prev = null;
			while (curr != null) {
				temp = curr.next;// no error
				curr.next = prev;
				prev = curr;
				curr = temp;
			}
			// Node rshow=curr;
			while (prev != null) {
				System.out.print(prev.data + " ");
				prev = prev.next;
			}

		}

		public void deleteAtPos(int pos) {
			Node temp = head;
			if (head == null) {
				return;
			}

			if (pos == 1) {
				head = head.next;
				return;
			}

			for (int i = 1; i < pos - 1; i++) {
				temp = temp.next;

				if (temp == null) {
					return;
				}

			}
			// important
			if (temp.next != null) {
				temp.next = temp.next.next;
				return;
			}

		}

		public void deleteLast() {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}

		public void deleteByData(int data) {
			Node temp = head;
			while (temp.next.data != data) {
				temp = temp.next;
				if (temp.next == null) {
					return;
				}
			}
			temp.next = temp.next.next;
		}

		public int countNode() {
			int count = 0;
			if (head == null)
				return 0;

			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;

			}
			return count;
		}

		public boolean duplicate() {

			Node before = head;
			Node after = head;
			while (before != null) {
				after = before.next;
				while (after != null) {
					if (before.data == after.data) {
						return true;
					}
					after = after.next;
				}
				before = before.next;
			}
			return false;
		}

		public void deleteDuplicate() {
			Node before = head;
		
			while (before != null) {
				Node after = before;
				while (after.next != null) {
					// if(before.data)
					if (after != null) {
						if (before.data == after.next.data) {
							after.next=after.next.next;
						}
						else {
							after = after.next;
						}
					}

				
				}
				before = before.next;
			}
		}

	}

	public static void main(String[] args) {

		Node n1 = new Node();
		// System.out.println(n1.getClass().getName());
		n1.insertData(100);
		n1.insertData(100);
		n1.insertData(700);
		n1.insertData(101);
		n1.insertData(102);
		n1.insertData(100);

		n1.insertData(103);
		n1.insertData(102);
		n1.insertData(500);
		n1.insertData(700);
		n1.insertData(700);
		n1.insertData(500);
		n1.insertData(700);
		n1.insertData(102);

		n1.display();
		// n1.insertAtPosition(11, 1);
		n1.display();
		n1.insertAtPosition(33, 3);
		// n1.display();
		// n1.reverseList();
		// n1.deleteAtPos(3);
		// n1.display();
		// n1.deleteLast();
//	n1.deleteByData(100);
		// n1.display();

//		System.out.println(n1.countNode());
//		System.out.println(n1.duplicate());

		n1.deleteDuplicate();
		n1.display();

	}

}