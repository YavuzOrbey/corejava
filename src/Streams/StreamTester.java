package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        ArrayList<Book> books  = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());

        books.forEach(book-> System.out.println(book));

        books.stream().forEach(book-> System.out.println(book));
    }
}
