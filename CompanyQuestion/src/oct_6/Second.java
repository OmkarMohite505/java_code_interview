package oct_6;

public class Second {

	public static void main(String[] args) {
		try {
//			args = null;
			args[0] = "test";
			System.out.println(args[0]);
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
	}

}
