package day12;
/*

Wrapper class:
    A wrapper class in java is used to convert primitive data type into objects.
    Java provides one wrapper class for each primitive type.

Why Wrapper class are needed?
    Java works with object, not primitives, in many places (Collections, Generics, etc)
    Wrapper classes allow primitives to be treated as objects.
    provide utility methods for type conversion.
    support null values (primitive cannot)

    primitive datatype -> Wrapper class

    byte                  class Byte
    short                 class Short
    int                   class Integer
    long                  class Long
    float                 class Float
    double                class Double
    char                  class Character
    boolean               class Boolean


    Boxing:
        The conversion of premitive datatypeinto non premitive class is known as boxing.
    Unboxing:
        The conversion of non-premitive class into premitive datatype is known as Unboxing.
*/
public class WrapperClass {
    public static void main(String[] args) {
        int a = 10; // primitive datatype
        int i = a; // primitive datatype
        System.out.println("Implicite boxing: "+i);
        Integer b = Integer.valueOf(a); // Boxing
        System.out.println("Explicit boxing: "+b);

        
        Integer c = 20; 
        int j = c;
        System.out.println("Implicite Unboxing: "+i);
        int k = c.intValue(); // Unboxing
        System.out.println("Explicit Unboxing: "+k);
    }
}
