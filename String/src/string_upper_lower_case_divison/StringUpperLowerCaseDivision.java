package string_upper_lower_case_divison;

public class StringUpperLowerCaseDivision {
	public static void main(String[] args) {
		String str= "THis is CloudTech This is Cloud Tech";
		String lowerCase = "";
		String upperCase = "";
		int mid = str.length()/2;
		for(int i = 0; i< str.length(); i++) {
			if(i < mid)
				lowerCase += Character.toLowerCase(str.charAt(i));
			else
				upperCase += Character.toUpperCase(str.charAt(i));
		}
		
		System.out.println(lowerCase+" "+upperCase);
	}
}
