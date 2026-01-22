package Regular_expression;
/*
Q2. Write a regular expression to validate an email ID with the following conditions:
	Username part can contain:
	letters (a–z, A–Z)
	digits (0–9)
	special characters: . _ % + -
	Must contain @
	Domain name should contain only letters
	Extension should contain at least 2 letters
*/
public class Question2 {
    public static void main(String[] args) {
        String regex="^[a-zA-Z0-9_%+-]+@[a-zA-Z]+.[a-zA-Z]{2,}$";
        System.out.println("Ps535353++@gmail.com".matches(regex));
    }
}
