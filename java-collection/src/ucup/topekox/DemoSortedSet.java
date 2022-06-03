package ucup.topekox;

import ucup.topekox.data.Person;
import ucup.topekox.data.PersonComparator;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet digunakan untuk mengurutkan data
 */
public class DemoSortedSet {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("Ucup"));
        people.add(new Person("Budi"));
        people.add(new Person("Angga"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // Demo immutable set
        Set<Person> set = Collections.unmodifiableSet(people);
//        set.add(new Person("Aprizal")); error
    }
}
