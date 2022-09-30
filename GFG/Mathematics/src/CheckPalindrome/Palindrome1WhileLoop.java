package CheckPalindrome;

import java.util.Scanner;

public class Palindrome1WhileLoop {

	static boolean CheckPlaindrome(int num) {

		if (num < 0)
			return false;
		
		int reversed = 0, remainder, original = num;
		while (num != 0) {
			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;
		}
		return original == reversed;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check Palindrome");
		if (CheckPlaindrome(sc.nextInt())) {

			System.out.println("Yes Number is Palindrome ");

		} else {
			System.out.println("No Number is Not Palindrome ");

		}

	}

}
