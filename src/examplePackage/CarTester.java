package examplePackage;
public class CarTester {

    public CarTester(){
        return;
    }
    public static void main(String[] args){

        //instantiating a new Object

//        Vehicle vehicle1;
//        vehicle1 = new Vehicle();
//
//        Vehicle vehicle2 = new Vehicle();
//        Vehicle vehicle3 = new Vehicle();
//        Vehicle vehicle4 = new Vehicle();
//
//        Vehicle vehicle5 = new Vehicle("Red");
            Vehicle car = new Car();
            car.drive(); // its going to give the Car class's overridden drive method


        if(1 <3){
            System.out.println("1 < 3!");
        }
        else{
            System.out.println("This");
        }


    }
}
