package oct22;

class Test{
	int count;
	
	public void increment() {
		count++;
	}
}

public class TestMultithreading {

	public static void main(String[] args) {
		Test test = new Test();
//		test.increment();
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i < 1000; i++) {
					test.increment();
				}
			}
		});
		t.start();
		System.out.println(test.count);
	}

}
