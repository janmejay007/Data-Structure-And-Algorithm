package Trees;

import java.util.Stack;

public class BST {
	public static class Node {
		private int data;
		private Node left, right;
		private Node root;

		public Node() {
			root = null;
		}

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		@SuppressWarnings("unused")
		public boolean insert(int data) {
			Node newNode = new Node(data);
			if (newNode == null) {
				return false;
			}

			if (root == null) {
				root = newNode;
				System.out.print(root.data + " ");
				return true;
			}

			Node temp = root;
			while (true) {
				if (temp.data == data) {
					return false;
				}
				if (data < temp.data) {
					if (temp.left == null) {
						temp.left = newNode;
						System.out.print(temp.left.data + " ");
						return true;
					}
					temp = temp.left;
				} else {
					if (temp.right == null) {
						temp.right = newNode;
						System.out.print(temp.right.data + " ");
						return true;
					}
					temp = temp.right;
				}
			}
		}

		public void preOrder() {
			Node temp = root;
			Stack<Node> stack = new Stack<Node>();
			System.out.println();

			while (temp != null || !stack.isEmpty()) {
				while (temp != null) {
					System.out.print(temp.data + " ");
					stack.push(temp);
					temp = temp.left;
				}

				temp = stack.pop().right;

			}
		}

		public void postOrder() {
			Node temp = root;
			Node lastVisitedNode = null;
			Stack<Node> stack = new Stack<Node>();
			while (temp != null || !stack.isEmpty()) {
				if (temp != null) {
					stack.push(temp);
					temp = temp.left;
				} else {
					Node peekNode = stack.peek();

					if (peekNode.right != null && lastVisitedNode != peekNode.right) {
						temp = peekNode.right;
					} else {
						System.out.print(peekNode.data+" ");

						lastVisitedNode = stack.pop();
					}
				}

			}
		}

		public void inOrder() {
			System.out.println();
			Node temp = root;
			Stack<Node> stack = new Stack<Node>();
			while (temp != null || !stack.isEmpty()) {
				while (temp != null) {
					stack.push(temp);
					temp = temp.left;
				}

				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;

			}
		}

		public int max() {
			Node temp = root;
			while (temp.right != null) {
				temp = temp.right;
			}
			System.out.println();
			return temp.data;
		}
		
		public int min() {
			Node temp=root;
			while(temp.left!=null) {
				temp=temp.left;
			}
			return temp.data;
		}

		public boolean find(int data) {
			Node temp = root;
			if (temp == null) {
				return false;
			}
			if (data == temp.data) {
				return true;
			}

			if (data < temp.data) {
				while (temp != null) {
					temp = temp.left;
					if (data == temp.data) {
						return true;
					}
					return false;
				}
				return false;
			} else {
				while (temp != null) {
					temp = temp.right;
					if (data == temp.data) {
						return true;
					}
					return false;
				}
				return false;
			}

		}
//Counting the number of nodes
		public int count() {
			int count = 0;
			Node temp = root;
			Stack<Node> stack = new Stack<Node>();
			while (temp != null || !stack.isEmpty()) {
				while (temp != null) {
					count++;// 50//20//10
					stack.push(temp);
					temp = temp.left;
				}
				temp=stack.pop().right;
			}
				return count;
		}
		
		public boolean delete(int data) {
			Node parent=root;
			Node del=root;
			while(del.data!=data)
			{
				if(data<del.data) {
					parent=del;
					del=del.left;
				}
				else {
					parent=del;
					del=del.right;
				}
				if(del==null) {
					return false;
				}
			}
			while(true) {
			
				while(del.left==null && del.right==null) {
					if(data==root.data) {
						root=null;
						return true;	
					}
					if(parent.left==del) {
						parent.left=null;
					}
					else {
						parent.right=null;
					}
					return true;
				}
				//deleting a nonterminal node
				if(del.left!=null) {
					parent=del;
					Node max=del.left;
					while(max.right!=null) {
						parent=max;
						max=max.right;
					}
					//swap
					int temp=del.data;
					del.data=max.data;
					max.data=temp;
						del=max;
					}
				else {
					parent=del;
					Node min=del.right;
					while(del.left!=null) {
						parent=min;
						min=min.left;
					}
					int temp=del.data;
					del.data=min.data;
					min.data=temp;
					del=min;
				}
					
				}
			
				
				
			}
		}
	

	public static void main(String[] args) {

		Node n1 = new Node();
		n1.insert(10);
		n1.insert(30);
		n1.insert(50);
		n1.insert(5);
		n1.insert(40);
		n1.insert(7);
		n1.insert(3);
		n1.insert(45);
		n1.insert(20);
//		n1.insert(55);
//		n1.insert(80);
		n1.preOrder();
		n1.inOrder();
//		System.out.println(n1.max());
//		System.out.println(n1.find(20));
		System.out.println();
		n1.postOrder();
		System.out.println();
//		System.out.println(n1.count());
		System.out.println(n1.min());
		System.out.println(n1.delete(10));
		n1.inOrder();
		

	}

}
