package day11;
/*
perform upcasting in inheritance

*/

class level1{
    int data1=5;
}
class level2 extends level1{
    int data2=10;
}
class level3 extends level2{
    int data3=15;
}
class level4 extends level3{
    int data4=20;
}

public class typecasting {
    public static void main(String[] args) {
        level1 ref1=new level2();
        level2 ref2=new level3();
        level3 ref3=new level4();
        // we can access member of superclass of reference type class
        System.out.println(ref2.data1);
        System.out.println(ref3.data2);
        System.out.println(ref3.data3);
    }
}
