package Threads;

public class CounterTester {

    public static void main(String[] args) throws InterruptedException {
        NonAtomicCounter nonAtomicCounter = new NonAtomicCounter();
        Thread t1 = new Thread(nonAtomicCounter);
        Thread t2 = new Thread(nonAtomicCounter);
        t1.start();
        t2.start();
        System.out.println(~10);
    }
}
