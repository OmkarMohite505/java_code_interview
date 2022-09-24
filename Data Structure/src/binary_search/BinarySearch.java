package binary_search;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr, 5));
	}
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high)/2;
		while(low <= high) {
			if(key == arr[mid])
				return mid;
			if(key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
			
		}
		return -1;
	}

}
