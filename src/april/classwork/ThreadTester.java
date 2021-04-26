package april.classwork;

public class ThreadTester {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            ThreadTester a = new ThreadTester();
            a.doMore();
            a.doAnotherThing();
            a.doSomething();
        };
        runnable.run();
    }

    void doSomething(){
        System.out.println(2);
    }
    void doAnotherThing(){
        System.out.println(1);
    }
    void doMore(){
        System.out.println(1+1);
        System.out.println(1+1);
        System.out.println(1+1);
        System.out.println(1+1);
        System.out.println(1+1);
        System.out.println(1+1);


    }
}
