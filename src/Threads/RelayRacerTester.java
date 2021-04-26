package Threads;

public class RelayRacerTester {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            RelayRacer r = new RelayRacer();

            new Thread() {
                public void run() {
                    r.racerTwo();
                }
            }.start();


            new Thread() {
                public void run() {
                    try {
                        r.racerOne();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }.start();
        }
}
