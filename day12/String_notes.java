package day12;
/*





*/
//  WAJP to count frequency of each word in a string.

public class String_notes {
    public static void main(String[] args) {
        String s = "java is a programming language it is a high level programming language";

        String[] words = s.split(" ");
        boolean[] visited = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(words[i] + " = " + count);
        }
    }
}
