package Threads.WaysofCreatingThreads.ThreadClass;
//MyThread is a Thread
class MyThread extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i ++) {
            System.out.println("MyThread: " + i);
        }
    }
}

class Demo{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 5; i++){
            System.out.println("Main Thread: " + i);
        }
    }
}
