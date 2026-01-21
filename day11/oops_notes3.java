package day11;

/*
polymorphish:
    An ability of an object to exhibit more than one form is known as polymorphism


    Types of polymorphism:
        1. compile time polymorphism
            The binding happens during compile time is known as compile time polymorphism
            it is also known as static binding

            we can acheive compile time polymorphism using
                1. method overloading
                2. constructor overloading
                3. variable shadowing
                    subclass and superclass having static or non-static variable with same name is called variable shadowing.
                    which variable to be called is decided during compile time based on reference variable type.
                4. method shadowing
                    A subclass and super class having static method with same name, same access modifier, same return type
                    and same formal arguments.
                    Which method to be called is decided during compile time based on reference variable type.

        2. runtime polymorphism
            The binding happens during runtime is known as runtime polymorphism
            It is also known as dynamic binding

            we can acheive runtime polymorphism using method overriding
                A subclass and super class having non-static method with same name, same access modifier, same return type
                    and same formal arguments.
                    Which method to be called is decided during runtime based on object creation.

            Annotation: extra validation provided by programmer
                @override
                    :which means method is override from superclass
                     if we are not giving same access modifier, name, return type or formal arguments then
                     it will give error


        Q-> why we use variable shadowing?
        Q-> where we use variable shadowing?


    **Abstraction:
            Abstraction means showing only the essential features and hiding the internal implementation details.
            in simple words: displaying the things which are required and hiding the things which are not required.

        Q. how Abstraction is acheived in java?
            using abstract class
            using interface
        
        Concrete method:
            A method which has method body and it contains implementation logic.

        Abstract method:
            A method which does not have method body.

        Abstract class:
            A abstract class is a class that cannot be instantiated and may contain abstract methods.
            If any class inherits abstract method then that inherited class must be an abstract.
            if we dont want to make that inherited class as abstract then we have to override the abstract method.
        
        Q. How to create abstract method?
            must be prefixed with the abstract keyword.
            must end with a semicolon (;).
            Does not have a method body.

Note:  we cannot create static method as abstract method.
        bcz we cannot override static method.

        ** In abstract class we can create 
            static variable
            non-static variable
            static method
            non-static method
            abstract method
            static block
            instance initializer block
            constructor

        In abstract class we can create abstract method as well as non-static concreet method hence 
        we cannot acheive 100 percent of abstraction using abstract class
        if we want to acheive 100 percent of abstraction then we have to use interface


    ** Interface:
        Interface is a keyword .
        It is used to create non-premitive datatype.
        It is used to acheive 100 percent of abstraction.
        It is used to multiple inheritance.

        to inherit interface into class we use implements keyword.
        with the help of implements keyword we can inherit more than one interface.
        we cannot create object of interface.

        In Interface we cannot create 
            static initializer block
            instance initializer block
            constructor

        In interface all the non static methods are already prefixed with abstract and public keyword.
        hence we can acheive 100 % of abstraction using interface.

        in interface all the variables are already prefixed with final and static keyword.
        if any variable is prefixed with final keyword which means we cannot re-initialize that variable.

        static method of interface can be access only using static way.

        If we want to inherit one class into another class, we use the extends keyword.
        If we want to inherit(implement) an interface into a class, we use the implements keyword.
        If we want to inherit one interface into another interface, we use the extends keyword.
        If we try to inherit a class into an interface, it is not possible in java.


        Types of interface:
            1.Regular or normal interface
            2.Marker interface
            3.Functional interface
                Functional interface is an interface which contains only one abstract method.
                It may contain any number of default methods and static methods.
                It is introduced in java 8 version.
                It is also known as Single Abstract Method(SAM) interface.
                It is used to provide the implementation logic using lambda expression.
        
        What is functional programming?
            A programming paradigm that treats computation as the evaluation of mathematical functions and
            avoids changing state and mutable data.
            Java 8 introduced functional programming features to make java:
                Shorter
                Clearer
                faster
                modern

            Predefined functional interfaces:
                Runnable interface -> run() used in multithreading
                Comparable interface -> compareTo() used in Collection sorting
                Comparator interface -> compare(obj o1, obj o2) used in Collection sorting

            Anonymous class:
                A class without a name is called anonymous class.
                It is used to provide the implementation logic of abstract method of abstract class or interface
                at the time of object creation.
                It is also known as local inner class.
                    to override a method of an existing class
                    to implement an interface

            Lambda expression:
                A lambda expression is an anonymous function that provides implementation of a functional interface.
                A lambda expression is a short way to write a method without name, without class, and without boilerplate code.

            Syntax of lambda expression:
                (parameters) -> expression
                OR
                (parameters) -> {multiple statments}

                Example:
                    (int a, int b) -> {return a+b;}

            

                
        

*/

