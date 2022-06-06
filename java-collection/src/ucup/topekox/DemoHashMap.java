package ucup.topekox;

/**
 * Map adalah struktur data collection yang berisikan mapping antara key dan value
 * Dimana key di map itu harus unik, tidak boleh duplikat, dan satu key cuma boleh mapping ke satu key
 * Map sebenarnya mirip dengan Array, cuma bedanya kalo di Array, key adalah index (integer),
 * sedangkan di Map, key nya bebas kita tentukan sesuai keinginan kita
 */

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
 * Karena HashMap sangat bergantung dengan hashCode() function,
 * jadi pastikan kita harus membuat function hashCode seunik mungkin,
 * karena jika terlalu banyak nilai hashCode() yang sama,
 * maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
 * Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya
 */
public class DemoHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Ucup");
        map.put("name.midle", "Bracho");
        map.put("name.last", "Topekox");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.midle"));
        System.out.println(map.get("name.last"));
    }
}
