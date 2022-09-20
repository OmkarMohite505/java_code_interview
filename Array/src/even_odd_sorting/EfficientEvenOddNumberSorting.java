package even_odd_sorting;

public class EfficientEvenOddNumberSorting {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 7, 8, 11, 20 };
		evenOddSorting(arr);

	}

	public static void evenOddSorting(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int[] sortArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sortArr[start++] = arr[i];
			else
				sortArr[end--] = arr[i];
		}

		for (int i : sortArr)
			System.out.print(i+" ");
	}
}
