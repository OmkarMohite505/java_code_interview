package sorting_algorithm;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,7,8,9,1,5};
		int n = arr.length;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
		}
	}
	
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j=low; j <= high -1;j++ ) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
