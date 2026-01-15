package day12;
/*
WAJP to conver each premitive datatype into its corresponding wrapper class object and vice versa.
*/
public class Wrapper1 {
    public static void main(String[] args) {

        // Int->Integer
        int a=10;
        int b=a;
        System.out.println("Implicite boxing: "+b);
        Integer c=Integer.valueOf(a);
        System.out.println("Explicite boxing: "+c);

        // Integer->int
        Integer d = 20;
        int e = d;
        System.out.println("Implicite unboxing: "+e);
        int f = d.intValue();
        System.out.println("Explicite unboxing: "+f);

        // byte -> Byte
        byte g = 1;
        byte h = g;
        System.out.println("Implicite boxing: "+h);
        Byte i = Byte.valueOf(h);
        System.out.println("Explicite boxing: "+i);

        // Byte -> byte
        Byte j = 3;
        byte k = j;
        System.out.println("implicite unboxing: "+k);
        byte l = j.byteValue();
        System.out.println("Explicite unboxing: "+l);

        // short -> Short
        short s1 = 100;
        short s2 = s1;
        System.out.println("Implicit boxing: " + s2);
        Short s3 = Short.valueOf(s1);
        System.out.println("Explicit boxing: " + s3);

        // Short -> short
        Short s4 = 200;
        short s5 = s4;
        System.out.println("Implicit unboxing: " + s5);
        short s6 = s4.shortValue();
        System.out.println("Explicit unboxing: " + s6);

        // long -> Long
        long l1 = 1000L;
        long l2 = l1;
        System.out.println("Implicit boxing: " + l2);
        Long l3 = Long.valueOf(l1);
        System.out.println("Explicit boxing: " + l3);

        // Long -> long
        Long l4 = 2000L;
        long l5 = l4;
        System.out.println("Implicit unboxing: " + l5);
        long l6 = l4.longValue();
        System.out.println("Explicit unboxing: " + l6);

        // float -> Float
        float f1 = 2.5f;
        float f2 = f1;
        System.out.println("Implicit boxing: " + f2);
        Float f3 = Float.valueOf(f1);
        System.out.println("Explicit boxing: " + f3);

        // Float -> float
        Float f4 = 3.5f;
        float f5 = f4;
        System.out.println("Implicit unboxing: " + f5);
        float f6 = f4.floatValue();
        System.out.println("Explicit unboxing: " + f6);

        // double -> Double
        double d1 = 10.55;
        double d2 = d1;
        System.out.println("Implicit boxing: " + d2);
        Double d3 = Double.valueOf(d1);
        System.out.println("Explicit boxing: " + d3);

        // Double -> double
        Double d4 = 20.75;
        double d5 = d4;
        System.out.println("Implicit unboxing: " + d5);
        double d6 = d4.doubleValue();
        System.out.println("Explicit unboxing: " + d6);

        // char -> Character
        char c1 = 'A';
        char c2 = c1;
        System.out.println("Implicit boxing: " + c2);
        Character c3 = Character.valueOf(c1);
        System.out.println("Explicit boxing: " + c3);

        // Character -> char
        Character c4 = 'B';
        char c5 = c4;
        System.out.println("Implicit unboxing: " + c5);
        char c6 = c4.charValue();
        System.out.println("Explicit unboxing: " + c6);

        // boolean -> Boolean
        boolean b1 = true;
        boolean b2 = b1;
        System.out.println("Implicit boxing: " + b2);
        Boolean b3 = Boolean.valueOf(b1);
        System.out.println("Explicit boxing: " + b3);

        // Boolean -> boolean
        Boolean b4 = false;
        boolean b5 = b4;
        System.out.println("Implicit unboxing: " + b5);
        boolean b6 = b4.booleanValue();
        System.out.println("Explicit unboxing: " + b6);

    }
}
