package character_class_method;

import java.util.Arrays;

public class CharacterMethod {

	public static void main(String[] args) {
		if(Character.isLetterOrDigit(12))
			System.out.println("yes");
		String str = "12234DSJH";
		byte[] arr = str.getBytes();
		for(byte b:arr) {
			System.out.print(b+" ");
		}
	}

}
