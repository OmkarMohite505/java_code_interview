package oct_6;
public class DisplayCharNo {

	public static void main(String[] args) {
		String s = "***??";
		int star = -1;
		int questionMark = -1;
		for(int i=0;i<s.length(); i++) {
			if(s.charAt(i) == '*') {
				star++;
			}
			else {
				questionMark++;
			}
		}
		System.out.println(star + " "+questionMark);
		star = star + 97;
		questionMark += 97;
		char starChar = (char) star;
		char queChar = (char) questionMark;
		System.out.println(starChar+"  "+queChar);
	}

}
