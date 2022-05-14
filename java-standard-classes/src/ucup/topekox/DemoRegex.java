package ucup.topekox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        String name = "Ucup Topekox Tutorial Timposu";

        Pattern patternName = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = patternName.matcher(name);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String email = "ucup12@gmail.com";

        Pattern patternEmail = Pattern.compile("[a-zA-Z0-9]*[@][a-zA-Z]*[.][a-zA-Z]*");
        Matcher matcher1 = patternEmail.matcher(email);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

    }
}
