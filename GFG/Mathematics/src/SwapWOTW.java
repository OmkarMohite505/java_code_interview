
public class SwapWOTW {

	public static void main(String[] args) {

		int x = 20;
		int y = 30;

		System.out.println("Before swap X= " + x + " Y= " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swap X= " + x + " Y= " + y);

	}

}
