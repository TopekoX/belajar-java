package ucup.topekox;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * NavigableMap adalah turunan dari SortedMap.
 * Namun NagivableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari,
 * lebih dari dan sejenisnya.
 * Misal, kita ingin mengambil data yang lebih dari key x atau kurang dari key y,
 * ini bisa dilakukan di NavigableMap.
 */

public class DemoNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("naruto", "Naruto");
        map.put("shikamaru", "Sikamaru");
        map.put("choji", "Choji");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerEntry("naruto")); // < key naruto
        System.out.println(map.higherEntry("naruto")); // > key naruto

        // Descending
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        /**
         * Immutable NavigableMap
         * ----------------------
         *  Method                                          |   Keterangan
         *  ---------------------------------------------------------------------------------------------
         * Collections.emptyNavigableMap()                  |   Membuat immutable navigable map kosong
         * Collections.unmodifiableNavigableMap(map)        |   Mengubah mutable navigable map menjadi immutable
         */

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

        // error
        immutable.put("sasuke", "Sasuke");

    }
}
