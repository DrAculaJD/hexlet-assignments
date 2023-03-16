package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {

    public static List<String> validate(Address address) {
        List<String> notValidFields = new ArrayList<>();

        for (Field field: address.getClass().getDeclaredFields()) {

            if (notNullCheck(address, field)) {
                notValidFields.add(field.getName());
            }

        }

        return notValidFields;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> result = new HashMap<>();

        for (Field field: address.getClass().getDeclaredFields()) {

            if (notNullCheck(address, field)) {
                result.put(field.getName(), List.of("can not be null"));

            } else if (!notNullCheck(address, field) && minLengthCheck(address, field)) {
                int minLen = field.getAnnotation(MinLength.class).minLength();
                result.put(field.getName(), List.of("length less than " + minLen));
            }
        }

        return result;
    }

    public static boolean notNullCheck(Address address, Field field) {
        try {
            field.setAccessible(true);
            return field.isAnnotationPresent(NotNull.class) && field.get(address) == null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean minLengthCheck(Address address, Field field) {
        try {
            field.setAccessible(true);
            return field.isAnnotationPresent(MinLength.class) &&
                    field.get(address).toString().length() < field.getAnnotation(MinLength.class).minLength();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
}
// END
