import java.util.Arrays;

class CircularQueue{
    int front, rear, size;
    int[] arr;

    public CircularQueue(int size){
        front = rear = -1;
        arr = new int[size];
        this.size = size;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public boolean isFull(){
        return (front == -1 && rear == (size - 1)) || ((rear + 1) % size == front);
    }

    public boolean insert(int data){
        if(isFull()){
            return false;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
        return true;
    }
    public int delete(){
        if(isEmpty()){
            return -999;
        }
        front = (front + 1) % size;
        return arr[front];
    }
    public void display(){
        for(int i = front + 1; i <= rear; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}

public class TestCircularQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display();
        q.delete();
        q.delete();
        q.insert(1);
        System.out.println("Calling again");
        q.display();
        System.out.println(Arrays.toString(q.arr));
        System.out.println(q.front+"  "+q.rear);

    }
}
