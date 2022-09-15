package power_of_no;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a base and power no");
		int base = new Scanner(System.in).nextInt();
		int power = new Scanner(System.in).nextInt();
		int sum = 1;
		while(power > 0) {
			sum *= base;
			power--;
		}
		System.out.println("Power of no is = "+sum);
	}

}
