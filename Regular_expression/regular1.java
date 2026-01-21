package Regular_expression;
/*
Regular Expression:
    A regular expression is a smart rule that check whether text follows a specific pattern.
    Regex (Regular Expression) in java is a pattern used to match, search, validate, split, or replace text.
    Java provides regex support through the java.reges.package.

    Regular Expressions are used:
    1. To validate input data (like email addresses, phone numbers, etc.)
    2. To search for specific patterns in text
    3. To extract information from text
    4. To replace substrings in String based on patterns

    Main classes:
    1. Pattern: A compiled representation of a regular expression.
    2. Matcher: An engine that performs match operations on a character sequence by interpreting a Pattern.

    pattern define the rule, and the matcher applies the rule to the input text.

    Regex is a powerful way to define patterns for matching and validating strings in Java.
    Basic regex syntax start with matching exact text, understanding case sensitivity, and performing simple pattern checks.
    
    Regex symbols are used to define rules for matching text patterns.

    Some important patterns:
        . (dot): Matches any single character except newline.
        * (asterisk): Matches zero or more occurrences of the previous element.
        + (plus): Matches one or more occurrences of the previous element.
        ? (question mark): Matches zero or one occurrence of the previous element.
        \d: Matches any digit (0-9).
        \w: Matches any word character (alphanumeric + underscore).
        \s: Matches any whitespace character (spaces, tabs, line breaks).
        [a-z]: Matches any lowercase letter from a to z.
        [A-Z]: Matches any uppercase letter from A to Z.
        abc = Matches the exact sequence "abc".
        {n}: Matches exactly n occurrences of the previous element.
        {n,m}: Matches between n and m occurrences of the previous element.
        | (OR) = allows matching one pattern OR another, and grouping with ( ) is highly recommended.

*/
public class regular1 {
    public static void main(String[] args) {
        System.out.println("Regular Expression .(dot) example:");

        System.out.println("Suraj".matches("S...j"));
        System.out.println("Suraj".matches("S..j"));
        System.out.println("Sraj".matches("S...j"));
        System.out.println("suraj".matches("S...j"));
        System.out.println("Siraj".matches("S...j"));
        System.out.println("Sairaj".matches("S...j"));
        System.out.println("S123j".matches("S...j"));

        System.out.println("+ (plus) example:");
        System.out.println("Sabcj".matches("S+j"));
        System.out.println("Sxxj".matches("S+j"));
        System.out.println("Sj".matches("S+j"));
        System.out.println("SSj".matches("S+j"));
        System.out.println("sSj".matches("S+j"));
        System.out.println("SJJ".matches("S+j"));
        System.out.println("SSSj".matches("S+j"));

        System.out.println("* (asterisk) example:");
        System.out.println("Sabcj".matches("S*j"));
        System.out.println("Sxxj".matches("S*j"));
        System.out.println("Sj".matches("S*j"));
        System.out.println("SSj".matches("S*j"));
        System.out.println("sSj".matches("S*j"));
        System.out.println("SJJ".matches("S*j"));
        System.out.println("SSSj".matches("S*j"));

        System.out.println("? (question mark) example:");
        System.out.println("Sabcj".matches("S?j"));
        System.out.println("Sxxj".matches("S?j"));
        System.out.println("Sj".matches("S?j"));
        System.out.println("j".matches("S?j"));
        System.out.println("sSj".matches("S?j"));
        System.out.println("SJJ".matches("S?j"));
        System.out.println("SSSj".matches("S?j"));

        System.out.println("\\d (digit) example:");
        System.out.println("5".matches("\\d"));
        System.out.println("0".matches("\\d"));
        System.out.println("9".matches("\\d"));
        System.out.println("a".matches("\\d"));
        System.out.println("55".matches("\\d"));
        System.out.println(" ".matches("\\d"));

        System.out.println("\\w (word character) example:");
        System.out.println("a".matches("\\w"));
        System.out.println("Z".matches("\\w"));
        System.out.println("5".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println(" ".matches("\\w"));

        System.out.println("\\s (whitespace) example:");
        System.out.println(" ".matches("\\s"));
        System.out.println("\t".matches("\\s"));
        System.out.println("\n".matches("\\s"));
        System.out.println("a".matches("\\s"));
        System.out.println("1".matches("\\s"));

        System.out.println("[A-Z] (Uppercase letters) example:");
        System.out.println("A".matches("[A-Z]"));
        System.out.println("M".matches("[A-Z]"));
        System.out.println("Z".matches("[A-Z]"));
        System.out.println("a".matches("[A-Z]"));
        System.out.println("5".matches("[A-Z]"));
        System.out.println("_".matches("[A-Z]"));
        System.out.println(" ".matches("[A-Z]"));

        System.out.println("[a-z] (Lowercase letters) example:");
        System.out.println("a".matches("[a-z]"));
        System.out.println("m".matches("[a-z]"));
        System.out.println("z".matches("[a-z]"));
        System.out.println("A".matches("[a-z]"));
        System.out.println("5".matches("[a-z]"));
        System.out.println("_".matches("[a-z]"));
        System.out.println(" ".matches("[a-z]"));

        System.out.println("Exact sequence example:");
        System.out.println("abc".matches("abc"));
        System.out.println("abcd".matches("abc"));
        System.out.println("ab".matches("abc"));
        System.out.println("aBc".matches("abc"));

        System.out.println("{n} example:");
        System.out.println("aaa".matches("a{3}"));
        System.out.println("aa".matches("a{3}"));
        System.out.println("aaaa".matches("a{3}"));

        System.out.println("{n,m} example:");
        System.out.println("aa".matches("a{2,4}"));
        System.out.println("aaa".matches("a{2,4}"));
        System.out.println("aaaa".matches("a{2,4}"));
        System.out.println("a".matches("a{2,4}"));
        System.out.println("aaaaa".matches("a{2,4}"));

        System.out.println("| (OR) example:");
        System.out.println("cat".matches("cat|dog"));
        System.out.println("dog".matches("cat|dog"));
        System.out.println("bat".matches("cat|dog"));
        
    }
}
