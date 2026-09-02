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
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return ;
        }

        int value = arr[top];
        System.out.println(value + " Popped");
        top--;
    }

    // Peek: Return the top element
    void peek() {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
            return ;
        }

        for (int i: arr) System.out.println(i + " ");
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Display the stack
    void display() {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
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
