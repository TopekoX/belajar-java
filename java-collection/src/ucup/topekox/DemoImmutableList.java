package ucup.topekox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah)
 * Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
 * Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
 * Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya.
 * Kalo misal kita membuat Immutable List berisikan data Person, field data Person tetap bisa diubah,
 * tapi isi elemen dari Immutable List tidak bisa diubah lagi
 * Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List
 */

/**
 *  Method                                  |       Keterangan
 *  ----------------------------------------------------------------------------
 * Collections.emptyList()                  |       Membuat immutable list kosong
 * Collections.singletonList(e)             |       Membuat immutable list berisi 1 element
 * Collections.unmodifiableList(list)       |       Mengubah mutable list menjadi immutable
 * List.of(e...)                            |       Membuat immutable list dari element - element
 */

public class DemoImmutableList {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> two = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Ucup");
        mutable.add("Aprizal");

        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> element = List.of("Naruto", "One Piece", "Attack On Titan");
    }
}
