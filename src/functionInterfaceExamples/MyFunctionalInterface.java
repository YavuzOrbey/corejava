package functionInterfaceExamples;
@FunctionalInterface
public interface MyFunctionalInterface {
    int doSomething();
    static int lol(){
        return 1;
    }
    default int doSomethingElse(){return 1;}
}
