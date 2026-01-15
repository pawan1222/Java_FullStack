package day6;

//method overloading concept

public class method6 {
    public static void main(String[] args) {
        System.out.println("area of square: "+calculatearea(5));
        System.out.println("area of circle: "+calculatearea(5.6));
        System.out.println("area of rectangle: "+calculatearea(5,7));
    }
    public static double calculatearea(int side){
        return side*side;
    }
    public static double calculatearea(double radius){
        return 3.14*radius*radius;
    }
    public static double calculatearea(int length,int breadth){
        return 2*length*breadth;
    }
}
