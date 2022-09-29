package stack;

public class Stack<T> {
	private T[] arr;
	private int top, size;
	
	public Stack() {
		size = 5;
		top = -1;
		arr = (T[]) new Object[size];
	}
	public Stack(int size) {
		top = -1;
		arr = (T[])new Object[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == size -1;
	}
	
	public boolean push(T data) {
		if(isFull())
			return false;
		arr[++top] = data;
		return true;
	}
	
	public T pop() {
		if(isEmpty())
			return null;
		return arr[top--];
	}

}
