package ucup.topekox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List adalah struktur data collection yang memiliki sifat sebagai berikut
 * Elemen  di list bisa duplikat, artinya bisa memasukkan data yang sama
 * Data list berurut sesuai dengan posisi kita memasukkan data
 * List memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list
 * Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan kebutuhan kita
 */

/**
 * ArrayList adalah implementasi dari List menggunakan array
 * Default kapasitas array di ArrayList adalah 10
 * Namun ketika kita memasukkan data dan array sudah penuh,
 * maka secara otomatis ArrayList akan membuat array baru dengan
 * kapasitas baru dengan ukuran kapasitas lama + data baru
 */

/**
 * LinkedList adalah implementasi List dengan struktur data Double Linked List
 * Data yang dimasukan akan berurut
 */

/**
 * List = Data yang ditampung diindex seperti array
 * ArrayList vs LinkedList
 * ArrayList = menampung datanya berdasarkan array
 * LinkedList = menampung datanya berdasarkan node
 * Operation        |       ArrayList                        |              LinkedList
 * --------------------------------------------------------------------------------------
 * add              | Cepat kalau indexnya belum penuh        | cepat
 * set              | cepat karena berdasar index             | lambat
 * get              | cepat                                   | lambat
 * remove           | lambat harus menggeser index            | cepat
 */

public class DemoList {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
//      List<String> listA = new LinkedList<>();

        // menambah data
        listA.add("Ucup");
        listA.add("Azwar");
        listA.add("Aprizal");

        iterasi(listA);

        // ubah data
        listA.set(1, "Munir");

        iterasi(listA);

        // get data
        System.out.println(listA.get(2));

        // remove
        System.out.println("======");

        listA.remove(2);

        iterasi(listA);

        // remove dari interface collection
        listA.remove("Ucup");

        iterasi(listA);
    }

    public static void iterasi(List<String> lists) {
        for (var list : lists) {
            System.out.println(list);
        }
        System.out.println("============");
    }
}
