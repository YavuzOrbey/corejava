package com.perscholas.java_basics;

import java.util.Scanner;

public class CoreJavaConditionals {

    public static void main(String[] args) {
        int x = 12;
        System.out.println(lessThanTen(x));
        System.out.println(inRange(x));
        System.out.println("Enter a score and you will recieve a letter grade");
        Scanner scan = new Scanner(System.in);
        System.out.println(gradedScore(scan.nextInt()));
        System.out.println("Enter a number from 1 to 7 and it will print out the day of the week");
        dayofWeek(scan.nextInt());
    }

    public static String lessThanTen(int x) {
        if (x < 10) {
            return "Less than 10";
        }
        else if (x > 10 && x < 20){
            return "Between 10 and 20";
        }
        else if(x >=20){
            return "Greater than or equal to 20";
        }
        return "";
    }

    public static String inRange(int x){
        if (x < 10 || x > 20) {
            return "Out of Range";
        }
            return "In Range";
    }

    public static String gradedScore(int x){
        if( x<=100 && x >=90)
            return "A";
        else if( x<90 && x >=80)
            return "B";
        else if( x<80 && x >=70)
            return "C";
        else if( x<70 && x >=60)
            return "D";
        else if( x<60 && x >= 0)
            return "F";
        return "Score out of Range";
    }

    public static void dayofWeek(int x){
        switch(x){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}
