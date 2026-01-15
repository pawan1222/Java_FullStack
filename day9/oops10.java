package day9;

class oops10 {

    static void display(int a) {
        System.out.println("Static display method with int: " + a);
    }


    static void display(String s) {
        System.out.println("Static display method with String: " + s);
    }

    void display(int a, double b) {
        System.out.println("Non-static display method with int and double: " + a + ", " + b);
    }

    void display() {
        System.out.println("Non-static display method with no parameters");
    }

    public static void main(String[] args) {

        // Calling static overloaded methods
        oops10.display(10);
        oops10.display("Hello Java");

        // Creating object to call non-static methods
        oops10 obj = new oops10();
        obj.display();
        obj.display(5, 3.14);
    }
}

