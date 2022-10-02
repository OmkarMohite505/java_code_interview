package day14_1;

import java.util.HashSet;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("rnd-001", "Prasad", 10000);
		Employee e2 = new Employee("rnd-002", "Prasad", 10000);
		Employee e3 = new Employee("rnd-003", "Prasad", 10000);
		Employee e4 = new Employee("rnd-004", "Prasad", 10000);
		HashSet<Employee> empSet = new HashSet<>();
		System.out.println("Added " + empSet.add(e1));// t

		System.out.println();
		System.out.println("Added " + empSet.add(e2));// t

		System.out.println();
		System.out.println("Added " + empSet.add(e3));// t

		System.out.println();
		System.out.println("Added " + empSet.add(e4));// t

		empSet.forEach(e -> System.out.println(e));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
	}

}
