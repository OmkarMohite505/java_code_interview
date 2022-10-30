package oct22;

interface B {
	void add();
}

interface C {
	void add();
}

public class TestInterface implements B, C {

	@Override
	public void add() {

	}

	public static void main(String[] args) {
		TestInterface a = new TestInterface();
		B b = new TestInterface();
		C c = new TestInterface();

		if (a instanceof B && b instanceof B) {
			System.out.println("B");
		}
		if (a instanceof C && c instanceof C) {
			System.out.println("C");
		}
	}

}
