package factorial_of_no;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while(!flag) {
			int sum = 1;
			int number, temp;
			System.out.println("\nEnter a number");
			try {
				temp = number = sc.nextInt();
				if(number < 0)
					throw new Exception();
				while(number > 1)
					sum *= number--;
				
				System.out.println("Factorial of "+temp+" is = "+sum);
				System.out.println("Continue, Enter Non zero For Exit enter 0");
				if(0 == sc.nextInt())
					flag = true;
				
			}
			catch(Exception e) {
				System.out.println("Non negative number, could not find");
			}
			
		}
	}

}
