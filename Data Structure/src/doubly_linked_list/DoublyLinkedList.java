package doubly_linked_list;

public class DoublyLinkedList {
	private Node head;

	public DoublyLinkedList() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null)
			last = last.getNext();

		newNode.setPrev(last);
		last.setNext(newNode);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public boolean insert(int data, int position) {
		if (position <= 0)
			return false;
		Node newNode = new Node(data);

		if (position == 1) {
			if (head != null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null)
				return false;
		}

		Node next = prev.getNext();
		newNode.setPrev(prev);
		prev.setNext(newNode);
		if (head != null) {
			newNode.setNext(next);
			next.setPrev(newNode);
		}
		return true;

	}

	public boolean deleteByPosition(int position) {
		if (position <= 0 || head == null)
			return true;
		if (position == 1) {
			if (head.getNext() != null) {
				head.getNext().setPrev(null);
			}
			head = head.getNext();
			return true;
		}
		Node del = head;
		for (int i = 1; i < position; i++) {
			del = del.getNext();
			if(del == null)
				return false;
		}
		del.getPrev().setNext(del.getNext());
		if(del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}
	public boolean deleteByValue(int data) {
		if(head == null)
			return false;
		if(head.getData() == data) {
			if(head.getNext() != null) {
				head.getNext().setPrev(null);
			}
			head = head.getNext();
			return true;
		}
		Node del = head;
		while(del.getData() != data) {
			del = del.getNext();
			if(del == null)
				return false;
		}
		del.getPrev().setNext(del.getNext());
		if(del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}
	

}
