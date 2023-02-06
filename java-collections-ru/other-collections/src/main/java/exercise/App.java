package exercise;

import java.util.*;

// BEGIN
class App {

    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>();
        data1.put("two", "own");
        Map<String, Object> data2 = new HashMap<>();
        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("two", "deleted");

        System.out.println("RESULT = " + genDiff(data1, data2));
    }

    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new TreeMap<>();

        for (Map.Entry<String, Object> str1: data1.entrySet()) {
            if (data2.isEmpty()) {
                result.put(str1.getKey(), "deleted");
            }
            for (Map.Entry<String, Object> str2: data2.entrySet()) {
                if (str1.getKey().equals(str2.getKey())) {
                    if (str1.getValue().equals(str2.getValue())) {
                        result.put(str1.getKey(), "unchanged");
                    } else {
                        result.put(str1.getKey(), "changed");
                    }
                } else if (!data2.containsKey(str1.getKey())) {
                    result.put(str1.getKey(), "deleted");
                    if (data1.size() == 1) {
                        result.put(str2.getKey(), "added");
                    }
                } else if (!data1.containsKey(str2.getKey())) {
                    result.put(str2.getKey(), "added");
                }
            }
        }

        for (Map.Entry<String, Object> str2: data2.entrySet()) {
            if (data1.isEmpty()) {
                result.put(str2.getKey(), "added");
            }
        }

        return result;

    }
}
//END
