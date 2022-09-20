package even_odd_sorting;

public class EvenOddNumberSorting {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 7, 8, 11, 20 };
		evenOddSorting(arr);

	}

	public static void evenOddSorting(int arr[]) {
		int index = 0;
		int[] sortArr = new int[arr.length];

		// put even no first in array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sortArr[index++] = arr[i];
		}
		// put odd no then in array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				sortArr[index++] = arr[i];
		}

		for (int i : sortArr)
			System.out.print(i+" ");
	}
}
