package day10;

/*
    HAS-A relationship
*/
class address{
    String city;
    String state;

    public address(String city,String state){
        this.city=city;
        this.state=state;
    }

    void display(){
        System.out.println(city);
        System.out.println(state);
    }
}

class student{
    int id;
    String name;
    double marks;
    address Address;

    public student(int id,String name,double marks,address Address){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.Address=Address;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
        Address.display();
    }
}

public class ques2 {
    public static void main(String[] args) {
        address ad= new address("jalandhr", "punjab");

        student s1= new student(1, "Harshit", 0, ad);

        // ad.display();
        s1.display();
    }
}