package singly_linked_list;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(20, 2);
//		list.insert(5, 0);
//		list.delete(1);
//		list.delete(5);
		list.deleteByPosition(1);
		list.display();
		System.out.println();
		list.displayRev();
		System.out.println();
		System.out.println("Size of List : "+list.size());
	}

}
