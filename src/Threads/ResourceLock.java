package Threads;

public class ResourceLock extends Thread{
    private static String lockOne = "Resource 1";
    private static String lockTwo = "Resource 2";
    static int counter = 1;

    public void run(){

        try{
            foo();
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
    public static void foo(){
        synchronized (lockOne){
            System.out.println(lockOne);
        }
    }
}
