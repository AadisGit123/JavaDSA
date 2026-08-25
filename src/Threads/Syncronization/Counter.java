package Threads.Syncronization;

public class Counter {
    int count = 0;
    synchronized void increment(){
        count++;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();//Higher priority than the other threads.
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Count is: " + counter.count);
    }
}
