package Exceptions;

public class Testing {

    public static void main(String[] args) {
        //int i = 1/0;
    }

    public String doSomething(){
        System.out.println("Something");
        throw new ArithmeticException();
    }
}
