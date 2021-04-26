package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ABCTester {
    public static void main(String[] args) {

        int _blue = 1;
        int[] arr = {36,38, 56,45,43,44,51};
//          int
//        String s = new String(arr, 0, 2);
//        System.out.println(s);
//        System.out.println(10+10+ "=" + (10 + 10));


//        String mathString = "The value is";
//        mathString+=10+12;
//        System.out.println(mathString);
        int x =0, y= 0;
        for( x = 0; x< 10; ++x, ++y){

        }
//        byte a = 10;
//        Object b = +a;
//        System.out.println(b.getClass().getName());

//        String a = "a";
//        String b = "a";
//        String c  = new String("a");
//        String d = c;
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(d));
//        System.out.println(a==d);
        int[] e = new int[]{3,4,5};
        int[] f = {4,2,1,3};
        String[] firstString = {"a", "b", "c", "d"};
        String[] secondString = {"a", "b", "c", "d"};
        String[] thirdString = firstString;
//        System.out.println(firstString==secondString); //false
//        System.out.println(firstString.equals(secondString)); //false
//        System.out.println(firstString==thirdString); //true
//        System.out.println(firstString.equals(thirdString)); //true

        System.out.println(Arrays.equals(firstString,secondString)); // true
        System.out.println(Arrays.equals(firstString,thirdString)); // true

        }
    }
