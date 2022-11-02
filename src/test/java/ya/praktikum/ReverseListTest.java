package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ReverseListTest {

    private final ReverseList reverser = new ReverseList();

    @Test public void emptyList() {
        List<Integer> list = new ArrayList<>();

        reverser.reverseInPlace(list);

        assertTrue(list.isEmpty());
    }

    @Test public void nullList() {
        reverser.reverseInPlace(null);
    }

    @Test public void singleElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);

        reverser.reverseInPlace(list);

        assertEquals(List.of(10), list);
    }

    @Test public void twoElements() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);

        reverser.reverseInPlace(list);

        assertEquals(List.of(7, 10), list);
    }

    @Test public void threeElements() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(33);

        reverser.reverseInPlace(list);

        assertEquals(List.of(33, 7, 10), list);
    }

    @Test public void quizArraysAsList() {
        List<Integer> list = Arrays.asList(10, 7, 33);

        reverser.reverseInPlace(list);

        assertEquals(List.of(33, 7, 10), list);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void quizListOf() {
        List<Integer> list = List.of(10, 7, 33);

        reverser.reverseInPlace(list);
    }

    @Test
    public void immutableCollection() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(33);

        List<Integer> newList = Collections.unmodifiableList(list);

        assertThrows(UnsupportedOperationException.class, () -> reverser.reverseInPlace(newList));
    }
}
