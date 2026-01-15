package day5;

/*
WAJP to check the given character
uppercase vowel
uppercase consonent
lowercase vowel
lowercase consonent


*/
import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char: ");
        char c=sc.next().charAt(0);

        if(c>='A' && c<='Z' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            int n=10;
            do{
                System.out.println(n);
                n++;
            }
            while(n<=25);
        }
        else if(c>='a' && c<='z' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            int n=-10;
            while(n>=-20){
                System.out.println(n);
                n--;
            }
        }
        else if(c>='A' && c<='Z' || c!='A' || c!='E' || c!='I' || c!='O' || c!='U'){
            for(int i=25;i>=10;i--){
                System.out.print(i);
            }
        }
        else if(c>='a' && c<='z' || c!='a' || c!='e' || c!='i' || c!='o' || c!='u'){
            for(int i=-25;i<=-15;i++){
                System.out.print(i);
            }
        }
        sc.close();
    }
}
