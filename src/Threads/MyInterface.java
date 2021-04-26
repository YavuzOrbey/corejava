package Threads;
@FunctionalInterface
public interface MyInterface {

     default int doSomething(){
          return 0;
     }
      boolean doSomethingElse();

     static int doAnotherThing(){
          return 1;
     }
}
