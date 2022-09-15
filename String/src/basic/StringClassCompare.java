package basic;

public class StringClassCompare {

	public static void main(String[] args) {
		String name = "Omkar";
		String myname = new String("Omkar");
		System.out.println(name == myname);
		
		System.out.println(name.hashCode());
		System.out.println(myname.hashCode());
		
		String nm = "Omkar";
		System.out.println(name == nm);
		System.out.println(nm.hashCode());
	}

}
