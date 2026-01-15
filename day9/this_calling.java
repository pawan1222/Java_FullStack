package day9;

public class this_calling {
    int id;
    String name;
    double salary;

    // default constructor
    public this_calling() {
        this.id=101;
        this.name="pawan";
        this.salary=45000;
    }
    // paarameterized constructor
    public this_calling(int id) {
        this();
        this.id = id;
    }
    public this_calling(String name){
        this();
        this.name=name;
    }
    public static void main(String[] args) {
        this_calling obj=new this_calling("pawan singh");

        System.out.println("id: "+obj.id);
        System.out.println("name: "+obj.name);
        System.out.println("salary: "+obj.salary);
    }
}
