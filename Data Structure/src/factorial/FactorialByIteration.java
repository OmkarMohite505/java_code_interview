package factorial;

public class FactorialByIteration {
	public static void main(String[] args) {
		System.out.println(factorial(10));
		
	}
	static int factorial(int n) {
		int sum = 1;
		for(int i=1;i<=n;i++)
			sum *= i;
		return sum;
	}

}
