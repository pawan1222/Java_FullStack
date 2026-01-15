package day1;

class swaptwo{

public static void main(String args[]){
	int a=1;
	int b=2;

//swap two no with 3rd variable
	//int c=a;
	//a=b;
	//b=c;

// swap two no without using 3rd variable

	a=a^b;
	b=a^b;
	a=a^b;

	System.out.println(a);
	}
}
