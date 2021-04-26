package Exceptions;

import java.util.Scanner;

public class WrongNameExceptionTest{
    public static void main(String[] args) {
        try{
            System.out.println("I'm getting an exception any second now....");
            System.out.println("Print your name:");
            Scanner scan = new Scanner(System.in);
            int e = 10/0;
            String name = scan.nextLine();
            if(!name.equals("Yavuz"))
                throw new WrongNameException();
        }
        catch(WrongNameException e){
            System.out.println("Got the wrong name exception!");
        }
        finally{
            System.out.println("You're done!");
        }
    }

    public String doSomething(){
        if(1==4){
            throw new ArithmeticException();
        }
        return "blads";
    }
}
