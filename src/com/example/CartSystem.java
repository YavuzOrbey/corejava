package com.example;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {

        /* So when I was working on my local IDE I was using Java 8 where lambdas are allowed but up top it says Java 7 and it still works so
        I don't know what is going on however let me explain...

        so I can't just declare double sum = 0.0 and then add to it in the lambda function inside of the forEach method
        Why? Because I get an error saying Variable used in lambda expression should be final or effectively final

        However if I changed it to an object (in this case an array with only one index) I can change whatever is in that index just fine
        */
        double[] sum = {0.0};

        System.out.println("Cart:");

        System.out.printf("%1$-20s %2$-20s %3$-10s %4$-10s %5$-10s", "Name", "Description", "Price", "Quantity", "Sub Total \n");

        getItemCollection().forEach((itemName, item)-> {

            /*I had to learn how to do this string formatting with the flags and decimal rounding so it's going to be
            % then the argument number
            then a flag for left alignment then how many characters the element is going to take
            a period and the number for how many decimal places to show
            and finally the type of the argument (string, integer, float, etc)

            After that you just send the arguments one by one separated by commas
            */

            System.out.printf("%1$-20s %2$-20s %3$-10.2f %4$-10d %5$-10.2f\n",
                    item.getItemName(), item.getItemDesc(), item.getItemPrice(), item.getQuantity(), item.getItemPrice()*item.getQuantity());

            sum[0] += item.getItemPrice()*item.getQuantity();
        });

        double tax =  sum[0]*0.05;
        double total = sum[0] + tax;
        System.out.printf("%1$-20s %2$-20.2f\n", "Pre-tax Total", sum[0]);
        System.out.printf("%1$-20s %2$-20.2f\n", "Tax", tax);
        System.out.printf("%1$-20s %2$-20.2f\n", "Total", total);
    }
}
