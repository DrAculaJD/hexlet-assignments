package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {

    public SingleTag(String nameTag, Map<String, String> attributes) {
        super(nameTag, attributes);
    }

    public String toString() {
        String result = "<" + getNameTag() + " ";

        for (Map.Entry<String, String> attr: getAttributes().entrySet()) {
            result += attr.getKey() + "=\"" + attr.getValue() + "\" ";
        }

        result = result.substring(0, result.length() - 1) + ">";

        return result;
    }
}
// END
