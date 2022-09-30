package LcmHcf;

import java.util.Scanner;

public class LcmHcf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int org1 = num1;
		int org2 = num2;

		while (num1 % num2 != 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2=rem;

		}
		int gcd = num2;
		int lcm = (org1 * org2) / gcd;

		System.out.println("Gcd is: "+gcd);
		System.out.println("Lcm is: "+lcm);

	}

}
