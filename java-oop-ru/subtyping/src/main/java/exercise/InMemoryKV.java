package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage{
    private Map<String, String> base = new HashMap<>();

    public InMemoryKV(Map<String, String> base) {
        this.base = base;
    }

    public String get(String key, String defaultValue) {
        if (base.containsKey(key)) {
            return base.get(key);
        }
        return defaultValue;
    }

    public void set(String key, String value) {
        base.put(key, value);
    }

    public void unset(String key) {
        base.remove(key);
    }

    public Map<String,String> toMap() {
        return base;
    }
}
// END
