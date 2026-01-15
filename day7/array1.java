package day7;
/*
Array->
    it is a collection of similar data types
    it is a data structure that stores fixed size sequential collection of elements of same type
    to access elements of array we use index
    index starts from 0 to n-1 (n is size of array)

    find size of array
        array_name.length
    to access elements of array
        array_name[index]

    when arrayoutofbound exception occurs?
        when we try to access index which is less than 0 or greater than equal to size of array
        

How to create an array in Java
1.using array literal
    Sysntax:
    data_type[] array_name={value1,value2,value3,...};
    eg. int[] arr={10,20,30,40,50}; 
    when we know the values at the time of array creation we can use this method

2. using new keyword
    Sysntax:
    data_type[] array_name=new data_type[size];
    eg. int[] arr=new int[5];
    when we dont know the values at the time of array creation we can use this method

How to take input from user and store it in array
    we can use scanner class to take input from user and store it in array

    eg.
        import java.util.Scanner;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

*/

// WAJP to print even elements from the given array
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter the element in the array");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
            }
        }
        sc.close();
    }
}
