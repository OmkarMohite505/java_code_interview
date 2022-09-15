package factorial_of_no;

import java.util.Scanner;

public class Factorial_With_Recursion {
	public static void main(String[] args) {
		boolean flag = false;
		while(!flag) {
			System.out.println("Enter a No ");
			System.out.println("Factorial of number = "+factorial(new Scanner(System.in).nextInt()));
			
			System.out.println("Enter 0 for exit");
			if(0 == new Scanner(System.in).nextInt())
				flag = true;
		}
		
	}
	
	public static int factorial(int num) {
		if(num == 0)
			return 1;
//		else
			return (num * factorial(num - 1));
	}

}
