package day10;


class Father{
    static int a=10;
    public static void test(){
        System.out.println("Father class static method");
    }
    static{
        System.out.println("SIB father class");
    }
}

class son extends Father{
    static int b=20;
    public static void demo(){
        System.out.println("Son class static method");
    }
    static{
        System.out.println("SIB Son class");
    }
}


public class inherit1 {
    static{
        System.out.println("SIB Driver classs");
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println(Father.a);
		Father.test();
		System.out.println(son.a);
		System.out.println(son.b);
		son.demo();
    }
}


/*

System.out.println(Father.a);
		Father.test();
		System.out.println(Son.a);
		System.out.println(Son.b);
		Son.demo();
ANS: 	
SIB Driver class
Main start
SIB Father class
10
Father class static method
10
SIB Son class
20
Son class static method
main end




Son ref1 = new Son();
		System.out.println(ref1.a);
		ref1.test();
		System.out.println(ref1.b);
		ref1.demo();
		
ANS: 	
SIB Driver class
Main start
SIB Father class
SIB Son class
10
Father class static method
20
Son class static method
main end



System.out.println(Son.a);
		System.out.println(Son.b);
		Son.demo();
		System.out.println(Father.a);
		Father.test();
		
	ANS: 
SIB Driver class
Main start
SIB Father class
10
SIB Son class
20
Son class static method
10
Father class static method
main end
*/