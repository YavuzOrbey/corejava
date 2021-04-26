package examplePackage;

public class Vehicle {

    protected boolean canFly;
    private String color;
    public static int windows = 4;
    //constructor
    public  Vehicle(){
        System.out.println("I just created a vehicle!");
    }

    public Vehicle(String newColor){
        color = newColor;
    }

    // methods
    public void drive(){
        System.out.println("Vehicle is moving");
    } //method

    public void stop(){
        System.out.println("Vehicle stopped");
    }


    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public static void doSomething(){
        System.out.println("Doing Something");
    }

}
