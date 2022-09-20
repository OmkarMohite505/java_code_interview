package remove_char_occurence;

public class RemoveCharacterOccurrenceOwnMethod {

	public static void main(String[] args) {
		String str = "CloudTeCh";
		char c = 'C';
		removeChar(str, c);
	}
	
	public static void removeChar(String str, char c) {
		String finalStr = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != c)
				finalStr += str.charAt(i);
		}
		
		System.out.println(finalStr);
	}

}
