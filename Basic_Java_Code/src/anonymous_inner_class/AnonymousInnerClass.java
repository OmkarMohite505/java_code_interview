package anonymous_inner_class;

class Animal{
	public void noise() {
		System.out.println("Meow");
	}
}
public class AnonymousInnerClass {

	//Anonymous inner class 
	//Anonymous inner class is a class which has a no name and can be used to instantiate only one object
	//Anonymous inner class can be extended from existing class or can implement any interface
	public static void main(String[] args) {
		new Animal().noise();
		
		//Here we created subclass of existing class 
		Animal bigfoot = new Animal() {
			public void noise() {
				System.out.println("Weird Noise");
			}
		};
		bigfoot.noise();
		//One more way to implement anonymous inner class by using implementing interface
		Runnable myRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From my Runnable");
			}
		};
		
		myRunnable.run();
		
		
		
		String str1 = "Omkar"; 
		String str2 = "omkar";
		System.out.println(str1.compareTo(str2));
//		System.out.println(str1.contains(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(String.valueOf(100));
		System.out.println(str1.getClass());
	}

}
