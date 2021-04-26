package Shapes;

public abstract class Shape implements ShapeMethods{

    protected int x;
    protected int y;


    public Shape(){

    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void shapeMethod(){
        System.out.println("This is a real method in the shape abstract class");
    }

    public static void shapeStaticMethod(){  //abstract method cannot be final, static, or private
        System.out.println("Shape static method called");
    }
}

