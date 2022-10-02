package method_overloading;

public class TestOverloading {
	public void print(String s) {
		System.out.println("From String");
	}
	public void print(int n) {
		System.out.println("From int");
	}

	public static void main(String[] args) {
		var a = new TestOverloading();
		a.print(1);
		a.print("Omkar");
		a.print(null);
		
	}

}
