

class A{
	public void m1() {
		System.out.println("in A Class");
	}
}

class B extends A{
	public void m2() {
		System.out.println("in B Class");
	}
}
public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.m1();
		b.m2();
		B b1 = (B)a;
		b1.m2();
	}

}
