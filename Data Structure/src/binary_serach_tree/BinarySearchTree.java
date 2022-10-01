package binary_serach_tree;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;
		while (true) {
			if (temp.getData() == data)
				return false;
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}

		}

	}
	public Node getRoot() {
		return root;
	}
	
	public void preOrder(Node root) {
		if(root == null)
			return;
		System.out.print(root.getData()+" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	public void inOrder(Node root) {
		if(root == null)
			return;
		inOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrder(root.getRight());
	}
	
	public void postOrder(Node root) {
		if(root  == null)
			return;
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData()+" ");
	}
	
	public boolean delete(int data) {
		if(root == null)
			return false;
		// locate the node to be deleted along with parent
		Node parent = root;
		Node del = root;
		while(data != del.getData()) {
			if(data < del.getData()) {
				parent = del;
				del = del.getLeft();
			}
			else {
				parent = del;
				del = del.getRight();
			}
			if(del == null)
				return false;
		}
		// check if node is terminal node or not
		while(true) {
			if(del.getLeft() == null && del.getRight() == null) {
				// check if del is root node
				if(del == root) {
					root = null;
					return true;
				}
				// check if del is left child
				if(parent.getLeft() == del) {
					parent.setLeft(null);
					return true;
				}
				else {
					parent.setRight(null);
				}
				return true;
				
			}
			//if del is non terminal node, shift it down to tree
			if(del.getLeft() != null) {
				// find max from left subtree of del
				parent = del;
				Node max = del.getLeft();
			}
		}
		
		
		
	}
	
	public void preOrder() {
		Node[] stack = new Node[100];
		int top = -1;
		Node temp = root;
		while(top != -1 && root != null) {
			while(temp != null) {
				System.out.print(temp.getData()+" ");
				stack[++top] = temp;
				temp = temp.getLeft();
			}
			temp = stack[top--].getRight();
		}
		System.out.println();
	}
	public void inOrder() {
		
	}

}
