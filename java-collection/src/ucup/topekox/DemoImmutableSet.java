package ucup.topekox;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DemoImmutableSet {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Ucup");

        Set<String> mutable = new HashSet<>();
        mutable.add("Ucup");
        mutable.add("Azwar");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        for (String name : immutable) {
            System.out.println(name);
        }

        Set<String> set = Set.of("Ucup", "Topekox");

//        set.add("Aprizal"); error
//        set.remove("Ucup"); error

    }
}
