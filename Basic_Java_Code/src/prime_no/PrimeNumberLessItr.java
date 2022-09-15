package prime_no;

import java.util.Scanner;

public class PrimeNumberLessItr {

	public static void main(String[] args) {
		boolean flag = false;
		int number, i, j;
		System.out.println("Enter a no ");
		number = new Scanner(System.in).nextInt();
		int itr = 0;
		for (i = 2; i < number/2; i++) {
			itr++;
			if (number % i == 0) {
				System.out.println("No is not prime");
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("No is prime");
		System.out.println(itr);
	}

}
