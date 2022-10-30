package oct16;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Hi");
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k = 0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
