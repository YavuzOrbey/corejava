package com.perscholas.java_basics;

import java.util.Arrays;

public class CoreJavaLoops {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
        System.out.println("--------------------------");
        int x = 0;
        while (x <= 100) {
            System.out.println(x);
            x += 10;
        }
        System.out.println("--------------------------");
        x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);
        System.out.println("--------------------------");
        for (x = 1; x <= 100; x++) { //x is still in scope here but I still wanted to use it instead of another variable like y
            if (x >= 25 && x <=75)
                continue;
            if (x % 5 == 0)
                System.out.println(x);
        }
        System.out.println("--------------------------");

        for (x = 1; x <= 100; x++) {
            if ((x < 25 || x > 75) && x % 5 == 0) {  //Also another way to do the same problem as above
                System.out.println(x);
            }
        }
        System.out.println("--------------------------");

        for (x = 1; x <= 100; x++) {
            if (x >= 50)
                break;
            if (x % 5 == 0)
                System.out.println(x);
        }

        System.out.println("--------------------------");
        for (int i=1; i<=2; i++){
            System.out.printf("Week %d:\n", i);
            for (int j=1; j<=5; j++){
                System.out.printf("Day %d\n", j);

            }
        }
        System.out.println("--------------------------");
        //prints palindromes less than the argument
        showPalindromes(200);
        System.out.println("--------------------------");
        //prints fibonacci numbers less than the argument
        printFibonacci(50);
        System.out.println("--------------------------");
        //nested for loop
        nestedFor();

    }

    public static void showPalindromes(int y){
        System.out.printf("Palindromes up to %d\n", y);
        for(int x=10; x<y; x++){
            if(Integer.toString(x).equals(reverseString(Integer.toString(x)))){
                System.out.printf("%d ", x);
            }
        }
        System.out.println("\n");
    }

    public static String reverseString(String s){
        char[] reversed = new char[s.length()];
        for (int x =0; x<s.length(); x++){
            reversed[x] = s.charAt(s.length()-1-x);
        }
        return new String(reversed);
    }
    public static void printFibonacci(int x ){
        int firstNumber = 0;
        int secondNumber=1;
        int temp;
        System.out.println("Fibonacci Numbers up to " + x + ": ");
        while(firstNumber < x){
            System.out.printf("%d ", firstNumber);
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber +=temp;
        }
        System.out.printf("\n");
    }

    public static void nestedFor(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.printf("Inner loop - i: %d, j: %d \n", i,j);
            }
        }
    }
}

