package exercise;

import java.util.*;

// BEGIN
class App {

    public static void main (String[] args) {
        System.out.println(scrabble("thlxertwq", "hexlet"));
    }
    public static boolean scrabble(String chars, String word) {
        char[] arrayChars = chars.toLowerCase().toCharArray();
        char[] wordChars = word.toLowerCase().toCharArray();

        Deque<Character> listChars = new LinkedList<>();
        for (char ch: wordChars) {
            listChars.addFirst(ch);
        }

        int result = 0;
        int wordLen = word.length();

        for (char sym: arrayChars) {
            if (listChars.contains(sym)) {
                result++;
                listChars.remove(sym);
                System.out.println(result);
            }
        }

        return result >= wordLen;
    }
}
//END
