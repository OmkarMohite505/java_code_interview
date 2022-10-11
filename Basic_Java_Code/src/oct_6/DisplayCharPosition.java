package oct_6;

public class DisplayCharPosition {

	public static void main(String[] args) {
		String str = "abcdef";
		char[] ch = str.toCharArray();
		for(char c:ch) {
			int temp = (int)c;
			int temp_integer = 96; // for lowercase
			if(temp <=122 && temp >= 97)
			System.out.print(temp - temp_integer+" ");
		}
		
		System.out.println();
		for(int i=0; i < str.length(); i++) {
			int temp = (int)str.charAt(i);
			int temp_integer = 96;
			if(temp <= 122 && temp >= 97)
			System.out.print(temp - temp_integer+" ");
		}
		System.out.println();
		
		// for Upper case
		String str2 = "XYZ";
		for(int i=0;i<str2.length(); i++) {
			int temp = (int)str2.charAt(i);
			int temp_integer = 64;
			if(temp <= 90 && temp >=65) {
				System.out.print(temp - temp_integer+" ");
			}
		}
		System.out.println();
		
		// both at a time
		char letter;
		for(int i=0; i< str.length(); i++) {
			letter = str.charAt(i);
			if(letter >= 'A' && letter <= 'Z') {
				System.out.print((int)letter - 'A' +1);
				System.out.print(" ");
			}
			if(letter >= 'a' && letter <= 'z') {
				System.out.print((int)letter - 'a'+1);
				System.out.print(" ");
			}
		}
		
		
		System.out.println();
		int sum = 65 + 'A';
		System.out.println(sum);
		int sum1 = 'A'+'A';
		System.out.println(sum1);
	}

}
