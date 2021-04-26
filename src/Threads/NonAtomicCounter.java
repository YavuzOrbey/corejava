package Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class NonAtomicCounter implements  Runnable{
    int count = 0;
    NonAtomicCounter(){

    }

    @Override
    public synchronized void run() {
            while(count < 10){
                System.out.println("Atomic Count is currently: " + count++ + " in " + Thread.currentThread().getName());
                if(count==7){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Why'd you wake me up?");
                        e.printStackTrace();
                    }
                }
            }
    }
}
