package CheckPalindrome;

public class test {

	public boolean isPalindrome(int num) {

		if (num < 0)
			return false;

		int rem, rev = 0, org = num;
		while (num != 0) {

			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;

		}

		return org == rev;

	}

	public static void main(String[] args) {
		
		test t=new test();
		
		System.out.println(t.isPalindrome(121));

	}

}
