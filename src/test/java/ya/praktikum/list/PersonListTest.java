package ya.praktikum.list;

import org.junit.Test;
import ya.praktikum.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static ya.praktikum.Fixture.*;

public class PersonListTest {

    private List<Person> sample() {
        List<Person> list = new ArrayList<>();

        list.add(ivan);
        list.add(mary);
        list.add(irina);
        list.add(dima);

        return list;
    }

    @Test public void nonEmptyList() {
        var s = Set.of(mary, ivan);

        for (Person person : s) {

        }

        var m = Map.of(mary, 23, ivan, 77);
        for (Person key : m.keySet()) {
            System.out.println("" + key + m.get(key));
        }

        for (Integer v : m.values()) {
            System.out.println(v);
        }

        for (Map.Entry<Person, Integer> entry : m.entrySet()) {
            System.out.println("" + entry.getKey() + entry.getValue());
        }
    }

    @Test public void quizListContainsByRefAndValue() {
        assert sample().contains(new Person("Mary", 23));

    }

    @Test public void removeTwoPeopleByRefAndValue() {
    }

    @Test public void collectionsSort() {
    }

    @Test public void compareHorizontal() {
    }

    @Test public void compareVertical() {
    }
}
