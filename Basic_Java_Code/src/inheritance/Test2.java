
class Parent {
	String name;

	void method() {
		System.out.println("Method from parent");
	}
}

class Child extends Parent {
	int id;
	@Override
	void method() {
		System.out.println("Method from child");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.name = "omkar";
		System.out.println(p.name);
		p.method();
		
		Child c = (Child)p;
		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
		Parent p1 = new Parent();
		p1.method();
		Child c1 = (Child)p1;

	}

}
