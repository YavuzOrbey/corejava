package ExampleCodeFromClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTester {
public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("haseeb");
    stringList.add("perscholas");
    stringList.add("teksystem");
    stringList.add("teksystem");
    stringList.add("haseeb");
    stringList.stream()
            .map(String::toUpperCase).map(String::toLowerCase)
            .filter(value -> value.startsWith("h"))
            .forEach(System.out::println);

    int[] intArr = {3,4,1,2,4};

    //Stream.of(Arrays.stream(intArr)).reduce(1,(int a, int b)->a+b);
}



}
