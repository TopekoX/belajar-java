package ucup.topekox;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque digunakan untuk memasukan data berdasarkan antrian dari depan dan pelakang
 * (siapa yang pertama masuk dia yang pertama keluar) FIFO (First In First Out) dan
 * (siapa yang pertama masuk akan ditaruh dibawah dan terakhir di atas) LIFO (Last In First Out)
 * Queue mempunyai 2 class konkrit yaitu ArrayDeque, LinkedList
 */
public class DemoDeque {

    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        // memasukan data dari atas ke bawah (tumpukan)
        stack.offerFirst("ucup");
        stack.offerFirst("azwar");
        stack.offerFirst("munir");


//        for (var value : stack) {
//            System.out.println(value);
//        }

//        stack.removeAll(stack);

        // kebalikan dari offerFirst
        stack.offerLast("ucup");
        stack.offerLast("azwar");
        stack.offerLast("munir");

//        for (var value : stack) {
//            System.out.println(value);
//        }

        // mengambil element dari bawah
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("abu");
        queue.offerLast("mukmin");
        queue.offerLast("husni");

        // mengambil element dari atas
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
