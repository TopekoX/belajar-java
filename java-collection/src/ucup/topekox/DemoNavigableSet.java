package ucup.topekox;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * NavigableSet digunakan untuk menavigasi Set, seperti mencari element, besar dari, kurang dari, dll
 * misalnya memotong Set dari element ke berapa, atau ke element berapa.
 */
public class DemoNavigableSet {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ucup", "Azwar", "Munir", "Rizal", "Hengki"));

        for (var name : names) System.out.println(name);
        System.out.println("----");

        NavigableSet<String> reserve = names.descendingSet();
        NavigableSet<String> munir = names.headSet("Munir", true);
        NavigableSet<String> hengki = names.tailSet("Hengki", true);
        for (var name : reserve) System.out.println(name);

        System.out.println("----");

        for (var name : munir) System.out.println(name);

        System.out.println("----");

        for (var name : hengki) System.out.println(name);

        // immutable
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Joko"); // error immutable

    }
}