// variable shadowing

/* 
class Father{
    int a=10;
    static int b=100;
}

class Son extends Father{
    int a=20;
    static int b=200;
}
public class oops_notes3 {
    public static void main(String[] args){
        System.out.println("Main start");
        System.out.println("Father object stored in father ref variable");
        Father ref1 =new Father();
        System.out.println(ref1.a);
        System.out.println(ref1.b);

        System.out.println("Son object stored in son ref variable");
        Son ref2=new Son();
        System.out.println(ref2.a);
        System.out.println(ref2.b);

        System.out.println("Upcasting");
        Father ref3=new Son();
        System.out.println(ref3.a);
        System.out.println(ref3.b);

        System.out.println("Downcasting");
        Son ref4=(Son)ref3;
        System.out.println(ref4.a);
        System.out.println(ref4.b);

        System.out.println("Main end");

    }
    
}
*/

// method shadowing

/* 
class Father{
    public static void test(){
        System.out.println("Father class test method");
    }
    public static void demo(int a){
        System.out.println("Father class demo method");
    }
}

class Son extends Father{
    public static void test(){
        System.out.println("Son class test method");
    }
    public static void demo(int a){
        System.out.println("Son class demo method");
    }
}
public class oops_notes3 {
    public static void main(String[] args){
        System.out.println("Main start");
        System.out.println("Father object stored in father ref variable");
        Father ref1 =new Father();
        ref1.test();
        ref1.demo(0);

        System.out.println("Son object stored in son ref variable");
        Son ref2=new Son();
        ref2.test();
        ref2.demo(0);

        System.out.println("Upcasting");
        Father ref3=new Son();
        ref3.test();
        ref3.demo(0);
        System.out.println("Downcasting");
        Son ref4=(Son)ref3;
        ref4.test();
        ref4.demo(0);

        System.out.println("Main end");

    }
    
}
*/

// override

class Father{
    public void test(){
        System.out.println("Father class test method");
    }
    public void demo(int a){
        System.out.println("Father class demo method");
    }
}

class Son extends Father{
    public void test(){
        System.out.println("Son class test method");
    }
    public void demo(int a){
        System.out.println("Son class demo method");
    }
}
public class oops_notes3 {
    public static void main(String[] args){
        System.out.println("Main start");
        System.out.println("Father object stored in father ref variable");
        Father ref1 =new Father();
        ref1.test();
        ref1.demo(0);

        System.out.println("Son object stored in son ref variable");
        Son ref2=new Son();
        ref2.test();
        ref2.demo(0);

        System.out.println("Upcasting");
        Father ref3=new Son();
        ref3.test();
        ref3.demo(0);
        System.out.println("Downcasting");
        Son ref4=(Son)ref3;
        ref4.test();
        ref4.demo(0);

        System.out.println("Main end");

    }
}





// @override keyword 

/* 
class Father{
    public void test(){
        System.out.println("Father class test method");
    }
    public void demo(int a){
        System.out.println("Father class demo method");
    }
}

class Son extends Father{
    @Override
    public void test(){
        System.out.println("Son class test method");
    }
    @Override
    public void demo(int a){
        System.out.println("Son class demo method");
    }
}
public class oops_notes3 {
    public static void main(String[] args){
        System.out.println("Main start");
        System.out.println("Father object stored in father ref variable");
        Father ref1 =new Father();
        ref1.test();
        ref1.demo(0);

        System.out.println("Son object stored in son ref variable");
        Son ref2=new Son();
        ref2.test();
        ref2.demo(0);

        System.out.println("Upcasting");
        Father ref3=new Son();
        ref3.test();
        ref3.demo(0);
        System.out.println("Downcasting");
        Son ref4=(Son)ref3;
        ref4.test();
        ref4.demo(0);

        System.out.println("Main end");

    }
    
}

*/



