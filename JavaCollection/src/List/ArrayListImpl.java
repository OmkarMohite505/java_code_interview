package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(1));
		list.add(0, 10);
		System.out.println(list);
		list.remove(0);
		list.remove(2);
		System.out.println(list);
	}

}
