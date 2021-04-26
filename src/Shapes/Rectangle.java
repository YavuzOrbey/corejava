package Shapes;

public abstract class Rectangle extends Shape{
    private double width, height;

    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return width*2+height*2;
    }
}
