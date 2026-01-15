package day9;

/*WAJP to create student class having 4 variables such as id,name,percentage, college name
create parameterized constructor to initialize id
create parameterized constructor to initialize name
create parameterized constructor to initialize percentage
create parameterized constructor to initialize id and name
create parameterized constructor to initialize id and percentage
create parameterized constructor to initialize name and percentage
create default constructor to initialize default values
create parameterized constructor to initialize id,name and percentage
create one static method to display all the details of students
in main method create object using all the constructors 
*/
public class oops4 {
    int id;
    String name;
    double percentage;
    String college_name;

    oops4(int id){
        this.id=id;
    }
    oops4(String name){
        this.name=name;
    }
    oops4(double percentage){
        this.percentage=percentage;
    }
    oops4(int id,String name){
        this.id=id;
        this.name=name;
    }
    oops4(int id,double percentage){
        this.id=id;
        this.percentage=percentage;
    }
    oops4(String name,double percentage){
        this.name=name;
        this.percentage=percentage;
    }
    oops4(int id,String name,double percentage){
        this.id=id;
        this.name=name;
        this.percentage=percentage;
    }
    public static void display(oops4 obj){
        System.out.println("id: "+obj.id);
        System.out.println("name: "+obj.name);
        System.out.println("percentage: "+obj.percentage);
        System.out.println("college name: "+obj.college_name);
        System.out.println("---------------");
    }


    public static void main(String[] args) {
        oops4 obj1=new oops4(0);
        oops4 obj2=new oops4("pawan");
        oops4 obj3=new oops4(78.3);
        oops4 obj4=new oops4(0,"pawan");
        oops4 obj5=new oops4(0,9.9);
        oops4 obj6=new oops4("pawan",9.0);
        oops4 obj7=new oops4(0,"pawan",90);
        display(obj1);
        display(obj2);
        display(obj3);
        display(obj4);
        display(obj5);
        display(obj6);
        display(obj7);
    }
}
