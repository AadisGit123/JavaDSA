package DataStructures.LinkedLists.SinglyLinkedLists; //Singly Linked Lists

class Node {
    int data;
    Node next; // Pointing towards node n

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class SLL {
    Node head;
    SLL(){ // Default Constructor to point head towards null
        this.head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val); // create node
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return ;
        }
       Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = n;
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
        Node n = new Node(val);
        int size = getLLSize();
        if(pos < 0 || pos > size){
            System.out.println("Invalid Position");
        }else if(pos == 0){
            n.next = head;
            head = n;
        }else{
           Node pointer = head;
            while(--pos > 0){
                pointer = pointer.next;
            }
            n.next = pointer.next;
            pointer.next = n;
        }
    }

    void printSLL() { //Traversal
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("Null");
    }

    void deleteAtHead(){
        if(head == null){
            System.out.println("Linked List is empty");
            return ;
        }
       Node toDelete = head;
        System.out.println("Deleted Element: " +toDelete.data);
        head = head.next;
        toDelete = null; // call Garbage Collection
    }

    void deleteByValue(int val) {
        if(head == null){
            System.out.println("Linked List is empty");
            return ;
        }
        if(head.data == val){
            System.out.println("Element " + val + "deleted at head");
            return ;
        }
        Node pointer = head;
        int index = 0;
        while(pointer.next != null && pointer.next.data != val) {
            pointer = pointer.next;
            index++;
        }
        if(pointer.next == null){
            System.out.println("Element not found");
            return;
        }
        System.out.println("Element " + val + " deleted at index: " + index);
        Node toDelete = pointer.next;
        pointer.next = pointer.next.next;
        toDelete = null;
    }
}

class Driver{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtTail(50);
        sll.printSLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.printSLL();
        sll.insertAtHead(40);
        sll.printSLL();
//        sll.insertAtPos(6,12); // Invalid Position
        sll.insertAtPos(0,12);
        sll.printSLL();
        sll.deleteAtHead();
        sll.deleteByValue(30);
        sll.printSLL();
    }
}
