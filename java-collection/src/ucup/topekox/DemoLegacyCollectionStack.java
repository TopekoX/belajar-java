package ucup.topekox;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out).
 * Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque,
 * jadi tidak ada alasan lagi menggunakan class Stack.
 */

public class DemoLegacyCollectionStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Ucup");
        stack.push("Bracho");
        stack.push("Topekox");

        // mengambil data paling atas/data yang terakhir di masukan menggunakan pop()
        // pop akan throw java.util.EmptyStackException kalo datanya kosong makanya di try {} catch

        try {
            for (var value = stack.pop(); value != null; value = stack.pop()) {

                System.out.println(value);
            }
        } catch (EmptyStackException e) {
            System.out.println("Data Habis");
        }
    }
}
