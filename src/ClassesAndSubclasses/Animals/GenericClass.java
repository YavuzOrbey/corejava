package ClassesAndSubclasses.Animals;

public class GenericClass <T extends Animal>{
    T a;

    public GenericClass(T a) {
        this.a = a;

        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);


    }

    public Animal getAnAnimal(){
        return new Dog();
    }
}
