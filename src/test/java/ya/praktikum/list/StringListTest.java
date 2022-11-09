package ya.praktikum.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StringListTest {

    @Test public void emptyList() {
        assertTrue(new ArrayList<Integer>().isEmpty());

        assertTrue(List.of().isEmpty());

        assertTrue(Arrays.asList().isEmpty());

        assertTrue(Collections.emptyList().isEmpty());
    }

    private static List<String> sample() {
        List<String> list = new ArrayList<>(); // заменить на LinkedList и запустить все тесты
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        return list;
    }

    @Test public void nonEmptyList() {
        var list = sample();
        System.out.println(list);
        assertEquals(4, list.size());

        list = List.of("one", "two");
        System.out.println(list);
        assertEquals(2, list.size());

        list = Arrays.asList("one", "two");
        System.out.println(list);
        assertEquals(2, list.size());

        String[] arr = {"one", "two"};
        list = Arrays.asList(arr);
        System.out.println(list);
        assertEquals(2, list.size());
    }

    @Test public void listFromPrimitiveArray() {
        int[] arr = {1, 2};
        var list = Arrays.asList(arr);

        System.out.println(list);

        assertEquals(1, list.size()); // fatality
    }

    @Test public void clearList() {
        var list = sample();

        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test public void getByIndex() {
        assertEquals("two", sample().get(1));
    }

    @Test public void iterateByIndex() {
        var list = sample();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test public void iterateByValue() {
        for (String s : sample()) {
            System.out.println(s);
        }
    }

    @Test public void replaceSecondItem() {
        var list = sample();

        list.set(1, "newbie");

        assertEquals(4, list.size());
        assertEquals("newbie", list.get(1));
    }

    @Test public void compareLists() {
        var list = sample();

        list.set(1, "newbie");

        assertEquals(List.of("one", "newbie", "three", "four"), list);
    }

    @Test public void removeByIndex() {
        var list = sample();

        list.remove(1);

        assertEquals(Arrays.asList("one", "three", "four"), list);
    }

    @Test public void listContains() {
        assertTrue(sample().contains("three"));

        assertFalse(sample().contains("fifty"));
    }

    @Test public void removeByValue() {
        var list = sample();
        list.add("two");

        list.remove("two");

        assertEquals(List.of("one", "three", "four", "two"), list);
    }

    @Test public void removeAllByValue() {
        var list = sample();
        list.add("two");

        list.removeIf(s -> s.equals("two"));  // lambda

        assertEquals(List.of("one", "three", "four"), list);
    }

    @Test public void listSort() {
        var list = sample();

        list.sort(String::compareTo);  // Comparator

        assertEquals(List.of("four", "one", "three", "two"), list);
    }

    @Test public void collectionsSort() {
        var list = sample();

        Collections.sort(list); // String implements Comparable

        assertEquals(List.of("four", "one", "three", "two"), list);
    }
}
