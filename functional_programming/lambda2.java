package functional_programming;

interface factorial {
    int fact(int n);
}

class FactorialImpl implements factorial {
    @Override
    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

public class lambda2 {
    public static void main(String[] args) {
        // Using traditional class implementation
        factorial f1 = new FactorialImpl();
        System.out.println("Factorial using class: " + f1.fact(5));

        // using anonymous class

        factorial ref = new factorial() {
            @Override
            public int fact(int n) {
                if (n == 0 || n == 1) {
                    return 1;
                }
                return n * fact(n - 1);
            }
        };

        System.out.println("Factorial using anonymous class: " + ref.fact(5));

        // Using lambda expression

        factorial f2 = (n) -> {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * (n - 1);
        };

        System.out.println("Factorial using lambda: " + f2.fact(5));
    }
}
