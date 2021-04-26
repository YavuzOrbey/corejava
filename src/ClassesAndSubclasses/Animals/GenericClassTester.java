package ClassesAndSubclasses.Animals;

import java.util.Arrays;
import java.util.List;

public class GenericClassTester {
    public static void main(String[] args) {
        GenericClass<Animal> a = new GenericClass<Animal>(new Dog());
        Dog b = new Dog();
        Speakable c = b.returnASpeakeable();

        List<Integer> d = Arrays.asList(1,2,3,4,5);
    }
}
