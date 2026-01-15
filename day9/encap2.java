package day9;


class person{
    private int emp_id;
    private String emp_name;
    private int emp_salary;

    public int getEmp_id(){
        return emp_id;
    }
    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;
    }

    public String getEmp_name(){
        return emp_name;
    }

    public void setEmp_name(String emp_name){
        this.emp_name = emp_name;
    }

    public String getEmp_salary(){
        String empsal=String.valueOf(emp_salary);
        return empsal;
    }
    public void setEmp_salary(int emp_salary){
        this.emp_salary = emp_salary;
    }
}


public class encap2 {
    public static void main(String[] args) {
        person emp=new person();
        emp.setEmp_id(101);
        emp.setEmp_name("pawan");   
        emp.setEmp_salary(45000);
        System.out.println("Employee ID: " + emp.getEmp_id());
        System.out.println("Employee Name: " + emp.getEmp_name());
        System.out.println("Employee Salary: " + emp.getEmp_salary());
    }
}
