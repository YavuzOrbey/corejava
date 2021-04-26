package ExampleCodeFromClass;

public class Monkey {
    public static void main(String[] args) {

        Grabbable b = new Grabbable() {
            final int number =30;
            @Override
            public String grab() {
                return "The monkey grabbed " + number + " humans";
            }
        };

        System.out.println(b.grab());
    }
}
