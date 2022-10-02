package method_overloading;

class A{}
class B extends A{}
class C extends B{}

public class TestOverloading4 {
	public void print(A a) {
		System.out.println("From A");
	}
	public void print(B b) {
		System.out.println("From B");
	}
	public void print(C c) {
		System.out.println("From C");
	}

	public static void main(String[] args) {
		var a = new TestOverloading4();
		// priority given to most specific class c is in lower hiearachy
		a.print(null);
		a.print(new A());
		a.print(new B());
		
	}

}
