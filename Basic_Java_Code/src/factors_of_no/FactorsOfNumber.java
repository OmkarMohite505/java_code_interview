package factors_of_no;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		int  i =2;
		while(i < num) {
			if(num % i == 0)
				System.out.println(i);
			i++;
		}
	}

}
