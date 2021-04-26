package Inheritence.monster;

public class WaterMonster extends Monster{

    public WaterMonster(String name){
        super(name);
    }
    public String attack(){
        return "Attack with water!";
    }

    public String runAway(String message, int ...a){
        return message;
    }
}
