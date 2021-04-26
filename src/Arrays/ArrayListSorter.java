package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayListSorter {


    public static void main(String[] args) {

        List<Integer> a = new ArrayList(Arrays.asList(new Integer[]{3, 4, 6, 7, 9, 12, 15, 17, 23}));
        List<Integer> b = new ArrayList(Arrays.asList(new Integer[]{3, 5, 7, 9, 10, 13, 15, 18, 23}));

       a.removeAll(b);
        System.out.println(a);
    }



}
