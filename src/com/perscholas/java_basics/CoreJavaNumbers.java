package com.perscholas.java_basics;

import java.util.Scanner;

public class CoreJavaNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] options = {"What operation do you want to do?", "1. Unary NOT (~)", "2. Bitwise AND, XOR, OR, Left and Right Shift", "3. Postfix Operator/Prefix Operator"};
        listOptions(options);
        int decision = scan.nextInt();
        while(decision > 3){
            System.out.println("Invalid. Choose an operation");
            listOptions(options);
            decision = scan.nextInt();
        }
        if(decision==1){
            System.out.println("Choose a number");
            int x = scan.nextInt();
            int z = ~x;
            System.out.println(x + " in Binary is " + Integer.toBinaryString(x));
            System.out.println("~" +  Integer.toBinaryString(x) + " = " +  Integer.toBinaryString(z));
            System.out.println("~" + x + " = " + z);


        }else if(decision==2){
            System.out.println("Choose first number");
            int x = scan.nextInt();
            System.out.println("Choose second number");
            int y = scan.nextInt();
            binaryOperators(x,y);
        }else if(decision==3){
            int y = 4;
            System.out.println("y = " + y);
            y++;
            System.out.println("After y++, y = " + y);

            int x = 8;
            System.out.println("x = " + x);
            x = x+1;
            System.out.println("After x = x + 1, x = " + x);
            x++;
            System.out.println("After x++, x = " + x);
            ++x;
            System.out.println("After ++x, x = " + x);

            System.out.println("Choose your own values for x and y");
            System.out.println("x = ");
            x = scan.nextInt();
            System.out.println("y = ");
            y = scan.nextInt();
            System.out.println("++x + y = " + (++x+y));
            System.out.println("Now x = " + x);
            System.out.println("x++ + y =" + (x++ +y) ); //which is the same result as before
        }

    }
    public static void listOptions(String... options){
        for (String option: options){
            System.out.println(option);
        }
    }
    public static void binaryShift(){
        // I combined the first four parts of the assignment and now you can just input a number and
        // decide how many bits to shift it and in which direction
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        System.out.println("Shift left (l) or right (r");
        String shift = scan.next();
        while(shift.charAt(0) != 'l' && shift.charAt(0) != 'r'){
            System.out.println("Incorrect Input. Use lowercase (l) or (r). Try again");
            System.out.println("Shift left (l) or right (r");
            shift = scan.next();
        }
        System.out.println("Enter how many bits it will shift");
        int y = scan.nextInt();
        // I think the binary shift left is going to add a zero to the end of it so 10 will become 100
        // so in decimal thats 0*2^0 + 0*2^1+1*2^2 = 4
        System.out.print("The integer " + x );
        System.out.println(" is " + Integer.toBinaryString(x) + " in Binary");
        if(shift.charAt(0) =='l'){
            x <<= y;
        }else{
            x >>=y;
        }
        String direction =  shift.charAt(0)=='l' ? "left": "right";
        System.out.printf("When we  shift that by " + y + " bits to the " +direction+ " we get " + Integer.toBinaryString(x));
        System.out.print(" which is " + x + " in decimal");
    }

    public static void binaryOperators(int x, int y){
        // I did the math on paper and 7 is 00111 and 17 is 10001 in binary so I think the result will be 00001 or 1
        // because of the way the & bitwise operator works

        //like before I gave user ability to chose which operator to use and made the assignment more versatile
        String options[] = {"Choose operation:", "1. & (AND)","2. | (OR)", "3. ^ (XOR)"};
        int z=1;
        String decisionString="";
        Scanner scan = new Scanner(System.in);
        listOptions(options);
        Integer decision = scan.nextInt();
        while(decision > 4){
            System.out.println("Incorrect Input. Use 1, 2, 3 or 4");
            listOptions(options);
            decision = scan.nextInt();
        }
        switch(decision){
            case 1: z = x & y;
                    decisionString= " & ";
                    break;
            case 2: z = x | y;
                    decisionString= " | ";
                    break;
            case 3: z= x ^ y;
                    decisionString= " ^ ";
                    break;
        }
        System.out.println(x + " in Binary is " + Integer.toBinaryString(x) + " and " + y + " in Binary is " + Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(x) + decisionString + Integer.toBinaryString(y) + " = " + Integer.toBinaryString(z));
        System.out.println(x + " & " + y + " = " + z);







    }
}
