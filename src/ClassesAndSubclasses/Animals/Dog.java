package ClassesAndSubclasses.Animals;

import ClassesAndSubclasses.Animals.Animal;

public class Dog extends Animal {
    String speak() {
        return "Woof!";
    }

    public Speakable returnASpeakeable(){
        return new Speakable() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}
