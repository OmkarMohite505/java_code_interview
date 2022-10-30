package oct23;

interface I3{
	void dispaly();
}
abstract class Animal implements I3{
	private String name;
	private String noise;
	
	
	
	public Animal(String name, String noise) {
		super();
		this.name = name;
		this.noise = noise;
	}

	abstract void makeNoise();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
}

class Cat extends Animal{
	
	public Cat(String name, String noise) {
		super(name, noise);
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "name : "+getName()+" Noise: "+getNoise();
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		
	}
	
}

public class TestInheritance {

	public static void main(String[] args) {
		Cat c = new Cat("cat", "Meow");
		System.out.println(c);
	}

}
