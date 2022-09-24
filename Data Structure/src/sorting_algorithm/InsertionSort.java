package sorting_algorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 7, 2, 4, 32, 5, 1 };
		insertionSort(arr);
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
