package binary_search;

public class BinarySearchByRecurssion {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr, 2, 0, arr.length-1));
		
	}
	
	public static int binarySearch(int[] arr, int key, int low, int high) {
		if(high < low)
			return -1;
		int mid = (low+high)/2;
		if(key== arr[mid])
			return mid;
		if(key < arr[mid])
			return binarySearch(arr, key, low, mid - 1);
		else
			return binarySearch(arr, key, mid + 1, high);
			
	}

}
