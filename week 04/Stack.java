public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        // TODO what is capacity is not a positive integer ?
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() {
        // TODO: what if the stack is empty? index == 1?
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }
        return elements[index];
    }

    public int pop() {
        // TODO: what if the stack is empty? index == -1?
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }
        return elements[index--];
    }

    public void push(int el) {
        // TODO: what if the stack is full? index == capacity-1?
        if (isFull()) {
            throw new StackOverflowException("Stack is full");
        }
        elements[++index] = el;
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements[i]);
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // stack.pop();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        // stack.push(200000);

        stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}

class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}
