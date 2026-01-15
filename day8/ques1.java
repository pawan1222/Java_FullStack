package day8;

public class ques1 {
    public static void main(String[] args) {
        double income = 45000;
        double expenses = 30000;

        // Normal month savings
        double normalSavings = predict(income, expenses);
        System.out.println("Normal month savings = " + normalSavings);

        // Festive month savings
        double festiveSavings = predict(income, expenses, true);
        System.out.println("Festive month savings = " + festiveSavings);
    }

    // Method 1: Normal month
    public static double predict(double income, double expenses) {
        return income - expenses;
    }

    // Method 2: Overloaded for festive month
    public static double predict(double income, double expenses, boolean festiveMonth) {
        if (festiveMonth) {
            expenses = expenses + (0.20 * expenses); // 20% increase
            System.out.println("Festive expenses = " + (int)expenses);
        }
        return income - expenses;
    }
}
