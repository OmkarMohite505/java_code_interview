package missing_no_in_series;

public class FindMissingNoInSeries {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int sum = (10 * 11) / 2;
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++)
			actualSum += arr[i];
		System.out.println("Missing no is = " + (sum - actualSum));
	}
}
