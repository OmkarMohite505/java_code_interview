package array_content_compare;

import java.util.Arrays;

public class ChackTwoArrayContentSameOrNot {
	public static void main(String[] args) {
		// code to check two array content same or not
		// position of element not matters, ignored
		int[] arr1 = {3,2,4,7};
		int[] arr2 = {2,3,5,7};
		System.out.println(areEqual(arr1, arr2) ? "Equal" : "Not Equal");
	}
	
	public static boolean areEqual(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if(n!= m)
			return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<n;i++) {
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
		
	}
}
