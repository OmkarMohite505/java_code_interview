package is_char_vowel;

import java.util.Scanner;

public class IsCharVowel {

	public static void main(String[] args) {
		char ch = new Scanner(System.in).next().charAt(0);
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}

}
