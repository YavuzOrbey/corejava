package com.perscholas.java_basics;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scan.nextInt();
        String animal= "";
        switch(year%12){
            case 0: animal = "Monkey"; break;
            case 1: animal = "Rooster"; break;
            case 2: animal = "Dog"; break;
            case 3: animal = "Pig"; break;
            case 4: animal = "Rat"; break;
            case 5: animal = "Ox"; break;
            case 6: animal = "Tiger"; break;
            case 7: animal = "Rabbit"; break;
            case 8: animal = "Dragon"; break;
            case 9: animal = "Snake"; break;
            case 10: animal = "Horse"; break;
            case 11: animal = "Sheep"; break;
        }

        System.out.print(year + " is the year of the " + animal);

        int[] a = {1,2,3};
        int[] b = a.clone();

        System.out.println(a == b ? "Same Instance":"Different Instance");
        //Outputs different instance
    }
}
