package day4;
import java.util.Scanner;

public class prac8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("EmployeeID: ");
        int empID=sc.nextInt();
        System.out.println("employee Name: ");
        String empName=sc.next();
        System.out.println("age: ");
        int age=sc.nextInt();
        System.out.println("department choice: 1.IT 2.HR 3.Finance");
        int deptChoice=sc.nextInt();
        System.out.println("Basic Salary: ");
        double Bsalary=sc.nextDouble();
        double finalSalary=0.0;
        String access="";

        if(age<21){
            System.out.println("Employee is not eligible to work");
        }
        else{
            switch (deptChoice) {
                case 1:
                    System.out.println("IT Department");
                    String roleIT=sc.next();
                    switch (roleIT) {
                        case "Developer":
                            System.out.println("Role: "+roleIT);
                            finalSalary=Bsalary+(Bsalary*30/100);
                            System.out.println("Final Salary: "+finalSalary);
                            break;
                        case "Tester":
                            System.out.println("Role: "+roleIT);
                            finalSalary=Bsalary+(Bsalary*25/100);
                            System.out.println("Final Salary: "+finalSalary);
                            break;
                        default:
                            System.out.println("Unverified role");
                    }
                    break;
                case 2:
                    System.out.println("HR Department");    
                    String roleHR=sc.next();
                    switch (roleHR) {
                        case "Recruiter":
                            System.out.println("Role: "+roleHR);
                                finalSalary=(Bsalary*30/100)+Bsalary;
                            System.out.println("Final Salary: "+finalSalary);
                            break;
                        case "payroll":
                            System.out.println("Role: "+roleHR);
                            finalSalary=Bsalary+(Bsalary*22/100);
                            System.out.println("Final Salary: "+finalSalary);
                            break;
                        default:
                            System.out.println("Unverified role");
                    }
                    break;
                case 3:
                    System.out.println("Finance Department");
                    String roleFin=sc.next();
                    switch (roleFin) {
                        case "Accountant":
                            System.out.println("Role: "+roleFin);
                            finalSalary=(Bsalary*28/100)+Bsalary;
                            System.out.println("Final Salary: "+finalSalary);
                            break;
                        case "Auditor":
                            System.out.println("Role: "+roleFin);
                            finalSalary=Bsalary+(Bsalary*26/100);
                            System.out.println("Final Salary: "+finalSalary);
                            break;
                        default:
                            System.out.println("Unverified role");
                    }
                    break;
                default:
                    break;
            }
        }
         if(finalSalary>=60000 && deptChoice==1){
            access="admin";
        }else if(finalSalary>=60000 && deptChoice!=1){
            access="manager";
        }else{
            access="employee";
        }

        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("department: "+deptChoice);
        System.out.println("Final Salary: "+finalSalary);
        System.out.println("Access Level: "+access);
        sc.close();
    }
}
