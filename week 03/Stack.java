public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            throw new StackOverflowException("Stack is full");
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
} 