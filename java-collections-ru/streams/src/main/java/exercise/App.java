package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static int getCountOfFreeEmails(List<String> emails) {

        return (int) emails.stream()
                .filter(email -> freeEmail(email))
                .count();
    }

    private static boolean freeEmail(String email) {

        boolean result = email.contains("@yandex.ru") || email.contains("@gmail.com") || email.contains("@hotmail.com");
        return result;
    }
}
// END
