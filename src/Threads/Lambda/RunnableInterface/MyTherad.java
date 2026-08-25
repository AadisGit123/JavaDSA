package Threads.Lambda.RunnableInterface;
//Lambda Function
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

class DriverCode{
    public static void main(String[] args) {
//        Lambda Implementation method 1.
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Task1 is running!");
//
//            }
//        });
//        Lambda Implementation method 2.

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task1 is running: " + i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task2  is running: " + i);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}

