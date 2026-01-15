package day12;
/*
input: "Meet me at the clock tower"

1. first word vowels convert into %
2. second word consonants convert into #
3. Third word should be in a CAPITAL

Repeat this sequence from forth word onward

output: "M%%t #e AT th% ##o## TOWER"
*/

public class String1 {
    public static void main(String[] args) {

        String input = "Meet me at the clock tower";
        String[] words = input.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            int pos = (i % 3) + 1;

            if (pos == 1) {
                result = result + changeVowels(words[i]);
            } 
            else if (pos == 2) {
                result = result + changeConsonants(words[i]);
            } 
            else {
                result = result + words[i].toUpperCase();
            }

            result = result + " ";
        }

        System.out.println(result.trim());
    }

    static String changeVowels(String word) {
        String vowels = "aeiouAEIOU";
        String s = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (vowels.indexOf(c) != -1)
                s = s + '%';
            else
                s = s + c;
        }
        return s;
    }

    static String changeConsonants(String word) {
        String vowels = "aeiouAEIOU";
        String s = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c) && vowels.indexOf(c) == -1)
                s = s + '#';
            else
                s = s + c;
        }
        return s;
    }
}
