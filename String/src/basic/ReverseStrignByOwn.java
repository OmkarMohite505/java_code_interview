package basic;

public class ReverseStrignByOwn {

	public static void main(String[] args) {
		String str = "Hello";
		char arr[] = str.toCharArray();
		String rev = "";
		for(int i = arr.length - 1; i >=0;) {
			rev +=arr[i--];
		}
		System.out.println(rev);
	}

}
