package upper_lower_char;

import java.util.Scanner;

public class UpperOrLowerChar {

	public static void main(String[] args) {
		System.out.println("Enter a char");
		char ch = new Scanner(System.in).next().charAt(0);
		if(ch >=97 && ch <= 122)
			System.out.println("Entered Character in Lower Case");
		if(ch >=65 && ch <=90)
			System.out.println("Entered Character in Upper Case");
		
	}

}
