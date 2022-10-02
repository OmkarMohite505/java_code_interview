package functional_interface;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		// We can implement functional interfaces by using Lambda expression 
		// implementation of functional interfaces given to lambda expression
        //             lambda expression
		Square square = (int x) -> x * x;

		System.out.println(square.calculate(10));
	}

}
