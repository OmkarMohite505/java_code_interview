package reciprocal_string;

public class ReciprocalString {

	public static void main(String[] args) {
		Reciprcalstring("aBc");
		System.out.println();
		myReciprocalString("abc");
	}
	
	static void Reciprcalstring(String word)
    {
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
 
            // Checking if the character
            // is a letter or not
            if (Character.isLetter(ch)) {
 
                // converting lowercase character
                // To reciprocal character
                if (Character.isLowerCase(ch)) {
                    ch = (char)(122 - (int)(ch) + 97);
                }
                // converting uppercase character
                // To reciprocal character
                else if (Character.isUpperCase(ch)) {
                    ch = (char)(90 - (int)(ch) + 65);
                }
            }
 
            // display each character
            System.out.print(ch);
        }
    }
	
	static void myReciprocalString(String str) {
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				ch = (char)(90 - (int)ch + 65);
			}
			else {
				ch = (char)(122 - (int)ch + 97);
			}
			System.out.print(ch);
		}
	}
}
