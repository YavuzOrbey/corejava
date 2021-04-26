package functionInterfaceExamples;

public class InterfaceImplementer {
    GenericFunctionalInterface genericFunctionalInterface = new GenericFunctionalInterface() {
        @Override
        public <T> void doSomething(T a, T b) {
            System.out.println(a + " and " + b);
        }};
}
