package Threads.WaysofCreatingThreads.RunnableInterface;
//MyTask is a Task
class MyTask1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 2 is Running.");
    }
}

class MyTask2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 1 is Running.");
    }
}

class Demo{
    public static void main(String[] args) {
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        System.out.println("Main Thread is Running.");
    }
}
