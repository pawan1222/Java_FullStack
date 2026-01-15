package day5;

// WAJP to print characters from A to M and x to m


public class loop2 {
    public static void main(String[] args) {
        char c='A';
        while(c<='M'){
            System.out.println(c);
            c++;
        }

        char ch='x';
        while(ch>='m'){
            System.out.println(ch);
            ch--;
        }
    }
}
