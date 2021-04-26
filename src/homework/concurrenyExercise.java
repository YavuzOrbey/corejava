package homework;

public class concurrenyExercise {

    public static void main(String[] args) {
//        Runnable a = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " says: ");
//                System.out.println("Hello World");
//            }
//        };
        //1a
//        Thread thread = new Thread(a);
//        thread.start();

        //1b + 1c
//        for(int i=0; i< 5;i++){
//            Thread b = new Thread(a);
//            b.start();
//        }

        Runnable c = new Runnable() {
            int i = 0;
            @Override
            public void run() {
                synchronized (Runnable.class){
                    while(i<1000000){
                        i++;
                    }
                    System.out.println(Thread.currentThread().getName()+ " i value: " + i);
                }
            }
        };
        Thread a1 = new Thread(c);
        Thread a2 = new Thread(c);
        a1.start();
        a2.start();
    }
}
