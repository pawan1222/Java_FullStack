package day9;
// WAJP to execute instance initializer block and execute non static method before the execution of main method
public class oops3 {
    {
        System.out.println("instance initializer block called");
    }

    static{
        System.out.println("static block executes");
        oops3 obj=new oops3(); 
        obj.solve();
    }
    void solve(){
        System.out.println("non static block called");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        
        System.out.println("main called");
    }
}
