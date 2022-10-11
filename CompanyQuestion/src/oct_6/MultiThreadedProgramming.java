package oct_6;

class NewThread implements Runnable{
	Thread t;
	public NewThread() {
		t = new Thread(this, "New Thread");
		t.start();
	}
	

	@Override
	public void run() {
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}
	
}

public class MultiThreadedProgramming {

	public static void main(String[] args) {
		new NewThread();
	}

}
