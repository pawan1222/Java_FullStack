package day6;
/*
method:  is a block of statement to perform any task

Access modifier/specifier
return types of method
name of method
()

method can be create only in global area
we can create n numbers of method in one class
method gets executed only  when it called
one method called n numbers of time


method overloading-> a class is having more than one method with same name but different formal arguments, 
either they are differ in length datatype or sequence as method overloading  

why we use method overloading
if we want to perform same task with different arguments


*/
public class method1 {
    public static void main(String[] args) {
        System.out.println("main method");
        add(10,20);
    }

    public static void add(int a,int b) {
        
        int add=a+b;
        System.out.println(add);
    }
}
