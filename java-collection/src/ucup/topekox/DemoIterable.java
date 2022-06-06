package ucup.topekox;

import java.util.Iterator;
import java.util.List;

/**
 * Tidak ada magic di Java, sebenarnya for-each di Iterable bisa terjadi karena ada method iterator() yang mengembalikan object Iterator
 * Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection secara sequential
 * For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan Iterator object
 */

/**
 * Iterable adalah parent untuk semua collection di Java, kecuali Map
 * Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
 * Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array
 */

/**
 * Selain Iterable interface, parent class semua collection di Java adalah Collection
 * Kalo Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
 * Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data collection
 * Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set dan Queue
 */

public class DemoIterable {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Ucup", "Topekox", "Forever");

        for (var name : names) {
            System.out.println(name);
        }

        // cara jadul sebelum java 5 (for each) ada
        System.out.println("ITERATOR========");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
