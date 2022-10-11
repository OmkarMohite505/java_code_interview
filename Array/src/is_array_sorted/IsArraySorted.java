package is_array_sorted;

import java.util.Arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 66 };
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Array is Sorted");
		} else {
			System.out.println("Array Not Sorted");
		}
	}

}
