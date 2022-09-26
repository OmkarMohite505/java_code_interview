package prime_no;

import java.util.Scanner;

public class PrimeNumberCount {

	public static void main(String[] args) {
		System.out.println("Enter no upto which do you want to check prime no count");
		int n = new Scanner(System.in).nextInt();
		int cnt=0, j=0;
		for(int i=1;i<=n;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j)
				cnt++;
		}
		System.out.println("No of prime no is : "+cnt);
	}

}
