package ucup.topekox;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * IdentityHashMap adalah implementasi Map sama seperti HashMap
 * Yang membedakan adalah cara pengecekan kesamaan datanya,
 * tidak menggunakan function equals, melainkan menggunakan operator == (reference equality)
 * Artinya data dianggap sama, jika memang lokasi di memory tersebut sama
 */
public class DemoIdentityHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Ucup");
        map.put(key2, "Ucup");

        System.out.println(map.size());
    }
}
