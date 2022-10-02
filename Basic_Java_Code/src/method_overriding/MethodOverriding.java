package method_overriding;

class Parent{
	public void buildingConstruction() {
		System.out.println("With help of Labour ");
	}
}
class Child extends Parent{
	@Override
	public void buildingConstruction() {
		System.out.println("With help of machine");
	}
}

public class MethodOverriding {
	

	public static void main(String[] args) {
		Parent p = new Child();
		p.buildingConstruction();
		
	}

}
