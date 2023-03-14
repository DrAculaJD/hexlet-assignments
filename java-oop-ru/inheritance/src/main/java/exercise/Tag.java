package exercise;

import java.util.Map;

// BEGIN
class Tag {
    private final String nameTag;
    private final Map<String, String> attributes;

    public Tag(String nameTag, Map<String, String> attributes) {
        this.nameTag = nameTag;
        this.attributes = attributes;
    }

    protected String getNameTag() {
        return nameTag;
    }

    protected Map<String, String> getAttributes() {
        return attributes;
    }

}
// END
