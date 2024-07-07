package DSA;

public class StackEg {
    public static void main(String[] args) {
        StackDataStructure s = new StackDataStructure(0);
        s.push(10);
        s.push(12);
        System.out.println(s.peek());

    }
}

class StackDataStructure {
    int maxSize;
    int[] stack_arr;
    int top;

    public StackDataStructure(int size) {
        this.maxSize = size;
        stack_arr = new int[maxSize];
        top = -1; // Pinter to latest index
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {

        if (!isEmpty()) {
            return stack_arr[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack_arr[top--];
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        stack_arr[++top] = data;
    }

}