package examplePackage;

public class Car extends Vehicle{
    private String color;
    public int gear;
    public Car(){

        color = "white";
    }

    public String getColor(){ // Getter
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void drive(){
        System.out.println("Car is moving!");
    }

    public void changeGear(){
        System.out.println("changing gears");
    }

}
