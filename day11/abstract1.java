package day11;

abstract class Father{
    abstract public void test();
    abstract public int add(int a,int b);

}

class Son extends Father{
    @Override
    public void test(){
        System.out.println("Test method override");
    }
    @Override
    public int add(int a,int b){
        return a+b;
    }
    public void demo(){
        System.out.println("Son class demo method");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        System.out.println("main start");
        // upcasting
        Father ref=new Son();
        ref.test();

        System.out.println(ref.add(1, 5));
        // downcasting
        Son obj=(Son)ref;
        obj.demo();
        System.out.println("main end");
    }
}
