package swap_two_no;

public class Swap {

	public static void main(String[] args) {
		int a = 10, b = 20, temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a + ", b = " + b);
	}

}
