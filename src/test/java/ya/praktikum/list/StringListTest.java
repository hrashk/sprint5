package ya.praktikum.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringListTest {

    private final List<String> list = oneTwoThreeList();

    @Test public void emptyList() {
        var list = new ArrayList<Integer>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test public void nonEmptyList() {
        var list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        assertFalse(list.isEmpty());
        assertEquals(4, list.size());
    }

    @Test public void printList() {
        System.out.println(list);
    }

    @Test public void listLiteral() {
        var list = List.of("one", "two");
        assertEquals(2, list.size());
    }

    @Test public void listFromStringArray() {
        var list = Arrays.asList("one", "two");
        assertEquals(2, list.size());

        String[] arr = {"one", "two"};
        assertEquals(2, Arrays.asList(arr).size());
    }

    @Test public void listFromPrimitiveArray() {
        var list = Arrays.asList(1, 2);
        assertEquals(2, list.size());

        Integer[] arr = {1, 2};
        assertEquals(2, Arrays.asList(arr).size());
    }

    @Test public void clearList() {
        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test public void getByIndex() {
        String value = list.get(1);
        assertEquals("two", value);
    }

    @Test public void iterateByIndex() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test public void iterateByValue() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test public void replaceSecondItem() {
        list.set(1, "newbie");

        assertEquals(4, list.size());
        assertEquals("newbie", list.get(1));
    }

    @Test public void compareLists() {
        list.set(1, "newbie");

        assertEquals(List.of("one", "newbie", "three", "four"), list);
    }

    @Test public void removeByIndex() {
        list.remove(1);

        assertEquals(Arrays.asList("one", "three", "four"), list);
    }

    @Test public void removeByValue() {
        list.remove("two");

        assertEquals(List.of("one", "three", "four"), list);
    }

    @Test public void listContains() {
        assertTrue(list.contains("three"));
        assertFalse(list.contains("fifty"));
    }

    @Test public void quizRemoveByValueWithDuplicates() {
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
