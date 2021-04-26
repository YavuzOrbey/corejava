package Shapes;

public interface ShapeMethods extends ShapeMethodsContinued, ShapeMethodsAgain{ //interfaces extend other interfaces --separate with comma
    //interface methods are abstract and public by default

    int i=10; //Interface variables are public, static, final
    double getArea();
    double getPerimeter();
}
