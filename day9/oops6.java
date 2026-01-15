package day9;
/*
create a java class named student with the following requirnments
1. Instance variables:
    - int id
    - String name
    - int[] marks(size 3)
2. create parameterized constructor to initialize all variables
   A copy constructor to create a deep copy of the object
3. in main method:
    - create an object of student class using parameterized constructor
    - create another object using copy constructor
    - modify the marks array of the first object
    - display the marks of both objects
4. Ensure that changes made to the copied object do not affect the original object.
*/
public class oops6 {
    
    int id;
    String name;
    int[] marks = new int[3];

    oops6(int id, String name, int[] marks){
        this.id=id;
        this.name=name;
        for(int i=0;i<3;i++){
            this.marks[i]=marks[i];
        }
    }

    oops6(oops6 obj){
        this.id=obj.id;
        this.name=obj.name;
        for(int i=0;i<3;i++){
            this.marks[i]=obj.marks[i];
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3};
        oops6 obj=new oops6(1,"pawan",arr);
        oops6 obj2=new oops6(obj);
        obj.marks[0]=100;
        for(int i=0;i<3;i++){
            System.out.println(obj.marks[i]);
        }
        for(int i=0;i<3;i++){
            System.out.println(obj2.marks[i]);
        }
    }
}
