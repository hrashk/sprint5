package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonListTest {

    private final Person mary = new Person("Mary", 23);
    private final Person ivan = new Person("Ivan", 17);
    private final Person irina = new Person("Irina", 37);
    private final Person dima = new Person("Dima", 49);
    private final List<Person> list = personList();

    @Test public void nonEmptyList() {
        System.out.println(list);
        assertEquals(4, list.size());
    }

    @Test public void printList() {
        System.out.println(list);
    }

    @Test public void quizListContainsByRefAndValue() {
        assertTrue(list.contains(mary));
        assertTrue(list.contains(new Person("Mary", 23)));
    }

    @Test public void removeTwoPeopleByRefAndValue() {
        list.remove(mary);
        list.remove(new Person("Irina", 37));

        assertEquals(2, list.size());
    }

    @Test public void compareLists() {
        list.remove(mary);

        assertListEquals(List.of(ivan, irina, dima), list);
    }

    private List<Person> personList() {
        List<Person> list = new ArrayList<>();

        list.add(ivan);
        list.add(mary);
        list.add(irina);
        list.add(dima);

        return list;
    }

    private void assertListEquals(List<Person> list1, List<Person> list2) {
        assertEquals(newLineJoin(list1), newLineJoin(list2));
    }

    private String newLineJoin(List<Person> list) {
        var sb = new StringBuilder();
        for (Person person : list) {
            sb.append(person);
            sb.append("\n");
        }
        return sb.toString();
    }
}
