package Inheritence.monster;

public class MonsterTester {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Charizard");
        Monster m2 = new WaterMonster("Squirtle");
        Monster m3 = new PlantMonster("Bulbasaur");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new WaterMonster("Magikarp");
        System.out.println(m1.attack());

        // We have to assume the assignment didn't want an abstract class because we're instantiating a Monster here
        Monster m4 = new Monster("Jigglypuff");
        System.out.println(m4.attack());
    }
}
