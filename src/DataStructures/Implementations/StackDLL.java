package DataStructures.Implementations;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackDLL {
    Node top;


    void push(int data) {
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
    System.out.println(data + " pushed");
        }
        void pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println(top.data + " popped");
            top = top.next;
        }
        void peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Top element: " + top.data);
        }
        void display() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = top;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
}

class DriverCode{
    public static void main(String[] args) {
        StackDLL stack = new StackDLL(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack:");
        stack.display();
        stack.peek();
        stack.pop();
        System.out.println("After pop:");
        stack.display();
    }
}
