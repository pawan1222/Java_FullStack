package day11;


class Father {
	int a = 10;	
}
class Son extends Father {
	int b = 20;
}

public class typecasting2 {
    public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("---object of father store inside father class ref variable---");
		Father ref1 = new Father();
		System.out.println(ref1.a);
//		System.out.println(ref1.b); CTE cannot find symbol
		System.out.println("---Object of son store inside son class ref variable---");
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("---upcasting---");
		Father ref3 = new Son(); 
		System.out.println(ref3.a);
//		System.out.println(ref3.b);CTE cannot find symbol
		System.out.println("---downcasting---");
		Son ref4 = (Son)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		System.out.println("main end");
	}
}