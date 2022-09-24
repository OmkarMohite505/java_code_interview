package sorting_algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 23, 1, 23, 4, 54, 345, 34, 22, 34 };
		selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[smallest] > arr[j])
					smallest = j;
			
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;

		}
	}

}
