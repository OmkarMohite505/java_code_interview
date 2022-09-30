package temp;

public class Palin {

	static boolean isPalindrome(int number) {

		int remainder, reversed = 0, original = number;
		while (number != 0) {
			remainder = number % 10;
			reversed = reversed * 10 + remainder;
			number = number / 10;
		}
		return reversed == original;
	}

	public static void main(String[] args) {

		if (isPalindrome(3213)) {
			System.out.println("is Palin");
		} else {
			System.out.println("is not Palin");

		}
	}

}
