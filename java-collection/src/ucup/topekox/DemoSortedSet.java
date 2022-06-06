package ucup.topekox;

import ucup.topekox.data.Person;
import ucup.topekox.data.PersonComparator;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet digunakan untuk mengurutkan data
 *
 * SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan kedalam SortedSet akan otomatis diurutkan
 * Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut
 * Jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahun si SortedSet bagaimana cara mengurutkan elemen-elemen nya
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
