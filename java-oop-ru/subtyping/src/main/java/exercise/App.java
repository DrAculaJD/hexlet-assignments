package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage base) {
        KeyValueStorage result = base;

        for (Map.Entry<String, String> str : base.toMap().entrySet()) {
            String key = str.getKey();
            String value = str.getValue();
            System.out.println(key + " " + value);
            result.set(value, key);
            result.unset(key);
        }
        return result;
    }
}
// END
