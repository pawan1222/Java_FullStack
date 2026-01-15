package day9;

class encap2 {
    private String name;
    private int age;
    private String country;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }
}

public class encap1 {
    public static void main(String[] args) {
        encap2 person = new encap2();
        // Accessing the name using the getter method
        person.setName("pawan");
        System.out.println("Name: " + person.getName());
        person.setAge(21);
        System.out.println("Age: " + person.getAge());
        person.setCountry("india");
        System.out.println("Name: " + person.getCountry());
    }
}