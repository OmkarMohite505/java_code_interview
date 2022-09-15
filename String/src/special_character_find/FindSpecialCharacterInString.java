package special_character_find;

public class FindSpecialCharacterInString {
	public static void main(String[] args) {
		String s = "Iacsd@$%#";
		int count = 0;
		String specialCharRemoved = "";
		// Find out special char in string
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i)) && ! Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			}
			else {
				specialCharRemoved = specialCharRemoved + s.charAt(i);
			}
		}
		if(count == 0)
			System.out.println("No Special characters found");
		else
			System.out.println("No of special char found = "+count);
		
		System.out.println(specialCharRemoved);
	}

}
