package doubly_linked_list;

public class TestDLL {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.display();
		dll.insert(50, 1);
		dll.display();
		dll.insert(60, 3);
		dll.display();
	}

}
