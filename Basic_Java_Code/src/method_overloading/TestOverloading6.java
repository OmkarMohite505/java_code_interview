package method_overloading;


public class TestOverloading6 {
	public void print(int[] arr) {
		System.out.println("From int array");
	}
	public void print(char[] arr) {
		System.out.println("From char array");
	}

	public static void main(String[] args) {
		var a = new TestOverloading6();
		a.print(null);
	}

}
