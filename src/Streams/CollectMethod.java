package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethod {
    public static void main(String[] args) {
        List<String> mylist  = Arrays.asList("1","2","3","4","5");
        Stream<String> givenStream =  mylist.stream();
        List<String> convertedList =  givenStream.filter(a-> Integer.parseInt(a) > 2).collect(Collectors.toList());
        convertedList.forEach( s -> System.out.println(s));
        
    }
}
