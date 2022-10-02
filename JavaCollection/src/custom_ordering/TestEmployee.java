package custom_ordering;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(1, "Omkar", 20, 25600));
		list.add(new Employee(7, "Ram", 30, 25600));
		list.add(new Employee(10, "Akshay", 50, 25600));
		list.add(new Employee(6, "Girish", 10, 25600));
		list.add(new Employee(2, "Laxman", 40, 25600));
//		list.forEach(e -> System.out.println(e));
		Collections.sort(list);
		System.out.println();
		list.forEach(e -> System.out.println(e));
		
		list.sort(Collections.reverseOrder());
		System.out.println();
		list.forEach(e -> System.out.println(e));
		
		System.out.println();
		list.sort(new AgeComparator());
		list.forEach(e -> System.out.println(e));
	}

}
