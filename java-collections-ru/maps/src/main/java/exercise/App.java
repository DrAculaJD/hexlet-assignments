package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
class App {

    public static void main(String[] args) {
//        String sentence = "the java is the best programming language java";
//        Map wordsCount = App.getWordCount(sentence);
//        String result = App.toString(wordsCount);
//        System.out.println(result);
    }

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        HashMap<String, Integer> mapWords = new HashMap<>();

        if (sentence.isEmpty()) {
            return mapWords;
        }

        for (String word: words) {

            if (mapWords.containsKey(word)) {
                mapWords.put(word, mapWords.get(word) + 1);
            } else {
                mapWords.put(word, 1);
            }
        }

        return mapWords;
    }

    public static String toString(Map<String, Integer> mapWords) {
        String result = "{";

        if (mapWords.isEmpty()) {
            return "{}";
        }

        for (Map.Entry<String, Integer> word: mapWords.entrySet()) {
            result = result + "\n  " + word.getKey() + ": " + word.getValue();
        }

        result = result + "\n}";

        return result;
    }

}
//END
