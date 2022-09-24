package sorting_algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 23, 1, 23, 4, 54, 345, 34, 22, 34 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void bubbleSort(int arr[]) {
		int n = arr.length - 1;
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
