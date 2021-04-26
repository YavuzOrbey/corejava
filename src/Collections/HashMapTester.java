package Collections;

import java.util.HashSet;

public class HashMapTester {

    public static void main(String[] args) {
        //hashset and treeset no duplicate values
        // both sort data asc order by default
 //hashset no order

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(2.0);
        hashSet.add(3.0);
        hashSet.add(1.0);
        hashSet.add(0.5);
        System.out.println(hashSet);

    }

    // hashset vs treeset - hashset allows null values
}
