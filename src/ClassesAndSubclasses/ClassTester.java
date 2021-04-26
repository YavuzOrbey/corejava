package ClassesAndSubclasses;

import ClassesAndSubclasses.Animals.Animal;
import ClassesAndSubclasses.Animals.Cat;

public class ClassTester {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();

        ((Cat) cat1).strut();
    }
}
