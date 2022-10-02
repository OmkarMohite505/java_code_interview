package method_overloading;


public class TestOverloading5 {
	public void print(String  obj1, Object obj2) {
		System.out.println("From String, Object");
	}
	public void print(Object obj1, String obj2) {
		System.out.println("From Object, String");
	}

	public static void main(String[] args) {
		var a = new TestOverloading5();
		// priority given to most specific class c is in lower hiearachy
//		a.print(null, null);
		a.print(new Object(), "Hi");
		a.print(new Object(), null);
//		a.print(null, "Hi");
//		a.print("Hi", "Hi");
		
	}

}
