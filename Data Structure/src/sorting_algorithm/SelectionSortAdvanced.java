package sorting_algorithm;

import java.util.Arrays;

public class SelectionSortAdvanced {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		selectionSort(arr);
		Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
		
	}
	
	public static void selectionSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j < arr.length;j++) {
				if(arr[j] < arr[min])
					min=j;
			}
			if(min !=i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

}
