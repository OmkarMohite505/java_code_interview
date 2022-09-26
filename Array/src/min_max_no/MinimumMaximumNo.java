package min_max_no;

public class MinimumMaximumNo {

	public static void main(String[] args) {
		int arr[] = { 2, -58, 3, 1, 2, 34, 4, 3, 4, 332, 223 };
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			else
				max = arr[i];
		}
		System.out.println("Min "+min);
		System.out.println("Max "+max);
	}

}
