package temp;

public class Palindrome {

	static boolean isPalindrome(int num) {
		if (num < 0) {
			return false;
		}

		int temp = num;
		int rev = 0;
		int rem;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev == temp;
	}

	public static void main(String[] args) {
		if (isPalindrome(21213)) {

			System.out.println("Number is Palindrome");

		} else {
			System.out.println("Number is Not Palindrome");
		}
	}

}
