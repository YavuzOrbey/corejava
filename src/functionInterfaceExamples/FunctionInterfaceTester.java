package functionInterfaceExamples;

public class FunctionInterfaceTester {
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
                @Override
                public int doSomething() {
                        return 0;
                }
        };
        MyFunctionalInterface myFunctionalInterface2 = () -> {
                return 0;};
        MyFunctionalInterface myFunctionalInterface3= () -> 0;
        public static void main(String[] args) {

                CompareInterface<Integer> nums = (o1, o2) -> o1>o2 ? o1: o2;
                CompareInterface<String> strings = (o1, o2) -> o1.compareTo(o2)!=0 ? o1: o2;
                System.out.println(nums.compare(10,5));
                System.out.println(strings.compare("aello", "Goodbye"));

                MyFunctionalInterface a = ()-> 10;
                System.out.println(a.doSomething());
                MyFunctionalInterface b = ()-> 10*8;
                System.out.println(b.doSomething());
        }
}
