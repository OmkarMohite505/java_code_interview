package oct16;

import java.util.Arrays;

public class ArryShiftRight {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		for(int i = 0; i < k; i++) {
			i = 0;
			for(int j = 0; i < arr.length; i++) {
				int temp = arr[i];
				arr[j] = arr[j+1];
				arr[arr.length-1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
