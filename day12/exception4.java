// package day12;

// import java.util.*;

// class NotEligibleException extends Exception {
//     public NotEligibleException(String message) {
//         System.out.println(message);
//     }
// }

// public class exception4 {
//     public static void main(String[] args) {
//         System.out.println("Main start");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age:");
//         int age = sc.nextInt();
//         try {
//             checkEligibility(age);
//         } catch (NotEligibleException e) {
//             // Exception handled
//             e.printStackTrace();
//         }
//         System.out.println("Main end");
//         sc.close();
//     }

//     public static void checkEligibility(int age) throws NotEligibleException {
//         if (age < 18) {
//             System.out.println("Not eligible to vote");
//         } else {
//             throw new NotEligibleException("Eligible to vote");
//         }
//     }
// }


