package day11;


interface Father {
	static int a = 10;// final static int a = 10
	int b = 20; //  final static int b = 20
	
	public static void test() {
		System.out.println("static method");
	}
	void abs();
	
}
class Son implements Father {
	@Override
	public void abs() {
		System.out.println("abstract method");
	}
}

public class interface2 {
	public static void main(String[] args) {
		System.out.println("Main start");
//		Father ref = new Father(); CTE Cannot instantiate the type Father
		Father ref = new Son();
		ref.abs();
		System.out.println(Father.a);
		System.out.println(Father.b);
		
//		ref.test(); CTE This static method of interface Father can only be accessed as Father.test
		Father.test();
	}
}