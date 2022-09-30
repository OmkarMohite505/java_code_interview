package RevString;

public class ReverseString {
	public String isPalindrome(String str) {

		String org = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		ReverseString ps = new ReverseString();
		System.out.println(ps.isPalindrome("Kunal Lokhadne"));
	}
}