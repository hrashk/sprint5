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

    @Test public void createListAndPrint() {
        System.out.println(list);
        assertEquals(4, list.size());
    }

    @Test public void quizListContains() {
        assertTrue(list.contains(mary));
        assertTrue(list.contains(new Person("Mary", 23)));
    }

    @Test public void quizRemoveTwoPeople() {
        list.remove(mary);
        list.remove(new Person("Irina", 37));

        assertEquals(2, list.size());
        assertEquals(List.of(ivan, dima), list);
    }

    private List<Person> personList() {
        List<Person> list = new ArrayList<>();

        list.add(ivan);
        list.add(mary);
        list.add(irina);
        list.add(dima);

        return list;
    }
}
