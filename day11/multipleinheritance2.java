package day11;


// Base class
class Person {
    void showRole() {
        System.out.println("I am a person");
    }
}

// Child class 1
class Student extends Person {
    void study() {
        System.out.println("I am a student");
    }
}

// Child class 2
class Teacher extends Person {
    void teach() {
        System.out.println("I am a teacher");
    }
}

// Interface 1
interface Sports {
    void play();
}

// Interface 2
interface Cultural {
    void perform();
}

// CollegeStudent class
// Extends Student (single inheritance)
// Implements Sports and Cultural (multiple inheritance via interface)
class CollegeStudent extends Student implements Sports, Cultural {

    @Override
    public void play() {
        System.out.println("I play sports");
    }

    @Override
    public void perform() {
        System.out.println("I perform cultural activities");
    }
}

// Main class
public class multipleinheritance2 {
    public static void main(String[] args) {

        // Creating object of CollegeStudent
        CollegeStudent cs = new CollegeStudent();

        // Calling inherited method from Person
        cs.showRole();

        // Calling inherited method from Student
        cs.study();

        // Calling interface methods
        cs.play();
        cs.perform();
    }
}

