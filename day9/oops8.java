package day9;

public class oops8 {
    String brand;
    int ramsize;
    double price;

    oops8(){
        this.brand = "Unknown";
        this.ramsize = 8;
        this.price = 50000;
    }
    oops8(String brand, int ramsize){
        this();
        this.brand = brand;
        this.ramsize = ramsize;
    }
    oops8(String brand, int ramsize, double price){
        this();
        this.brand = brand;
        this.ramsize = ramsize;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramsize + "GB");
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        oops8 laptop= new oops8("Dell", 16, 75000);
        laptop.displayDetails();    
        oops8 laptop2= new oops8("HP", 32);
        laptop2.displayDetails();
        oops8 laptop3= new oops8();
        laptop3.displayDetails();
    }
}
