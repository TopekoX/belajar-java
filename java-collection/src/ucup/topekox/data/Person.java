package ucup.topekox.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobbies(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
//        return hobbies;
        return Collections.unmodifiableList(hobbies); // for immutable list
    }

    public String getName() {
        return name;
    }
}
