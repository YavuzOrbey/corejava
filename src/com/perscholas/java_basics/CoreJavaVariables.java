package com.perscholas.java_basics;

public class CoreJavaVariables {


    public static void main(String[] args) {
        int u = 10;
        int k = 3;
        int uJ = u+k;

        System.out.println(uJ);

        double d = 10.4;
        double e = 42.3;
        double dE = d+e; //IEEE floating point number arithmetic gives weird results

        System.out.println(dE);

        int a = 10;
        double b = 424.3;

        double c = a+b; // has to be a double
        System.out.println(c);

        int f = 32123;
        int g = 654;
        int fG = f/g;

        System.out.println(fG);

        // f = 442343.3412; won't compile
        double d2 = 2412343.321423;
        double d3 = 321312.32;

        double d4 = d2/d3;
        int castAsInt = (int) d4;
        System.out.println(d4);

        int x =5;
        int y = 6;
        int q = y/x;
        System.out.printf("If x = %d and y = %d then q= %d\n", x,y,q);


        System.out.println("When y is cast to a double, q = " + (double) y/x);
        byte namedConstant = 10;
        System.out.println("NamedConstant: " + (namedConstant+10));

        double chaiDouble = 1.15;
        double coffeeDouble = 1.50;
        double juiceDouble = 2.00;
        double subtotalDouble, totalSaleDouble;
        final double SALES_TAX_DOUBLE = 1.08;
        subtotalDouble = 3*chaiDouble +4*coffeeDouble+2*juiceDouble;
        System.out.println("Subtotal: " + subtotalDouble);





    }
}
