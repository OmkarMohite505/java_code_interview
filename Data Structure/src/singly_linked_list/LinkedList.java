package singly_linked_list;

public class LinkedList {
	private Node head;
	private int size;

	public LinkedList() {
		super();
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
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

	public boolean insert(int data, int position) {
		if (position <= 0)
			return false;
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (position == 1 && head == null) {
			head = newNode;
			return true;
		}
		if (position == 1) {
			Node temp = head;
			head = newNode;
			head.setNext(temp);
			return true;
		}
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null)
				return false;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;

	}

	public boolean delete(int data) {
		if (head == null)
			return false;
		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}
		Node del = head;
		Node prev = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null)
				return false;
		}
		prev.setNext(del.getNext());
		return true;

	}

	public boolean deleteByPosition(int position) {
		if (position <= 0)
			return false;
		if (position == 1) {
			head = head.getNext();
			return true;
		}
		Node prev, del;
		prev = del = head;
		for (int i = 1; i < position; i++) {
			prev = del;
			del = del.getNext();
			if(del == null)
				return false;
		}
		prev.setNext(del.getNext());
		return true;
		
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}
	
	public void displayRev() {
		int stack[] = new int[20];
		int top = -1;
		Node temp = head;
		while(temp != null) {
			stack[++top] = temp.getData();
			temp = temp.getNext();
		}
		
		while(top >=0){
			System.out.print(stack[top--]+" ");
		}
	}
	
	public int size() {
		int cnt=0;
		Node temp = head;
		while(temp != null) {
			cnt++;
			temp = temp.getNext();
		}
			
		return cnt;
	}

}
