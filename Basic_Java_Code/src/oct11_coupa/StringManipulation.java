package oct11_coupa;

public class StringManipulation {

	public static void main(String[] args) {
		// input = "India is my country"
		// output = "Country my is india."
		String str = "India is my country";
		String[] arr = str.split(" ");
		String result = "";
		String firstWord = arr[arr.length-1];
		result = String.valueOf(firstWord.charAt(0)).toUpperCase()+firstWord.substring(1)+" ";
		for(int i=arr.length-2; i>=0;i--) {
			result += arr[i].toLowerCase()+" ";
		}
		result = result.trim();
		result += ".";
		System.out.println(result);
	}

}
