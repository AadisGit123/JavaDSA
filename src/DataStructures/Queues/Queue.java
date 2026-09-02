package DataStructures.Queues;

public class Queue { //FIFO or LILO

    int [] arr;
    int front;
    int back;
    int size;

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push (int val){
        if(back == size - 1){
            System.out.println("Overflown!");
            return ;
        }
        back++;
        arr[back] = val;
        if(front == -1){
            front++;
        }
    }

    void pop(){
        if(front == -1 || front > back){
            System.out.println("Queue UnderFlown");
            return ;
        }
        arr[front] = 0;
        front++;
    }

    void peek(){
        if(front == -1 || front > back){
            System.out.println("UnderFlown!");
            return ;
        }
        System.out.println(arr[front]);
    }

     boolean isEmpty(){
        return !(front == -1 ||front > back);
    }

    void display() {
        if ((front == -1 ||front > back)) {
            System.out.println("Stack UnderFlow");
            return;
        }

        for (int i = front; i >= back; i--) {
            System.out.println(arr[i]);
        }
    }
}

class DriverCode{
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.push(10);
        q.push(20);
        q.push(30);
        q.peek();
        q.pop();
        q.peek();
        q.display();
    }
}
