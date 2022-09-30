
public class CountNumberRecursive {
	
	static int CountNumber(Integer n) {
		
		if(n==0)
			return 0;
		
		return 1+CountNumber(n/10);
	}

	public static void main(String[] args) {
		
		System.out.println(CountNumber(789456123));
		
	}
}
