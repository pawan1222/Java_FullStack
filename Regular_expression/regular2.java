package Regular_expression;
/*
WAJP to make regrex to match these pattern and output should be true;
1.pawanpawanpawan

2.
  ppppaawannn
  pwan
  pn
  aaawwwann

3.
  Suraj
  SURAJ
  suraj
  SuRaJ
  Suurajj
  Suraj@123
  S#u@j@123
  123suraj
  12345
*/
public class regular2 {
    public static void main(String[] args) {
        System.out.println("Question 1: ");
        System.out.println("pawanpawanpawan".matches("(pawan)*"));

        System.out.println("Question 2: ");
        System.out.println("ppppaawannn".matches("p*a*w*a*n*"));
        System.out.println("pwan".matches("p*a*w*a*n*"));
        System.out.println("pn".matches("p*a*w*a*n*"));
        System.out.println("aaawwwann".matches("p*a*w*a*n*"));

        System.out.println("Question 3: ");
        String regex=".*";  //matches any character (.) zero or more times (*)
        System.out.println("Suraj".matches(regex));
        System.out.println("SURAJ".matches(regex));
        System.out.println("suraj".matches( regex));
        System.out.println("SuRaJ".matches(regex));
        System.out.println("Suurajj".matches(regex));
        System.out.println("Suraj@123".matches(regex));
        System.out.println("S#u@j@123".matches(regex));
        System.out.println("123suraj".matches(regex));
        System.out.println("12345".matches(regex));


    }
}
