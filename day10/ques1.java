package day10;
/*
WAJP to create static method which create a object and return address 
*/

public class ques1 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static ques1 method(){
        ques1 obj=new ques1();
        return obj;
    }
}
