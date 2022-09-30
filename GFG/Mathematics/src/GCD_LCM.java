
public class GCD_LCM {

	static int calGcdLcm(int n1, int n2) {

		int org1 = n1;
		int org2 = n2;

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		int gcd=n2;
		int lcm=(org1*org2)/gcd;
		
		return lcm;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
