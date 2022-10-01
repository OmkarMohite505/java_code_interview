package binary_serach_tree;

public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(60));
		System.out.println(bst.insert(40));
		System.out.println(bst.insert(10));
		bst.insert(5);
		bst.insert(70);
		
		bst.preOrder(bst.getRoot());
		System.out.println();
		bst.inOrder(bst.getRoot());
	}

}
