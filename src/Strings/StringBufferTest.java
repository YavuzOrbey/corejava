package Strings;

import java.util.StringJoiner;

public class StringBufferTest {
    public static void main(String[] args) {
        /*System.out.println("String length: " + s.length());
        System.out.println("String capacity: " + s.capacity());
        System.out.println("String capacity looks like it's always going to be string length + 16 at first");
        System.out.println("Performing s.append(22)...");
        s.append("ddsadasdasdasdas");
        System.out.println("String is now: " + s);
        System.out.println("String length: " + s.length());
        System.out.println("String capacity: " + s.capacity());
        s.append("d");
        System.out.println("String is now: " + s);
        System.out.println("String length: " + s.length());
        System.out.println("String capacity: " + s.capacity());
        s.append("ddasdasdsdsdsdsdsdsdsdsddddddd");
        System.out.println("String is now: " + s);
        System.out.println("String length: " + s.length());
        System.out.println("String capacity: " + s.capacity());*/
//        s.reverse();
//        System.out.println(s);
//        s.replace(1,10, "LOL");
//        System.out.println(s);
//        s.insert(1, true);
//        System.out.println(s);
//
//        StringJoiner a = new StringJoiner(",", "[", "]");
//        a.add("Hello").add("World").add("Goodbye").add("World");
//        System.out.println("StringJoiner a: + " + a);
//        StringJoiner b = new StringJoiner("|", "{", "}");
//        b.add("sometimes").add("nullable").add( "string").add( "exists");
//        System.out.println("StringJoiner b: + " +b);
//        System.out.println("StringJoiner a.merge(b): + " + a.merge(b));

        StringBuffer s = new StringBuffer("123");
        s.replace(0,5, "4");



    }
}
