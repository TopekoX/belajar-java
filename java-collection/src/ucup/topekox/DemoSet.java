package ucup.topekox;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set = data yang ditampung tidak ada yang ganda/sama
 * HashSet vs LinkedHashSet
 * HashSet = menampung datanya secara acak berdasarkan Hash
 * LinkedHashSet = menampung datanya secara berurut menurut waktu pemasukan data (data baru ditambah di bawah)
 */

public class DemoSet {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Ucup");
        names.add("Aprizal");
        names.add("Tri");
        names.add("Uci");
        names.add("Andra");
        names.add("Catur");

        names.add("Ucup");
        names.add("Aprizal");
        names.add("Tri");
        names.add("Uci");
        names.add("Andra");
        names.add("Catur");


        for (String name : names) {
            System.out.println(name);
        }
    }
}
