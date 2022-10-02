package method_overloading;

public class TestOverloading3 {
	public void print(String s) {
		System.out.println("From String");
	}
	public void print(StringBuffer sb) {
		System.out.println("From String Buffer");
	}
	public void print(Object o) {
		System.out.println("From int");
	}

	public static void main(String[] args) {
		var a = new TestOverloading3();
		a.print(null);
		
	}

}
