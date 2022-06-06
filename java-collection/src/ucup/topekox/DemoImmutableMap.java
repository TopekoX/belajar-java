package ucup.topekox;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Method                                   |       Keterangan
 * ---------------------------------------------------------------------------------------
 * Collections.emptyMap()                   |       Membuat immutable map kosong
 * Collections.unmodifiableMap(map)         |       Mengubah mutable map menjadi immutable
 * Collections.singletonMap(key, value)     |       Membuat map dengan satu jumlah key-value
 * Map.of(...)                              |       Membuat immutable map dari key-value
 */

public class DemoImmutableMap {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Ucup");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Ijal");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Ucup",
                "midle", "Bracho",
                "last", "Topeko"
        );

        // error ketika di coba put
        // map.put("a", "A");
    }
}
