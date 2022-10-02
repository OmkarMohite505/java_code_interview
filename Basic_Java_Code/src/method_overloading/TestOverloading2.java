package method_overloading;

public class TestOverloading2 {
	public void print(String s) {
		System.out.println("From String");
	}
	public void print(Object o) {
		System.out.println("From int");
	}

	public static void main(String[] args) {
		var a = new TestOverloading2();
		a.print(null);
		
	}

}
