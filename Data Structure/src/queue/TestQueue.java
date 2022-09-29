package queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(5);
		queue.insert(11);
		queue.insert(12);
		queue.insert(13);
		queue.insert(14);
		queue.insert(15);
		queue.insert(16);
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
	}

}
