package ucup.topekox;

import java.util.Iterator;
import java.util.List;

public class DemoIterable {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Ucup", "Topekox", "Forever");

        for (var name : names) {
            System.out.println(name);
        }

        // cara jadul sebelum java 5 (for each) ada
        System.out.println("ITERATOR========");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
