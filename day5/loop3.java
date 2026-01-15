package day5;

/*
do while loop

initialization
do{
    statements
    updation
}
    while(condition);
*/

// WAJP to print numbers from range 
/* 

-111 to -101
123 to 113
5 to -5
-10 to 0
*/



public class loop3 {
    public static void main(String[] args){
        int a=-111;
        do{
            System.out.println(a);
            a++;
        }
        while(a<=-101);


        int b=113;
        do{
            System.out.println(b);
            b++;
        }
        while(b<=123);



        int c=5;
        do{
            System.out.println(c);
            c--;
        }
        while(c>=-5);


        int d=-10;
        do{
            System.out.println(d);
            d++;
        }
        while(d<=0);
    }

    

}
