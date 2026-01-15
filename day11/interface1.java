package day11;

interface Father{
    abstract public void test();
    abstract public int add(int a,int b);
    
}

class Son implements Father{
    @Override
    public void test(){
        System.out.println("abstract method override");
    }
    @Override
    public int add(int a,int b){
        return a+b;
    }
}

public class interface1 {
    public static void main(String[] args) {
        System.out.println("Main start");
        // Father ref=new Father();   CTE we cannt create obj of interface
        Father ref=new Son();
        ref.test();
        System.out.println(ref.add(5, 8));
        System.out.println("Main end");
    }
}
