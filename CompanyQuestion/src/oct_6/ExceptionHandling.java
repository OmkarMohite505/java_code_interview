package oct_6;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("Hello "+" "+1/0);
			
		}
		finally{
			System.out.println("World");
		}
	}

}
