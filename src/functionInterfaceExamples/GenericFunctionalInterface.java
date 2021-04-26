package functionInterfaceExamples;
@FunctionalInterface
public interface GenericFunctionalInterface {
     <T> void doSomething(T a, T b);
}
