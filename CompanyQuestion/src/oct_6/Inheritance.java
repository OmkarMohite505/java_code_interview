package oct_6;

import java.io.IOException;

class A{
	public void process() {
		System.out.println("A");
	}
}
class B extends A{
	public void process() //throws IOException
	{
		super.process();
		System.out.println("B");
//		throw new IOException();
	}
}

public class Inheritance {
	public static void main(String[] args) {
		try {
			new B().process();
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
	}

}
