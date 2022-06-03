package ucup.topekox;

import ucup.topekox.data.Person;

import java.util.List;

public class DemoMutableList {
    public static void main(String[] args) {
        Person person = new Person("Ucup");

        person.addHobbies("Game");
        person.addHobbies("Hikking");
        person.addHobbies("Koding");

        doSomethingHobbies(person.getHobbies());

        System.out.println("Nama : " + person.getName());
        System.out.println("Hobi : " );

        for (var ucup : person.getHobbies()) {
            System.out.println("- " + ucup);
        }
    }

    public static void doSomethingHobbies(List<String> hobbies) {
        hobbies.add("Sport");
    }
}
