package DSA;

public class QueueEg {
    public static void main(String[] args) {

    }
}

class QueueDataStructure {

    int capacity;
    int front;
    int rear;
    int currentSize = 0;
    int[] queue_arr;

    public QueueDataStructure(int size) {
        this.capacity = size;
        this.front = 0;
        this.rear = -1;
        this.queue_arr = new int[capacity];
    }

    boolean isFull() {
        return this.currentSize == this.capacity;
    }

    boolean isEmpty() {
        return this.currentSize == 0;
    }

    int peek() {
        if (!isEmpty()) {
            return queue_arr[front];
        } else {
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue_arr[rear] = data;
        currentSize++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        front = (front + 1) % capacity;
        currentSize--;
    }

}