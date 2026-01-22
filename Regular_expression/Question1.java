package Regular_expression;
/*
Q1. Write a regular expression to validate a mobile number with the following rules:
	Must start with 6, 7, 8, or 9
	Must contain exactly 10 digits
*/
public class Question1 {
    public static void main(String[] args) {
        String regex="^[6-9]\\d{9}$";
        System.out.println("9876543210".matches(regex)); // true
        System.out.println("1234567890".matches(regex)); // false
    }
}
