package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static int getCountOfFreeEmails(List<String> emails) {

        return (int) emails.stream()
                .filter(mail -> mail.contains("@yandex.ru") || mail.contains("@gmail.com") || mail.contains("@hotmail.com"))
                .count();
    }
}
// END
