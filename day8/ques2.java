package day8;

public class ques2 {
    public static void main(String[] args) {
        double onlyprincipal = loan(200000); // 8% simple interest
        System.out.println("Loan with only principal: " + String.format("%.2f", onlyprincipal));

        double principalandyears = loan(200000, 5); // 10% compound
        System.out.println("Loan with principal and years: " + String.format("%.2f", principalandyears));
    }

    // Simple interest 8%
    public static double loan(double principal){
        return principal + (principal * 0.08);
    }

    // Compound interest 10%
    public static double loan(double principal, int years){
        double rate = 0.10;
        return principal * Math.pow(1 + rate, years);
    }
}
