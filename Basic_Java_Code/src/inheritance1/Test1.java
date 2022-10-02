package inheritance1;

class Parent{
	public void m1() {
		System.out.println("From Parent m1");
	}
	public void m2() {
		System.out.println("From Parent m2");
	}
}
class Child extends Parent{
	@Override
	public void m1() {
		System.out.println("From Child m1");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		p.m2();
		Child c = new Child();
		c.m1();
		c.m2();
		Parent parent = new Child();
		parent.m1();
		parent.m2();
	}

}
