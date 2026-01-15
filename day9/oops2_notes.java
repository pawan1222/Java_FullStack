package day9;

/*
OOPS:
    Object Oriented Programming Systems

    it is a design model or paradigm which helps the programmers to coorelate real world scenarios into programming world
    in the form of objects

    Encapsulation
    Inheritance
    Polymorphism
    Abstraction

    1. Encapsulation:
        binding or wrapping data members and methods into a single unit called encapsulation

        why we use encapsulation?
            to achieve data hiding

        what is data hiding?
            the process of avoiding direct access but providing controlled access is known as data hiding
        
        how to avoid direct access?
            by using access specifiers/modifiers
            private:
                private is a keyword
                if we make a data member private then it cannot be accessed directly outside the class
                we can only access it inside the class
        
        how to provide controlled access?
            by using getter and setter methods
                getter method:
                    used to get the value of private data member
                setter method:
                    used to set the value of private data member



   ** Types of relationship in java:
        1: HAS-A relationship
        2: IS-A relationship

        HAS-A relationship->

            1.Aggregation
                is a weak HAS-A relationship where the child object is created outside the parent class
                and can exist independently

            2. Composition
                is a strong HAS-A relationship where the parent class creates and owns the child class,
                and the child cannot exist independently
        
        Inheritance -> IS-A relationship
            child class inherit properties of parent class we can acheive with the help of extend keywords
            and implement keywords

            child class only inherit properties and data to the parent class

        Q-> can we inherit static members?
          -> yes... but cant be overriden
        Q-> can we inherit non-static members?
          -> yess...

       . object class is the super most class of all java class 
       . we can inherit non-static member because of constructor chaining of super calling statment

       super calling statment->
            is a constructor calling statement 
            it is use to call constructor of super class
            it must be the first stament inside any constructor

            if programmer has not return this() calling statment then by default 
            compiler will add no argument super calling statment

            we cant use this() calling statment and super() in same constructor
            we can use only one super calling statment in one constructor

    ** Diff bt super calling statment and this calling statment
            super->
                super calling statment call constructor of parent class constructor

            this->
                this calling statment call constructor of the same class constructor

    ** Types of inheritance
        ->single level inheritance
            sub-class have only one parent class

        ->multi-level inheritance
            one sub-class have multiple super class at different level is known as multilevel inheritance

        -> hirearichal inheritance
            one super-class is having more than one sub-class is known as hierirechal inheritance

        -> multiple inheritance
            one sub-class is having more than one superclass at same level is known as multiple inheritance
            In java we can not acheive multiple inheritance with the help of class because of diamond problem
            To acheive multiple-inheritance in java we have to use interface

        -> Hybrid inheritance
            combination of any two or more inheritance is known as hybrid inheritance


        ** problem arises during multiple inheritance is known as diamond problem
            problem:
                confusion with respect to class loading process
                confusion with respect to object loading process
                confusion with respect to access similar method


        upcasting-> when we are converting subclass type into super class type
                    in upcasting we create object of sub-class and store inside super-class reference variable
                    with the help of upcasting we can access only the member of super-class



        downcasting-> when we are converting super class type into sub class type
                      with the help of downcasting we can access members of sub-class as well as member of super class

        note: if we try to perform downcasting without upcasting it will throw class cast axception


*/

public class oops2_notes {
    
}
