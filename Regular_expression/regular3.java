package Regular_expression;
/*
make a regrex to match these pattern and output should be:
Hello World -> true
Java 8 -> true
User1 Name -> true
Suraj Kumar -> true
A B -> true
Test Case -> true
Hello -> false
Java8 -> false
123 -> false
HelloWorld -> false
 Hello World -> false
Hello  World -> false

*/
public class regular3 {
    public static void main(String[] args) {
        String regrex = "^\\w+\\s(\\w+|\\d+)$";

        System.out.println("Hello World".matches(regrex));
        System.out.println("Java 8".matches(regrex));
        System.out.println("User1 Name".matches(regrex));
        System.out.println("Suraj Kumar".matches(regrex));
        System.out.println("A B".matches(regrex));
        System.out.println("Test Case".matches(regrex));
        System.out.println("Hello".matches(regrex));
        System.out.println("Java8".matches(regrex));
        System.out.println("123".matches(regrex));
        System.out.println("HelloWorld".matches(regrex));
        System.out.println(" Hello World".matches(regrex));
        System.out.println("Hello  World".matches(regrex));
    }
}
