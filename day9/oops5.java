package day9;
// make copy constructor and pass object as a parameter
public class oops5 {
    int id;
    String name;

    public oops5(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // copy constructor
    public oops5(oops5 obj) {
        this.id = obj.id;
        this.name = obj.name;
    }
    // main method
    public static void main(String[] args) {
        oops5 original = new oops5(1, "Pawan");
        oops5 copy = new oops5(original);

        System.out.println("Original Object: id = " + original.id + ", name = " + original.name);
        System.out.println("Copied Object: id = " + copy.id + ", name = " + copy.name);
    }
}
