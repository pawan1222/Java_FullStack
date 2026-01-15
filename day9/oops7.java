package day9;

public class oops7 {
    String brand;
    int storage;
    boolean is5G;


    oops7(){
        this.brand = "Unknown";
        this.storage = 64;
        this.is5G = false;
    }
    oops7(String brand, boolean is5G){
        this();
        this.brand = brand;
    }

    public static void main(String[] args) {
        oops7 phone = new oops7("Samsung", true);
        System.out.println("Brand: " + phone.brand);
        System.out.println("Storage: " + phone.storage + "GB");
        System.out.println("5G Support: " + phone.is5G);
    }
}
