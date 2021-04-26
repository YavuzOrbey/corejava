package homework.Calculator.GenericCalculator;

public class MyCalc {
    GenericCalc<Integer, String> add = (a, b, operator) ->  a+b;
    GenericCalc<Integer, String>  subtract = (a, b, operator) ->  a-b;
    GenericCalc<Float, String>  multiply = (a, b, operator ) -> a * b;
    GenericCalc<Float, String>  divide = (a, b, operator ) -> a/b;

}
