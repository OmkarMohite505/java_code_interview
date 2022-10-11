package sentence;

import java.util.Iterator;

public class SentenceSpaceRemove {

	public static void main(String[] args) {
		String sentence = "This is My Room";
		String words[] = sentence.split(" ");
		String newSnetence  = "";
		for(String s:words) {
			newSnetence += s;
		}
		System.out.println(newSnetence);
		String sentence2 = "this is my country";
		String upperCaseSen = "";
		for(int i=0;i<sentence2.length();i++) {
			if(i == 0) {
				upperCaseSen += Character.toUpperCase(sentence2.charAt(0));
				continue;
			}
			if(Character.isWhitespace(sentence2.charAt(i))) {
				upperCaseSen += " "+Character.toUpperCase(sentence2.charAt(++i));
			}
			else {
				upperCaseSen += sentence2.charAt(i);
			}
		}
		System.out.println(upperCaseSen);
	}

}
