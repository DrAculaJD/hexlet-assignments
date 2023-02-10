package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage{
    private Map<String, String> base;

    public FileKV(Map<String, String> base) {
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
