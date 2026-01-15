package day9;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}
public class employee {
    int id;
    Address address;   

    employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    employee(employee emp) {
        this.id = emp.id;
        this.address = emp.address;  
    }

    public static void main(String[] args) {

        Address addr = new Address("Varanasi");
        employee emp1 = new employee(1, addr);

        employee emp2 = new employee(emp1); 
        emp1.address.city = "Delhi";

        System.out.println("emp1 city: " + emp1.address.city);
        System.out.println("emp2 city: " + emp2.address.city);
    }
}
