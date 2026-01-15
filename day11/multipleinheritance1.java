package day11;


class Father{
    int age=45;
}

interface Mother{
    double height=5.6;
     public void demo();
}

class Son extends Father implements Mother{
    @Override
    public void demo(){
        System.out.println("demo called");
    }
}

public class multipleinheritance1 {
    public static void main(String[] args) {
        System.out.println("Main start");
        // Son ref=new Son();
        Mother ref1=new Son();
        Son ref2=(Son)ref1;

        System.out.println("Son class object accessing Father class variable: "+ref2.age);
        System.out.println("Son class object accessing Mother interface variable: "+Mother.height);
        System.out.println(ref2.age);
        System.out.println(Mother.height);   // we can access interface variable using static way
        ref2.demo();

        System.out.println("Main end");
    }
}
