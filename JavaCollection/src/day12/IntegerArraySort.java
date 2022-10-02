package day12;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArraySort {

	public static void main(String[] args) {
		int[] data = { 12, 3, 45, 123, -80, 90, 100 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : data)
			list.add(i);
		Collections.sort(list);
		list.stream().forEach(n -> System.out.print(n+" "));
//		Collections.reverse(list);
		
		System.out.println();
		list.stream().forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		list.sort(Collections.reverseOrder());
		list.stream().forEach(n -> System.out.print(n+" "));
	}

}
