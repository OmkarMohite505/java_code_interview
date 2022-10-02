package descending_sort;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class descending_sort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,3,2,2,8,6,8,9,44,3,46);
		// sort list in reverse order
		list.stream().sorted(Collections.reverseOrder()).forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		// print duplicate element in list
		Set<Integer> hs = new HashSet<Integer>();
		list.stream().filter(n -> ! hs.add(n)).sorted().forEach(n -> System.out.print(n+" "));
		
		// print even numbers in list
		System.out.println();
		list.stream().filter(n -> n % 2 == 0).forEach(n-> System.out.print(n+" "));
		
		// print odd number +1 in each element
		System.out.println();
		list.stream().filter(n -> n % 2 != 0).map(n -> n + 1).forEach(n -> System.out.print(n+" "));
		
//		list.stream().mapToInt(null)
	}

}
