package oct_6;

class TestException extends Exception{
	
}
class A{
	public String sayHello(String name)throws TestException {
		if(name == null)
			throw new TestException();
		return "hello "+name;
	}
}

public class Seventh {

	public static void main(String[] args) {
		new A().sayHello("Aiko");
	}

}
