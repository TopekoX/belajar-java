package ucup.topekox;

import java.util.StringTokenizer;

public class DemoStringTokenizer {
    public static void main(String[] args) {
        String value = "Ucup Topekox";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
            // output:
            // > Ucup
            // > Topekox
        }
    }
}
