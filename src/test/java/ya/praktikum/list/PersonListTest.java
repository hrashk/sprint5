package ya.praktikum.list;

import org.junit.Test;
import ya.praktikum.Person;

import java.util.ArrayList;
import java.util.List;

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
    }

    @Test public void quizListContainsByRefAndValue() {
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
