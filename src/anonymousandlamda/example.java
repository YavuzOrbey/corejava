package anonymousandlamda;

import java.util.Arrays;
import java.util.List;

public class example {

    MyFunctionalInterface b = new MyFunctionalInterface(){ //Anonymous Inner Class
        @Override
        public void theOneMethod(){
            System.out.println("you got got");
        }
    };

    MyFunctionalInterface a = ()->{ // Same thing as a lamdda
        System.out.println("you got got");
    };

    public static void main(String[] args) {
        Integer b[] = new Integer[5];

        List<Integer> a = Arrays.asList(b);
        System.out.println(Arrays.toString(b));
            final int end;
    }


}
