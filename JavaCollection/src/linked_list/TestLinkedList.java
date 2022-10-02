package linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();//size=0
		Collections.addAll(l1, "one", "two", "three", "four", "five");
//		System.out.println(l1.getFirst());
//		System.out.println(l1.getLast());
		System.out.println(l1.peekLast());
		System.out.println(l1.removeFirst());
	}

}
