
package day5;

// Loops-> To excute same set of statements multiple times.
/* 
 


1->while loop
2->do while loop
3->for loop
*/

//WAJP to print numbers from range
// -123 to -129
// 79 to 84
// -110 to -100
// 0 to -9
// by using while loop

public class loop1 {
    public static void main(String[] args) {

        int k=-123;
        while(k>=-129){
            System.out.println(k);
            k--;
        }

        int n=79;
        while(n<=84){
            System.out.println(n);
            n++;
        }

        int m=-110;
        while(m<=-100){
            System.out.println(m);
            m++;
        }

        int p=0;
        while(p>=-9){
            System.out.println(p);
            p--;
        }
    }
}
