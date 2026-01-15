package day9;

/*
Global variables
    Static members ->
        Static variables
            A variable which is declared with static keyword is called static variable
            It is type of global variable
            we can use without initialation because default value is assigned
            we can use globales variable inside global as well as local area.

            default values:
                byte, short, int, long -> 0
                float, double -> 0.0
                char -> '\u0000'
                boolean -> false
                object reference -> null
                string -> null


        Static methods
        Static blocks or (static initializers)

    Non-static members ->
        non-static variables (instance variables)
        non-static methods (instance methods)
        non-static blocks (instance initializers)
        constructors    



   * write a difference between local and global variable
        Local variable:
            1. variable which is declared inside the method or block is called local variable
            2. we must initialize local variable before use
            3. we can use local variable only inside the method or block where it is declared

        Global variable:
            1. variable which is declared outside the method or block is called global variable
            2. we can use without initialation because default value is assigned
            3. we can use globales variable inside global as well as local area.


        whenever we have same name of local and global variable then local variable get higher priority
        to use static global variable inside local we have to use classname.variable name




    JVM memory structure -> for execution of java program JVM create these 3 memory areas
        1. Class static area (class area / static area)
            -> static variables
            -> static methods
            -> static blocks

            class static area :
                Every class will have a dedicated memory to store all static members of that class
                the name of that memory area is called method area or class area or static area
                every static context is directly stored inside the class static area

        2. Stack area
            -> local variables
            -> method calls

                It is used for execution of methods
                every time when a method is called a new block is created inside the stack area to store

        3. Heap area
            -> non-static variables
            -> non-static methods
            -> non-static blocks
            -> constructors
        

       * Write a diff bt static method and static block
            Static method:
                1. it is used to perform certain task
                2. we can call static method directly by its name inside static area
                3. we can call static method by classname.methodname from non-static area
                4. we can pass parameters to static method
                5. it may or may not return a value

            Static block:
                1. it is used to initialize static members
                2. it is automatically called when class is loaded inside JVM
                3. we cannot call static block directly from static or non-static area
                4. we cannot pass parameters to static block
                5. it does not return any value

                example of static block:
                    static {
                        // initialization code
                    }

            can we overload main method?
                yes we can overload main method but JVM will call only the standard main method
                public static void main(String[] args)



       * non static member will not be stored inside class static area
            because non static members are instance specific
            so non static members are stored inside heap area

            eg:
                class Test {
                    int x; // non static variable
                    void display() { // non static method
                        System.out.println(x);
                    }
                }
            eg:
                int a=9;
                public static void main(String[] args) {
                    System.out.println(a); // error
                } 

                because a is non static variable so we cannot access it directly inside static area  
                
       * To use/store non static members we have to create object of that class;
            object: it is a instance of a class
            to create object we have to use new keyword

            what is new ?
                new is a keyword
                it is unary operator
                with the help of new keyword we can create n number of objects of a class
                it will return the address of the object in heap area
                whenever we create an object of a class the constructor of that class is called automatically

                how to create object using new keyword?
                    classname objname = new classname();
                    classname is user defined data type
                    objname is reference variable to store address of object
                    new classname() will create object in heap area and return address of object

                

        class name is a non primitive data type which is stored address of object in stack area

       * how to use non static members inside static context?
            with the help of object reference variable

            syntax:
                classname objname = new classname();
                objname.nonstaticvariable;
                objname.nonstaticmethod();

       * how to use statc members inside static context?
            direct use by name
            classname.staticmembername

            eg:
                class Test {
                    static int x=10;
                    static void display() {
                        System.out.println(x);
                    }
                }

                public static void main(String[] args) {
                    System.out.println(Test.x);
                    System.out.println(x); // direct use
                    Test.display();
                }
        every object directly point to class static area to use static members

       * write a diff between static variable and non static variable
            Static variable:
                1. it is declared with static keyword
                2. it is type of global variable
                3. it is stored inside class static area
                4. it is shared among all objects of that class
                5. we can use static variable without creating object of that class

            Non static variable:
                1. it is declared without static keyword
                2. it is type of instance variable
                3. it is stored inside heap area
                4. it is specific to each object of that class
                5. we must create object of that class to use non static variable


        * non static method
            1. it is declared without static keyword
            2. it is used to perform certain task
            3. it is stored inside heap area
            4. it is specific to each object of that class
            5. we must create object of that class to call non static method

            eg:
                class Test {
                    void display() {
                        System.out.println("Hello");
                    }
                }

                public static void main(String[] args) {
                    Test t = new Test();
                    t.display();
                }


       * Whenever we have non static and static variable with same name
        then local variable has highest priority 
        to use non static variable we have to use this keyword with reference variable
            eg:
                class Test {
                    int a = 10; // non static variable

                    void display() {
                        int a = 20; // local variable
                        System.out.println(a); // 20
                        System.out.println(this.a); // 10
                    }
                }

            this:
                    It is a keyword
                    It is a reference variable
                    It is used to refer current object
                    It is used to access non static members inside non static context
                    It is used to differentiate local and non static variable with same name
                    cannot be used inside static context


       * how to use non static members inside non static context?
            direct use by name
            this.nonstaticmembername

            eg:
                class Test {
                    int x=10;
                    void display() {
                        System.out.println(x); // direct use
                        System.out.println(this.x); // using this keyword
                    }
                }

       * how to use non static members inside static context?
                    with the help of object reference variable

                    syntax:
                        classname objname = new classname();
                        objname.nonstaticvariable;
                        objname.nonstaticmethod();


       * How to use static members inside non static context?
            direct use by name
            classname.staticmembername

            eg:
                class Test {
                    static int x=10;
                    void display() {
                        System.out.println(x); // direct use
                        System.out.println(Test.x); // using classname
                    }
                } 


       * non static blocks which declared without static keyword
         it is also called instance initializer block
            1. it is used to initialize non static members
            2. it is called whenever object is created
            3. we can have multiple non static blocks in a class 

            example with called when object is created:
                class Test {
                    {
                        // initialization code
                    }
                        public static void main(String[] args) {
                        Test t = new Test(); // non static block called here
                    }
                }
                
        class loading process
            -> static block loading

        object loading
            -> non static block loading



       * constructor:
            It is special type of non static member
            because the name of constructor is as same as classname.
            It is similar to method but it doesnot have return type.

            every constructor will have
                1. constructor chaining
                        :one constructor calling another constructor
                    how to achieve constructor chaining?
                        1. this - to call current class constructor
                                this():
                                    It is a keyword
                                    It is used to call current class constructor
                                    It is used to achieve constructor chaining
                                    It must be the first statement in constructor
                                    It can be used only inside constructor
                            note: constructor recursion is not allowed bcz it will not create an object
                                  if we try to acheive constructor recursion then it will give compile time error


                        2. super() - to call parent class constructor
                     
                2. PLI - pre loading instruction
                3. IIB - instance initializer block
                4. UWS - user written statements

                
            eg include main method:
                class Test {
                    Test() { // constructor
                        System.out.println("constructor called");
                    }

                    public static void main(String[] args) {
                        Test t = new Test(); // constructor called here
                    }
                }


            1. Default constructor:
                If we do not define any constructor in a class then compiler will provide default constructor
                Default constructor is a no-argument constructor
                It will initialize object with default values

            2. parameterized constructor:
                A constructor which have parameters is called parameterized constructor
                It is used to initialize object with user defined values

                why we use parameterized constructor?
                    to provide different values to different objects at the time of object creation

                eg:
                    class Test {
                        int a;
                        Test(int a) { // parameterized constructor
                            this.a = a;
                        }

                        void display() {
                            System.out.println(x);
                        }

                        public static void main(String[] args) {
                            Test t = new Test(10); // passing value to constructor
                            t.display(); // 10
                        }
                    }   
            3.copy constructor:
                A constructor which accepts object of same class as parameter is called copy constructor
                It is used to initialize one object with another object of same class

                eg:
                    class Test {
                        int a;
                        Test(int a) { // parameterized constructor
                            this.a = a;
                        }

                        // copy constructor
                        Test(Test t) {
                            this.a = t.a;
                        }

                        void display() {
                            System.out.println(a);
                        }

                        public static void main(String[] args) {
                            Test t1 = new Test(10); // parameterized constructor
                            Test t2 = new Test(t1); // copy constructor
                            t2.display(); // 10
                        }
                    }

        Write diff bt static and non static block
            Static block:
                1. it is declared with static keyword
                2. it is used to initialize static members
                3. it is called only once when class is loaded inside JVM
                4. it is stored inside class static area

            Non static block:
                1. it is declared without static keyword
                2. it is used to initialize non static members
                3. it is called whenever object is created
                4. it is stored inside heap area

        write diff bt constructor and method
            Constructor:
                1. it is special type of non static member
                2. the name of constructor is as same as classname
                3. it does not have return type
                4. it is used to initialize object
                5. it is called automatically when object is created

            Method:
                1. it is a regular type of non static member
                2. the name of method can be any valid identifier
                3. it has return type
                4. it is used to perform certain task
                5. it is called explicitly by programmer

        * Why constructor recursion is not possible?
            because constructor recursion will not create an object
            if we try to achieve constructor recursion then it will give compile time error

        * Use of constructor overloading
            to provide different ways to initialize object of a class

        * when we use parameterized constructor?
            to provide different values to different objects at the time of object creation

        * what is the use of copy constructor?
            to initialize one object with another object of same class

        note:
            In constructor we can use only one this calling statement
            Contractor calling statement must be the first statement in any constructor
*/

public class oops_notes {
    static int a=10; // static global variable

    public static void main(String[] args) {
        int a=20; // local variable
        System.out.println(a); // 20
        System.out.println(oops_notes.a); // 10
    }
}
