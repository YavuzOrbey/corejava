package Shapes;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double width) {
        super(width, width);
    }


    public void squareInstanceMethod(){

    }
    static void squareStaticMethod(){
        System.out.println("Square static method called");
    }
}
