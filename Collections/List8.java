package Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class List8 {
    public static void main(String[] args) {
        String[] s = {"mridul","Girish","Pawan","Balaji","Murali"};

        List<String>al=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();

        for(String n:s){
            al.add(n);
        }

        if(al.contains(name)){
            int index=al.indexOf(name);
            System.out.println("Yes pawan is present in the list at index: "+index);
            al.remove(name);
        }else{
            System.out.println("pawan is not present in the list");
        }

        System.out.println(al);
    }
}
