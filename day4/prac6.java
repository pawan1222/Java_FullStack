package day4;
// WAP to display an employees designation based on the department and role selected by user using nested switch case.

// IT 
//   Develeper
//   Tester
//   DevOps Engineer
// HR
//   Recruiter
//   HR Manager
//   Payroll Officer
// Finance
//   Accountant
//   Financial Analyst
//   Auditor
// operations
//   operation Executive
//   Team Lead
//   Manager

import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("department ");
        String department=sc.next();
        String role="";
        switch(department){
            case "IT":
                System.out.println("role ");
                role=sc.next();
                switch (role) {
                    case "Develeper":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "Tester":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "DevOps Engineer":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    default:
                        System.out.println("unverified role");
                }
                break;
            case "HR":
                System.out.println("role ");
                role=sc.next();
                switch (role) {
                    case "Recruiter":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "HR Manager":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "Payroll Officer":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                }
                break;
            case "Finance":
                System.out.println("role ");
                role=sc.next();
                switch (role) {
                    case "Accountant":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "Financial Analyst":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "Auditor":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                }
                break;
            case "operations":
                System.out.println("role ");
                role=sc.next();
                switch (role) {
                    case "operation Executive":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "Team Lead":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                    case "Manager":
                        System.out.println("this employee is "+role+" of "+department+" department");
                        break;
                }
                break;
                
        }
        sc.close();
    }
}
