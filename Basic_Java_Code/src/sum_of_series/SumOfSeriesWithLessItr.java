package sum_of_series;

import java.util.Scanner;

public class SumOfSeriesWithLessItr {

	public static void main(String[] args) {
		int num, cnt = 1, sum = 0;
		System.out.println("Enter a no");
		num = new Scanner(System.in).nextInt();
		sum = num * (num + 1) / 2;
		System.out.println("Sum is = " + sum);
	}

}
