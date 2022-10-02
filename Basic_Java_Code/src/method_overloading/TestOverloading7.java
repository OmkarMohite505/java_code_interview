package method_overloading;


public class TestOverloading7 {
	public void getDetails(int i) {
		System.out.println("From int array");
	}
	public void getDetails(Integer x) {
		System.out.println("From char array");
	}

	public static void main(String[] args) {
		var a = new TestOverloading7();
		// here priority given to int i
		// widening wins over boxing
		a.getDetails(1);
	}

}
