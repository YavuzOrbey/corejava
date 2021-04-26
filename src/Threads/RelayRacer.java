package Threads;

public class RelayRacer {
    public synchronized void racerOne() throws InterruptedException
    {
        System.out.println("Race Started");
        System.out.println("Running ---------------> pass the flag to 2nd partner");
        notify();
    }


    public synchronized void racerTwo()
    {
        System.out.println("Waiting for partner  to pass the Flag");

        try {
            wait();
            System.out.println("Starting Running");
            System.out.println("Either win or loss");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}