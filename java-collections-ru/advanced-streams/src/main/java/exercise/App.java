package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {

//    public static void main(String[] args) {
//        String str = "[foo:bar]\n" +
//                "environment=\"X_FORWARDED_var1=111\"\n" +
//                "\n" +
//                "[bar:baz]\n" +
//                "environment=\"key2=true,X_FORWARDED_var2=123\"\n" +
//                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
//                "\n" +
//                "[baz:foo]\n" +
//                "key3=\"value3\"\n" +
//                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
//                "\n" +
//                "[program:prepare]\n" +
//                "environment=\"key5=value5,X_FORWARDED_var3=value,key6=value6\"\n" +
//                "\n" +
//                "[program:start]\n" +
//                "environment=\"pwd=/temp,user=tirion\"\n" +
//                "\n" +
//                "[program:options]\n" +
//                "environment=\"X_FORWARDED_mail=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en\"\n" +
//                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make environment'\n" +
//                "\n" +
//                "[empty]\n" +
//                "command=\"X_FORWARDED_HOME=/ cd ~\"";
//
//                getForwardedVariables(str);
//    }
    public static String getForwardedVariables(String file) {

        List<String> fileLists = Arrays.asList(file.split("\n"));

        String result1 = fileLists.stream()
                .filter(str -> str.startsWith("environment"))
                .filter(str -> str.contains("X_FORWARDED"))
                .map(App::treatment)
                .peek(System.out::println)
                .toList().toString();

        List<String> fileLists2 = new ArrayList<>(List.of(result1.substring(1).split(",")));

        String result2 = fileLists2.stream()
                .filter(str -> str.contains("X_FORWARDED"))
                .map(str -> str.trim().substring(12))
                .peek(System.out::println)
                .toList().toString();

        result2 = result2.replace("[", "").replace("]", "").replace(" ", "");

        return result2;
    }

    public static String treatment(String str) {
        String result = str.substring(12).replace("\"","");

        return result;
    }
}
//END
