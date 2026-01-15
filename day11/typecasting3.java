
package day11;

/*
 College wants to manage different branches of engineers
 using Java inheritance.
*/

class Engineer {
    void work() {
        System.out.println("Engineer is working");
    }
}

class CSEEngineer extends Engineer {
    void coding() {
        System.out.println("CSE Engineer is coding");
    }
}

public class typecasting3 {
    public static void main(String[] args) {
        CSEEngineer cse = new CSEEngineer();

        // Step 2: UPCASTING
        // Child object is referred by parent class reference
        Engineer eng = cse;

        // Calling superclass method using parent reference
        eng.work();

        // Step 3: DOWNCASTING
        // Parent reference is converted back to child reference
        CSEEngineer cse2 = (CSEEngineer) eng;

        // Calling subclass-specific method
        cse2.coding(); 
    }
}
