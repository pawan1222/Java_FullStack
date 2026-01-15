package day7;
/*
WAJP to convert a double value 45.78 into int and print both values
WAJP to assign an int value 130 to a byte variable and print both values
WAJP to convert long->float->int-> short->byte and print all values
*/
public class typecasting {
    public static void main(String[] args) {
        double d = 45.78;
        int i = (int) d;
        System.out.println("Double value: " + d);
        System.out.println("Converted int value: " + i);

        int intValue = 130;
        byte byteValue = (byte) intValue;
        System.out.println("Int value: " + intValue);
        System.out.println("Converted byte value: " + byteValue);

        long longValue = 123456789L;
        float floatValue = (float) longValue;
        int intFromFloat = (int) floatValue;
        short shortValue = (short) intFromFloat;
        byte byteFromShort = (byte) shortValue;

        System.out.println("Long value: " + longValue);
        System.out.println("Converted float value: " + floatValue);
        System.out.println("Converted int from float value: " + intFromFloat);
        System.out.println("Converted short value: " + shortValue);
        System.out.println("Converted byte from short value: " + byteFromShort);
    }
}
