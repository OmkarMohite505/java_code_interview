package oct21;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(2);
		set.add(12);
		set.add(1);
		set.add(1);
		System.out.println(set);
	}

}
