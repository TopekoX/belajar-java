package ucup.topekox;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SortedMap adalah implementasi Map dengan data key diurutkan sesuai
 * dengan Comparable key atau bisa menggunakan Comparator.
 * SortedMap cocok untuk kasus yang posisi key pada Map harus berurut
 */

public class DemoSortedMap {
    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("eko", "Eko");
        sortedMap.put("naruto", "Naruto");
        sortedMap.put("itachi", "Itachi");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        // Membuat Comparator sendiri

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // descending
            }
        };

        sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("luffy", "Luffy");
        sortedMap.put("zoro", "Zoro");
        sortedMap.put("sanji", "Sanji");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        /**
         * SorterdMap Immutable :
         * --------------------------------------------------------------------------------
         *  Method                                  |   Keterangan
         *  -------------------------------------------------------------------------------
         * Collections.emptySortedMap()             |   Membuat immutable sorted map kosong
         * Collections.unmodifiableSortedMap(map)   |   Mengubah mutable sorted map menjadi immutable
         */

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        // error
        // immutable.put("aco", "Aco");
    }
}
