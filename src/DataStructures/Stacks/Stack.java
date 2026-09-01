package DataStructures.Stacks;

public class Stack { //LIFO or FILO

    int[] arr;
    int top;
    int size;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push: Add an element
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = value;
    }

    // Pop: Remove the top element
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;

        return value;
    }

    // Peek: Return the top element
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Display the stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

class DriverCode {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
