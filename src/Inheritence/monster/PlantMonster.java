package Inheritence.monster;

public class PlantMonster extends Monster{
    public PlantMonster(String name){
        super(name);
    }
    public String attack(){
        return "Attack with plants!";
    }
}
