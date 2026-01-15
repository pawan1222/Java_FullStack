package day12;
/*
Write a java program to handle nullpointer exception
*/
public class exception2 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: String is null.");
        }
    }
}
