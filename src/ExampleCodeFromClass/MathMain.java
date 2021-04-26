package ExampleCodeFromClass;

public class MathMain {
    public static void main(String[] args) {
        MathInterface c = (a,b)-> a > b ? a: b;
        System.out.println(c.compare(420,1337));

    }
}
