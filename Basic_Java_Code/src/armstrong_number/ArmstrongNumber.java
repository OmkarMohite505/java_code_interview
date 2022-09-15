package armstrong_number;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num, sum = 0, rem = 0, temp;
		System.out.println("Enter no ");
		temp = num = new Scanner(System.in).nextInt();
		while(num > 0) {
			rem = num % 10;
			sum = sum + rem * rem * rem;
			num /= 10;
		}
		if(sum == temp)
			System.out.println("No is armstrong no");
	}

}
