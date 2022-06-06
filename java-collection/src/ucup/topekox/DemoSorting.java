package ucup.topekox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting atau pengurutan adalah algoritma yang sudah biasa kita lakukan.
 * Di Java Collection juga sudah disediakan cara untuk melakukan pengurutan,
 * jadi kita tidak perlu melakukan pengurutan secara manual.
 * Namun perlu diingat, yang bisa di sort hanyalah List, karena Set, Queue, Deque dan Map
 * cara kerjanya sudah khusus, jadi pengurutan hanya bisa dilakukan di List.
 */

/**
 * Sorting di List
 * -------------------------------------------------------------
 * Method                                   |   Keterangan
 * ------------------------------------------------------------
 * Collections.sort(list)                   |   Mengurutkan list dengan comparable bawaan element
 * Collections.sort(list, comparator)       |   Mengurutkan list dengan comparator
 */

public class DemoSorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.addAll(List.of("Naruto", "Sasuke", "Sakura", "Hinata", "Orochimaru"));

        // sorting list
        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }

        // Pakai Comparator
        System.out.println("\nPakai Comparator:\n");

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, reverse);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
