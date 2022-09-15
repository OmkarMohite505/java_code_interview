package prime_no;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number, i, j;
		number = new Scanner(System.in).nextInt();
		int itr = 0;
		for (i = 2; i < number; i++) {
			itr++;
			if (number % i == 0) {
				System.out.println("No is not prime");
				break;
			}
		}
		if (number == 0 || number == 1)
			System.out.println("No is not prime");
		if (i == number)
			System.out.println("No is prime no");
		System.out.println(itr);
	}

}
