package DataStructures.LinkedLists.DoublyLinkedLists; //Doubly Linked Lists

class Node {
    int data;
    Node next; // Pointing towards node n
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class DLL {
    Node head;
    DLL(){ // Default Constructor to point head towards null
        this.head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val); // create node
        n.next = head;
        n.prev = null;
        head = n;
    }

    void insertAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
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
            n.prev = pointer;
            if(pointer.next != null){
                pointer.next.prev = n;
            }
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
        System.out.println("Deleted Element: " + toDelete.data);
        head = head.next;
        toDelete = null; // call Garbage Collection
    }

    void deleteByValue(int val) {
        if(head == null){
            System.out.println("Linked List is empty");
            return ;
        }
        if(head.data == val){
            head = head.next;

            if(head != null){
                head.prev = null;
            }

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
        pointer.next.prev  = pointer.next;
        toDelete = null;
    }
}

class Driver{
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtTail(50);
        dll.printSLL();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.printSLL();
        dll.insertAtHead(40);
        dll.printSLL();
//        sll.insertAtPos(6,12); // Invalid Position
        dll.insertAtPos(5,12);
        dll.printSLL();
        dll.deleteByValue(20);
        dll.deleteAtHead();
    }
}
