package day12;
/*
WAJP to handle classCastException
*/
public class exception3 {
    public static void main(String[] args) {
        Object obj = new Integer(100);
        try {
            String str = (String) obj; // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: Cannot cast Integer to String.");
        }
    }
}
