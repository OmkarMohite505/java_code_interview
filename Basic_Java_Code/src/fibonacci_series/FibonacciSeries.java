package fibonacci_series;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		fibonacci(n);
	}
	
	static void fibonacci(int n) {
		int num1=0, num2=1;
		int counter = 1;
		while(counter <= n) {
			System.out.print(num1+" ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter += 1;
		}
	}

}
