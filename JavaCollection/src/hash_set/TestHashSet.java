package hash_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestHashSet {

	public static void main(String[] args) {
		String names[] = {"omkar","shyam","omkar","ram","lakhan","sagar"};
		List<String> ll = Arrays.stream(names).collect(Collectors.toList());
		System.out.println(ll);
		System.out.println();
		Set<String> hs = new HashSet<String>();
		ll.forEach(n -> hs.add(n));
		System.out.println(hs);
		System.out.println();
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
