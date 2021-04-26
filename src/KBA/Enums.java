package KBA;

public class Enums {

    enum chocolate{CADBURY, HERSHEY}
    enum Fruits {
        ORANGE(5), APPLE(1);
        int fruit;
        public int getFruit(){
            return this.fruit;
        }
        private Fruits(int i){
            this.fruit = i;
    }
    }
    public static void main(String[] args) {
        chocolate choc = chocolate.CADBURY;
        getAChocolate(choc);
    }

    public static void getAChocolate(chocolate choc){
        System.out.println("Chocolate is " + choc);
    }
}
