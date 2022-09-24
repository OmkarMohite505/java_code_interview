package reverse_no;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, rem=0, sum=0;
		num = new Scanner(System.in).nextInt();
		int temp = num;
		while(num > 0) {
			rem = num % 10;
			sum = sum * 10 +rem;
			num /= 10;
		}
		System.out.println("Reversed no = "+sum);
		if(temp == sum)
			System.out.println("Entered is palindorme number");
	}

}
