package ucup.topekox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
