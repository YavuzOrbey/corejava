package homework.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEntry {
    static Scanner scan = new Scanner(System.in);
    Calc mult = new Calc() { //anonymous new Calc() can be replaced with lambda IF I start putting class variables though I can't change it to a lambda
         int i =2;
        @Override
        public int compute(Integer[] arr) {
           int product = 1;
           for(int i=0; i<arr.length; i++){
               product*=arr[i];
           }
           return product;
        }

        public int lol(){
            return 1;
        }
    };
    Calc add = arr -> {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    };
    Calc subtract = new Calc() {
        @Override
        public int compute(Integer[] arr) {
            int sum = arr[0];
            for(int i=1; i<arr.length; i++){
                sum-=arr[i];
            }
            return sum;
        }
    };
    Calc divide = new Calc() {
        @Override
        public int compute(Integer[] arr) throws Exception {
            if(arr.length!=2)
                throw new Exception("Too many arguments");
            return arr[0]/arr[1];
        }
    };

    public static void main(String[] args) throws Exception {


        printInstructions();
        int choice = scan.nextInt();
        while(choice > 4 || choice < 1){
            System.out.println("Invalid Operation");
            printInstructions();
            choice = scan.nextInt();
        }
        System.out.println("Folow the prompt. Enter any non-numeric to exit program");
        switch(choice){
            case 1: add(); break;
            case 2: subtract(); break;
            case 3: multiply(); break;
            case 4: divide(); break;
        }


    }
    static void add() throws Exception {
        MainEntry e = new MainEntry();
        System.out.println("Enter numbers to add. Enter non-numeric to compute");
        Integer[] intArr = e.getIntegerArray();
        System.out.println("The result is: " + e.add.compute(intArr));
    }
    static void subtract() throws Exception {
        MainEntry e = new MainEntry();
        System.out.println("Enter numbers to subtract. Enter non-numeric  to compute");
        Integer[] intArr = e.getIntegerArray();
        System.out.println("The result is: " + e.subtract.compute(intArr));
    }
    static void multiply() throws Exception {
        MainEntry e = new MainEntry();
        System.out.println("Enter numbers to multiply. Enter non-numeric  to compute");
        Integer[] intArr = e.getIntegerArray();

        System.out.println("The result is: " + e.mult.compute(intArr));
    }
    static void divide() throws Exception {
        MainEntry e = new MainEntry();
        System.out.println("Enter numbers to divide. Enter non-numeric  to compute");
        Integer[] intArr = e.getIntegerArray();
        if(intArr.length!=2){
            System.out.println("Error you can only enter two numbers");
            intArr = e.getIntegerArray();
        }
        System.out.println("The result is: " + e.divide.compute(intArr));
    }

    public Integer[] getIntegerArray(){
        List<Integer> intArrList = new ArrayList<>();
        String input;
        int num;
        while(true){
            try{
                System.out.print("Next number: ");
                input = scan.next();
                num = Integer.parseInt(input);
                intArrList.add(num);
            }
            catch(Exception e){
                break;
            }
        }
        Integer[] intArr = intArrList.toArray(new Integer[0]);
        return intArr;
    }

    public static void printInstructions(){
        System.out.println("Which operation would you like to do?");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }

}
