package Threads;

public class Testing {
    public static void main(String[] args) {
            Messenger a = new Messenger();

            new Thread(){
                @Override
                public void run() {
                    try {
                        a.doSomething();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    a.doSomething();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
