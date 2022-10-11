package oct_6;

public class DisplayCharIndexPosition {

	public static void main(String[] args) {
		String input = "abc".toLowerCase();
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i< input.length(); i++) {
			System.out.print((alphabet.indexOf(input.charAt(i))+1)+" ");
		}
		System.out.println();
		char letter;
		for(int i=0; i<input.length();i++) {
			letter = input.charAt(i);
			if(letter >= 'A' && letter < 'Z') {
				System.out.println((int)letter - 'A'+1);
			}
			if(letter >= 'a' && letter <= 'z') {
				System.out.println((int)letter - 'a'+1);
			}
		}
	}

}
