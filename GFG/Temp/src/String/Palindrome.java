package String;

public class Palindrome {

	static boolean isPalindrome(String str) {

		String org = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev.equals(org);
	}

	public static void main(String[] args) {
		String str = "mdam";
		if (isPalindrome(str)) {
			System.out.println(str + " is Palin");
		} else {
			System.out.println(str + " is not Palin");
		}

	}

}
