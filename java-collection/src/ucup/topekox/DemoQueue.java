package ucup.topekox;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue digunakan untuk memasukan data berdasarkan antrian
 * (siapa yang pertama masuk dia yang pertama keluar) FIFO (First In First Out)
 * Queue mempunyai 3 class konkrit yaitu ArrayDeque, PriorityQueue, LinkedList
 */
public class DemoQueue {

    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>(10);
//
//        for (int i = 0; i < 10; i++) {
//            queue.add(String.valueOf(i));
//        }
//
//        for (String next = queue.poll(); next != null; next = queue.poll()) {
//            System.out.println(next);
//        }

//        Queue<String> queue = new ArrayDeque<>();
//          Queue<String> queue = new LinkedList<>();
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Ucup");
        queue.add("Azwar");
        queue.add("Munir");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }

}
