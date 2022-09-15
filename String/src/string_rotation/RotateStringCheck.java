package string_rotation;

public class RotateStringCheck {
	public static void main(String[] args) {
		String s1 = "ABCD"; 
		String s2 = "CDAB";
		if(isRotation(s1, s2))
			System.out.println("Rotation of String is present");
		else
			System.out.println("Rotation not found");
	}
	
	public static boolean isRotation(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}

}
