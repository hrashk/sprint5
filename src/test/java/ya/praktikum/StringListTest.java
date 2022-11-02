package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StringListTest {

    private final List<String> list = oneTwoThreeList();

    @Test public void createListLikeArrayAndPrint() {
        System.out.println(list);
        assertEquals(4, list.size());
        assertEquals("two", list.get(1));
    }

    @Test public void replaceSecondItem() {
        list.set(1, "newbie");

        assertEquals(4, list.size());
        assertEquals("newbie", list.get(1));
    }

    @Test public void removeItemByIndex() {
        list.remove(1);

        assertEquals(3, list.size());
        assertEquals(List.of("one", "three", "four"), list);
    }

    @Test public void clearList() {
        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test public void listContains() {
        assertTrue(list.contains("three"));
        assertFalse(list.contains("fifty"));
    }

    @Test public void removeItemByValue() {
        list.remove("two");

        assertEquals(3, list.size());
        assertEquals(List.of("one", "three", "four"), list);
    }

    @Test public void quizRemoveDuplicateItemByValue() {
        list.add("two");

        list.removeIf("two"::equals);

        assertEquals(3, list.size());
        assertEquals(List.of("one", "three", "four"), list);
    }

    private static List<String> oneTwoThreeList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        return list;
    }
}
