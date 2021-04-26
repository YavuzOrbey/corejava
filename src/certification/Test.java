package certification;

public class Test {
    static byte staticDefaultByte;
    static short staticDefaultShort;
    static int staticDefaultInt;
    static long staticDefaultLong;
    static char staticDefaultChar;
    static boolean staticDefaultBoolean;
    static int staticDefaultFloat;
    static int staticDefaultDouble;


    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(staticDefaultChar);

        Integer i = new Integer(100);
        long e = i;

        float myFloat;
        long myLong=0xFFFFFF;


        int d = 128;
        System.out.println((byte) d);
    }
}
