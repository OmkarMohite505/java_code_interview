package remove_duplicates_element;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 8, 6, 45, 2, 45, 2, 10, 56, 10 };
		removeDuplicates(arr);
	}

	public static void removeDuplicates(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

		Set<Integer> hs = new HashSet<Integer>();
		int[] temp = Arrays.stream(arr).filter(e -> hs.add(e)).toArray();
		
		System.out.println();
		Arrays.stream(temp).forEach(e -> System.out.print(e + " "));
	}

}
