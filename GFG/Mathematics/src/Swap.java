
public class Swap {

	public static void main(String[] args) {

		int x = 50;
		int y = 100;

		System.out.println("Before swap X= " + x + " Y= " + y);

		int temp;
		temp = x;
		x = y;
		y = temp;

		System.out.println("After swap X= " + x + " Y= " + y);

	}

}
