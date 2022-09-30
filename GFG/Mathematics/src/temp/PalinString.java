package temp;

public class PalinString {
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
		if (isPalindrome("asdfsa")) {
			System.out.println("is palin");
		} else {
			System.out.println("is not palin");
		}
	}
}
