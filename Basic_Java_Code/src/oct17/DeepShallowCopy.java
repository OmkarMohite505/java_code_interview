package oct17;

class Person1 implements Cloneable{
	String name = "Omkar";
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class DeepShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person1 p1 = new Person1();
		Person1 p2 = (Person1)p1.clone();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
