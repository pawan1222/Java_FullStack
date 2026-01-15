package day2;
//19 DECEMBER
//WAP to check given no is divisible by 7 or not


import java.util.Scanner;

/*class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	int n=sc.nextInt();

	if(n%7==0){
		System.out.println("yes it is divisible by 7");
	}else{
		System.out.println("not divisible by 7");
	}
}

}
*/



//WAP to check given no is divisible by both 3 and 5 or not

/*class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	int n=sc.nextInt();

	if(n%3==0 && n%5==0){
		System.out.println("yes it is divisible");
	}else{
		System.out.println("not divisible");
	}
}

}
*/

//WAP to check given char is vovel or consonent

/*
class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	char c=sc.next().charAt(0);

	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
		System.out.println("yes it is vovel");
	}else{
		System.out.println("it is consonent");
	}
}
}
*/

/*
//WAP to check given char is digit or not

class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	char c=sc.next().charAt(0);

	if(c>='0' && c<='9'){
		System.out.println("yes it is digit");
	}else{
		System.out.println("it is digit");
	}
}
}

*/

//WAJP to check weather the given character is uppercase , lowercase , digit or special character


/*

class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	char c=sc.next().charAt(0);

	if(Character.isUpperCase(c)){
		System.out.println("yes it is uppercase");
	}else if(Character.isLowerCase(c)){
		System.out.println("it is lowercase");
	}else if(c>='0' && c<='9'){
		System.out.println("it is digit");
	}else{
		System.out.println("it is special character");
	}
}
}

*/

/*
class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	int marks=sc.nextInt();

	if(marks>=90){
		System.out.println("Grade A");
	}else if(marks>=75 && marks < 90){
		System.out.println("Grade B");
	}else if(marks >= 60 && marks < 75){
		System.out.println("Grade C");
	}else if(marks >= 40 && marks<60){
		System.out.println("Grade D");
	}else if(marks < 40){
		System.out.println("Fail");
	}else{
		System.out.println("Invalid marks");
	}
}
}

*/

/*

// WAJP to check the given character to check upper and lower vovel uppercase consonent lowercase consonent

class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	char c=sc.next().charAt(0);

	if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
		System.out.println("yes it is uppercase vovel");
	}else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
		System.out.println("it is lowercase vovel");
	}else if(c!='A' || c!='E' || c!='I' || c!='O' || c!='U'){
		System.out.println("it uppercase consonent");
	}else{
		System.out.println("it lowercase consonent");
	}
}
}
*/

/*
//WAJP to check given no is negative no positive no or zero


class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	int n=sc.nextInt();

	if(n<0){
		System.out.println("negative no");
	}else if(n>=1){
		System.out.println("positive no");
	}else{
		System.out.println("zero");
	}
}
}
*/




/*
//WAP to find max no of the three no

class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	if(a>b && a>c){
		System.out.println("a is greater");
	}else if(b>a && b>c){
		System.out.println("b is greater");
	}else{
		System.out.println("c is greater");
	}
}
}

*/

//WAP to find min no of the three no

class contitional{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("take input: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	if(a<b && a<c){
		System.out.println("a is smaller");
	}else if(b<a && b<c){
		System.out.println("b is smaller");
	}else{
		System.out.println("c is smaller");
	}
	sc.close();
}
}



