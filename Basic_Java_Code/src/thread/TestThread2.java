package thread;

import java.lang.reflect.Array;
import java.util.Arrays;


public class TestThread2 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		int[] even = {2,4,6,8,10};
		int[] odd = {1,3,5,7,9};
		var oddRef = new OddNumber(odd);
		var evenRef = new EvenNumber(even);
		Thread oddT = new Thread(oddRef, "OddThread");
		Thread evenT = new Thread(evenRef, "EvenThread");
		oddT.start();
		evenT.start();
		
		oddT.join();
		evenT.join();
		
		
		
	}

}
