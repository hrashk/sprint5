package ya.praktikum.list;

import org.junit.Test;
import ya.praktikum.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonListTest {

    private final Person mary = new Person("Mary", 23);
    private final Person ivan = new Person("Ivan", 17);
    private final Person irina = new Person("Irina", 37);
    private final Person dima = new Person("Dima", 49);

    private List<Person> sample() {
        List<Person> list = new ArrayList<>();

        list.add(ivan);
        list.add(mary);
        list.add(irina);
        list.add(dima);

        return list;
    }

    @Test public void nonEmptyList() {
        var list = sample();

        System.out.println(list); // Person.toString

        assertEquals(4, list.size());
    }

    @Test public void quizListContainsByRefAndValue() {
        var list = sample();

        assertTrue(list.contains(mary));

        assertTrue(list.contains(new Person("Mary", 23))); // Person.equals
    }

    @Test public void removeTwoPeopleByRefAndValue() {
        var list = sample();

        list.remove(mary);
        list.remove(new Person("Irina", 37)); // Person.equals

        assertEquals(2, list.size());
        assertEquals(List.of(ivan, dima), list);
    }

    @Test public void collectionsSort() {
        var list = sample();

        Collections.sort(list);
        System.out.println(list);

        assertEquals(List.of(ivan, mary, irina, dima), list);
    }

    @Test public void compareHorizontal() {
        var list = sample();

        list.remove(ivan);

        assertEquals(List.of(mary, ivan, irina, dima), list); // сложно анализировать при большом списке
    }

    @Test public void compareVertical() {
        var list = sample();

        list.remove(ivan);

        assertListEquals(List.of(mary, ivan, irina, dima), list);
    }

    private void assertListEquals(List<Person> list1, List<Person> list2) {
        assertEquals(newLineJoin(list1), newLineJoin(list2));
    }

    private String newLineJoin(List<Person> list) {
        var sb = new StringBuilder();
        for (Person person : list) {
            sb.append(person);  // Person.toString
            sb.append("\n");
        }
        return sb.toString();
    }
}
