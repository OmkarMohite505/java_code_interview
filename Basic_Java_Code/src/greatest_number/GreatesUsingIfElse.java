package greatest_number;

public class GreatesUsingIfElse {
	public static void main(String[] args) {
		int n1 = 0, n2 = -1, n3 = 1;
		if(n1 < n2)
			if(n1 < n3)
			System.out.println("N1 is small");
			else
				System.out.println("n3 is small");
		else
		if(n2 < n3)
			System.out.println("n2 is small");
		else
			System.out.println("n3 is small");
	}
}
