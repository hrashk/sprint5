package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringListTest {

    @Test public void createListLikeArrayAndPrint() {
        List<String> list = oneTwoThreeList();

        assertEquals(4, list.size());
        assertEquals("two", list.get(1));
    }

    @Test public void replaceSecondItem() {
        List<String> list = oneTwoThreeList();
        list.set(1, "newbie");

        assertEquals(4, list.size());
        assertEquals("newbie", list.get(1));
    }

    @Test public void removeItemByIndex() {
        List<String> list = oneTwoThreeList();
        list.remove(1);

        assertEquals(3, list.size());
        assertEquals(List.of("one", "three", "four"), list);
    }

    @Test public void clearList() {
        List<String> list = oneTwoThreeList();
        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test public void removeItemByValue() {
        List<String> list = oneTwoThreeList();
        list.remove("two");

        assertEquals(3, list.size());
        assertEquals(List.of("one", "three", "four"), list);
    }

    @Test public void quizRemoveDuplicateItemByValue() {
        List<String> list = oneTwoThreeList();
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
