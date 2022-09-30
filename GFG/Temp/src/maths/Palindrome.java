package maths;

public class Palindrome {

	static boolean isPalin(int num) {

		int rev = 0, rem, org = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev == org;

	}

	public static void main(String[] args) {
		if (isPalin(1)) {
			System.out.println("is Palin");
		} else {
			System.out.println("not Palin");
		}

	}

}
