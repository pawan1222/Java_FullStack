package day5;

// WAJP to print characters from the range
// s to l
// T to Z
// by using do while loop

public class loop4 {
    public static void main(String[] args) {
        char a='l';
        do{
            System.out.println(a);
            a++;
        }
        while(a<='s');


        char b='T';
        do{
            System.out.println(b);
            b++;
        }
        while(b<='Z');

    }
}
