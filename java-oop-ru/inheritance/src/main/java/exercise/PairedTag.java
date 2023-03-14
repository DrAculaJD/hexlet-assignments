package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
class PairedTag extends Tag {

    private final String body;
    private final List<Tag> children;

    public PairedTag(String nameTag, Map<String, String> attributes, String body, List<Tag> children) {
        super(nameTag, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        String result;
        final Tag single = new SingleTag(getNameTag(), getAttributes());

        result = single.toString() + body;

        for (Tag next: children) {
            result += next.toString();
        }

        result += "</" + getNameTag() + ">";

        return result;
    }

}
// END
