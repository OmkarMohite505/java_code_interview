package greatest_number;

public class GreatesUsingTernary {
	public static void main(String[] args) {
		int n1 = 101, n2 = -1, n3 = 1;
		int max = (n1 > n2) ? (n1 > n3 ? n1:n3) :(n2 > n3 ? n2: n3);
		System.out.println("Greatest no is : "+max);
	}
}
