package oct11_prac;

public class SubArrayAddition {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int k = 3;
		int n = arr.length;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == k)
					result++;
			}
		}
		System.out.println("No of Subarrays that sum upto "+k+" is "+result);
	}

}
