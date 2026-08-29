package DataStructures;

class Node {
    int data;
    Node next; // Pointing towards node n.

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class SLL {
    Node head;
    SLL(){
        this.head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val); // create node
        n.next = head;
        head = n;
    }

    void printSLL() { //Traversal
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("Null");
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
        }
        Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = n;
        n.next = null;
    }

    int getLLSize(){
        int size = 0;
        Node pointer = head;
        while(pointer != null){
            pointer = pointer.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int pos, int val){
        int size = getLLSize();
        Node n = new Node(val);
        if(pos < 0 || pos > size) {
            System.out.println("Invalid Position.");
        } else if (pos == 0) {
            n.next = head;
            head = n;
        }else {
            Node pointer = head;
            while(--pos == 0){
                pointer = pointer.next;
            }
            n.next = pointer.next;
            pointer.next = n;
        }
    }
}

class Driver{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
//        sll.printSLL();
        sll.insertAtHead(40);
//        sll.printSLL();
        sll.insertAtTail(50);
        sll.printSLL();
        sll.insertAtPos(3,12);
        sll.printSLL();
    }
}
