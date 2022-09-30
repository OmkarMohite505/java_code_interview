package temp;

public class CountNumbers {

	static int countNumbers(int num) {
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	// ------------------------------------------------------

	static int cntNums(int num) {
		if (num == 0) {
			return 0;
		}
		return 1 + cntNums(num / 10);
	}

	public static void main(String[] args) {

		System.out.println(countNumbers(123456789));
		System.out.println(cntNums(85245595));

	}

}
