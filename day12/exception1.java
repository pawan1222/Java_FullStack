package day12;
/*
Exception->
    The problem that accurs during runtime due to which the flow of program is disturbed
    program get terminated is called exception.

    hierarchy of Exception:
        1. Throwable
            1.1 Error
                Virtual Machine error 
                    .OutOfMemoryError
                    .StackOverflowError
            1.2 Exception
                1.2.1 Checked Exception(Compile time Exception)
                    .IOException
                    .SQLException
                    .FileNotFoundException
                    .ClassNotFoundException
                    .ClonteNotSupportedException
                    .InterruptedException
                1.2.2 Unchecked Exception(Runtime Exception)
                    .ArithmeticException
                    .NullPointerException
                    .ArrayIndexOutOfBoundException
                    .StringIndexOutOfBoundException
                    .NumberFormatException
                    .InputMismatchException
                    

        Q-> what will heppen if exception occurs?
         -> The flow of program get disturbed or program get terminated.
            Exception object will be created which contains 
                types of exception.
                error message with description.
                Line no and method name where exception occured.
                JVM search for the handler to handle that exception.
                IF handler is present then exception is handled and program continue its flow.
                IF handler is not present then program get terminated abnormally

        Types of Exception Handling:
            1. try-catch
            2. try with multiple catch
            3. try-finally
            4. try-catch-finally
             
            5. throw
            6. throws



        Try: What it does?
            It contains code thta might cause an error.
            and to prevent our program from crashing if something goes wrong.

        Catch: what id does?
            It catch the error that happens in the try block and handles it.
            Instead of crashing, your program can show a message or do something safe.

        Finally: What it does?
            It always runs-whether or not there was an error.
            To do cleanup work like closing files, releasing memory, etc.


        Throw: What it does?
            we use it to manually create an error(exception) when you detect a problem.
            we want to stop the program on purpose if something is wrong.

        Throws: what is does?
            It tells java that a method might cause an exception, and it should be handled when called.
            To warn whoever calls the method that it might throw an exception.
                
*/
import java.util.*;
public class exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        try {
            System.out.println("Enter falue for a :");
            int a=sc.nextInt();
            System.out.println("Enter value for b: ");
            int b=sc.nextInt();
            int ans=a/b;
            System.out.println("Answer is : "+ans);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Message: "+e.getMessage());
        }finally{
            System.out.println("Execution completed");
            sc.close();
        }
    }
}
