package PrimeNumber;

public class CheckPrime {

	public static void isPrime(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is not prime");
		}

		else {
			System.out.println(" Prime ");
		}

	}

	public static void main(String[] args) {

		isPrime(71);
	}

}
