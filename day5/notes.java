package day5;

/*
Typecasting:
    The conversion of one datatype into another datatype 

    types of type casting:
        1: primitive typecasting
        2: non premetive typecasting

    1. primitive typecasting: The conversion of one premetive dataype into another primitive datatype

        Types: 
            1.Widening
                The conversion of smaller datatype into bigger datatype
                It is also known as implicit typecasting

                flow:
                    byte -> short -> int -> long -> float -> double
                    char -> int -> long -> float -> double
                eg. byte a = 10;
                    int b = a;
                


            2.Narrowing
                The conversion of bigger datatype into smaller datatype
                It is also known as explicite typecasting becauce to perform narrowing we need typecast operator.
                during narrowing data loss may occur

                eg. double a=10;
                    int b=(int)a;

        2. non premetive typecasting: The conversion of one non premetive datatype into another non premetive datatype
            Types:
                1. upcasting
                2. downcasting      

                    1. upcasting:
                        The conversion of child class object into parent class object is known as upcasting
                        it is performed automatically by compiler
                        
                        eg. Parent p = new Child();

                    2. downcasting:
                        The conversion of parent class object into child class object is known as downcasting
                        it is performed manually by programmer using typecast operator
                        
                        eg. Child c = (Child) new Parent();         


    












*/


public class notes {
    
}
