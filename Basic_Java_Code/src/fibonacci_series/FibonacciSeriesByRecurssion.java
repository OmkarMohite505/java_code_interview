package fibonacci_series;

public class FibonacciSeriesByRecurssion {

	public static void main(String[] args) {
		fibonacci(0, 1, 10);
		
	}
	
	public static void fibonacci(int a, int b, int m) {
		if(m == 0)
			return;
		System.out.print(a+" ");
		fibonacci(b, a+b, --m);
	}

}
