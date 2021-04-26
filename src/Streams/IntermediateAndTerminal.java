package Streams;

import java.util.stream.Stream;

public class IntermediateAndTerminal {

    public static void main(String[] args) {
        Stream.of(1,4,5,6,7,8).map(s->s*2)
                .filter(s-> s > 4).forEach(System.out::println);
    }
}
