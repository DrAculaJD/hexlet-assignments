package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
class App {

    public static void main(String[] str) {
        KeyValueStorage storage = new InMemoryKV(Map.of("foo", "bar", "bar", "zoo"));
        swapKeyValue(storage);
    }

    public static void swapKeyValue(KeyValueStorage base) {
        for (Map.Entry<String, String> str: base.toMap().entrySet()) {
            String key = str.getKey();
            String value = str.getValue();
            System.out.println(key + " " + value);
            base.set(value, key);
            //base.unset(key);
        }

//        base.toMap().entrySet().stream()
//                        .map(str -> str.getValue())
//                                .collect(Collectors.toList());

        //base.toMap().entrySet().forEach(System.out::println);
    }

}
// END
