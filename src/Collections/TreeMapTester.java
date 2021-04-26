package Collections;

import java.util.TreeMap;

public class TreeMapTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeMap<Integer, String> tmp = new TreeMap<Integer, String>();
        tmp.put(200, "NYC");
        tmp.put(100, "NJ");
        tmp.put(12, "NC");
        tmp.put(145,"TX");
        tmp.put(300, "Ar");
        tmp.put(320, "AL");
        tmp.put(152, "Caliornia");
        tmp.put(153, null);
        tmp.put(154, null);
        tmp.put(155, "Caliornia");
        int s = tmp.size();
        System.out.println(s);

        System.out.println(tmp);

        System.out.println(tmp.keySet());

        // maintain the desc order
        System.out.println(tmp.descendingMap());

        System.out.println(tmp.headMap(155,true));
        System.out.println(tmp.tailMap(155,false));
    }
}
