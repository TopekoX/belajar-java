package ucup.topekox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Ucup");
        collection.add("Topekox");
        collection.addAll(List.of("Azwar", "Anas")); //menambah data lebih dari satu pakai addAll
        collection.addAll(List.of("Abdul", "Munir"));

        for (var value : collection) {
            System.out.println(value);
        }

        // menghapus data
        System.out.println(">>> REMOVE");
        collection.remove("Ucup");
        collection.removeAll(List.of("Azwar", "Anas"));

        for (var value : collection) {
            System.out.println(value);
        }

        // mengecek data
        System.out.println(">>> MENCARI DATA");
        System.out.println(
                collection.contains("Topekox")
        );

        System.out.println(
                collection.contains("Ucup")
        );

        System.out.println(
                collection.containsAll(List.of("Abdul", "Munir"))
        );

        // cek size
        System.out.println(">>> CEK SIZE");
        System.out.println(collection.size());
    }
}
