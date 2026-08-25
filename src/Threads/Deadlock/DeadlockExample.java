package Threads.Deadlock;

class Lock{

}

public class DeadlockExample {
    public static void main(String[] args) {
        Lock lock1 = new Lock();
        Lock lock2 = new Lock();

        Thread thread1 = new Thread(() ->{
            synchronized (lock1) {
                System.out.println("T1 is locked lock1.");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                synchronized (lock2) {
                    System.out.println("T1 locked lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
        synchronized (lock2) {
            System.out.println("T2 is locked lock2.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            synchronized (lock1) {
                System.out.println("T2 locked lock1");
            }
        }
    });

        thread1.start();
        thread2.start();
    }
}
