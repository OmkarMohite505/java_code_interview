package basic;

public class ConcatString {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.concat(" World"));
		String temp = s.replace('H', 'K');
		System.out.println(temp);
		System.out.println(s.toUpperCase());
		System.out.println(s.equals(temp));
		System.out.println(s.equalsIgnoreCase("HELLO"));
	}

}
