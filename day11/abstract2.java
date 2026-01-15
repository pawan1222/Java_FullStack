package day11;
/*
In abstract class we can create 
            static variable
            non-static variable
            static method
            non-static method
            abstract method
            static block
            instance initializer block
            constructor
*/

abstract class Father{
    static int a=6;
    int b=73;
    public static void test(){
        System.out.println("static method");
    }
    public void demo(){
        System.out.println("non static method");
    }

    abstract public void abs();

    static{
        System.out.println("Static initializer block");
    }
    {
        System.out.println("Instance initializer block");
    }

    public Father(){
        System.out.println("Constructor");
    }
}

class Son extends Father{
    @Override
    public void abs(){
        System.out.println("Abstract method");
    }

}

public class abstract2 {
    public static void main(String[] args) {
        System.out.println("main start");
        Father ref=new Son();
        System.out.println(ref.a);
        System.out.println(ref.b);

        ref.test();
        ref.demo();
        ref.abs();
        System.out.println("main end");
    }
}
