package homework.Calculator.GenericCalculator;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCalc calculator = new MyCalc();
        System.out.println("Which operation do you want to do?");
        String operator = scan.nextLine();
        while(true){
            switch(operator){
                case "+":
                    System.out.println(calculator.add.compute(1,3, "+"));
                    break;
                case "-":
                    System.out.println(calculator.subtract.compute(1,3, "-"));
                    break;
                case "*":
                    System.out.println(calculator.multiply.compute(1f,3f, "*"));
                    break;
                case "/":
                    System.out.println(calculator.divide.compute(1f,3f, "/"));
                    break;
            }
            break;
        }
    }
}
