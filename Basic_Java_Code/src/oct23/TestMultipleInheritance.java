package oct23;

interface I1{
	public static final double PI=3.14;
	void display();
}
interface I2{
	public static final double PI=3.14;
	void display();
}
class A implements I1, I2{

	@Override
	public void display() {
		double d = I1.PI * 100;
	}
	
}

public class TestMultipleInheritance {

	public static void main(String[] args) {
		
	}

}
