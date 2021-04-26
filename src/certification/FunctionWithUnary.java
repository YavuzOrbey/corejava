package certification;

public class FunctionWithUnary {
    public static void main(String[] args) {
        int i = 0;
        // First, let's throw an exception in the initialization block...
        try {
            System.out.println("------- Executing For Loop A -------");
            // termination section of for loop declaration has prefix increment
            // increment section of for loop declaration uses postfix increment
            for (i=0; ++i < 10; interruptIt(++i)) {
                System.out.println("A forloop: i = " + i);
            }
        } catch (Exception e) {
            System.out.println(e + ": i = " + i);
        }
    }

    public static void doSomething(int i){
        System.out.println("i = " + i);
    }

    public static int interruptIt(int i) throws Exception {
        System.out.println("interruptIt: i = " + i);
        if (i < 10) throw new Exception("Break it up");
        return i;
    }
}

