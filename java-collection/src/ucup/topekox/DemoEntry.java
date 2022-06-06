package ucup.topekox;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Saat kita menyimpan data di Map, data disimpan dalam pair (key-value)
 * Di Java collection, implementasi Pair di Map bernama Entry
 * Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value
 */

public class DemoEntry {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("naruto", "Naruto");
        map.put("sasuke", "Sasuke");
        map.put("hinata", "Hinata");

        // mengambil semua data key : keySet()
        // mengambil semua data value : values()
        // untuk mengambil pair data key - values secara bersamaan gunakan Entry

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
