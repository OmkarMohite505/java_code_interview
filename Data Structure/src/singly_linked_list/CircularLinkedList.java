package singly_linked_list;

public class CircularLinkedList {
	private Node head;
	private Node last;

	public CircularLinkedList() {
		head = null;
		last = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = last = newNode;
			newNode.setNext(head);
			last = head;
			return true;
		}
		if(head.getNext() == head) {
			newNode.setNext(head);
			head.setNext(newNode);
			last = newNode;
			return true;
		}
		Node temp = head;

		newNode.setNext(head);
		last.setNext(newNode);
		return true;
	}
	public int size() {
		return 1;
	}
	
	public void display() {
		Node temp = head;
		do {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}while(temp!= head);
//		while(temp != head)
//			System.out.print(temp.getData()+" ");
	}

}
