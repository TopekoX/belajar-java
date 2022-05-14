package ucup.topekox;

import java.util.StringJoiner;

public class DemoStringJoiner {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Ucup");
        joiner.add("Topekox");

        String name = joiner.toString();

        // result "[Ucup,Topekox]"
        System.out.println(name);
    }
}
