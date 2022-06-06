package ucup.topekox;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Sama seperti List, Set pun memiliki tipe data Immutable
 * Cara pembuatan immutable Set di Java mirip dengan pembuatan immutable List
 */

/**
 *  Method                                  |   Keterangan
 *  -------------------------------------------------------------
 * Collections.emptySet()                   |   Membuat immutable set kosong
 * Collections.singleton(e)                 |   Membuat immutable set berisi 1 element
 * Collections.unmodifiableSet(set)         |   Mengubah mutable set menjadi immutable
 * Set.of(e...)                             |   Membuat immutable set dari element - element
 */

public class DemoImmutableSet {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Ucup");

        Set<String> mutable = new HashSet<>();
        mutable.add("Ucup");
        mutable.add("Azwar");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        for (String name : immutable) {
            System.out.println(name);
        }

        Set<String> set = Set.of("Ucup", "Topekox");

//        set.add("Aprizal"); error
//        set.remove("Ucup"); error

    }
}
