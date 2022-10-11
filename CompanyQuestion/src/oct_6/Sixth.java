package oct_6;

public class Sixth {
	
	static void test()throws RuntimeException{
		try {
			System.out.println("test");
			throw new RuntimeException();
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		}
		catch(RuntimeException e) {
			System.out.println("RUntime");
		}
		System.out.println("End");
		
	}

}
