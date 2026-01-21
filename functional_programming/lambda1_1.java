package functional_programming;

@FunctionalInterface
interface FunctionalInterface1 {
    void greet();
}

@FunctionalInterface
interface FunctionalInterface2 {
    int add(int a, int b);
}

public class lambda1_1 {
    public static void main(String[] args) {

        // Anonymous class implementation
        FunctionalInterface1 ref1 = new FunctionalInterface1() {
            @Override
            public void greet() {
                System.out.println("Hello, welcome to Java!");
            }
        };
        ref1.greet();

        // Lambda expression implementation
        FunctionalInterface1 ref2 = () -> System.out.println("Hello, welcome to Java!");
        ref2.greet();

        // Anonymous class for add()
        FunctionalInterface2 ref3 = new FunctionalInterface2() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Sum: " + ref3.add(5, 10));

        // Lambda expression for add()
        FunctionalInterface2 ref4 = (a, b) -> a + b;
        System.out.println("Sum: " + ref4.add(5, 10));
    }
}

