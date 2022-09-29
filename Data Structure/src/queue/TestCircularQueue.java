package queue;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue<Integer> queue = new CircularQueue<Integer>(5);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		System.out.println(queue.delete());
		queue.insert(6);
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		
		System.out.println(queue.delete());
	}

}
