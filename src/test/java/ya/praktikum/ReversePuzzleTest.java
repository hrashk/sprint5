package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReversePuzzleTest {

    private final ReverseList reverser = new ReverseList();

    @Test public void emptyList() {
        List<Integer> in = new ArrayList<>();
        reverser.reverseInPlace(in);
        assert in.isEmpty();
    }

    @Test public void nullList() {}

    @Test public void singleElement() {
        List<Integer> in = new ArrayList<>();
        in.add(13);
        reverser.reverseInPlace(in);
        assertEquals(1, in.size());
        assertEquals(Integer.valueOf(13), in.get(0));
    }

    @Test public void twoElements() {
        List<Integer> in = new ArrayList<>();
        in.add(13);
        in.add(10);
        reverser.reverseInPlace(in);
        assertEquals(List.of(10, 13), in);
    }


    @Test public void threeElements() {
        List<Integer> in = Arrays.asList(13, 10, 7);

        reverser.reverseInPlace(in);

        assertEquals(List.of(7, 10, 13), in);
    }

    @Test public void quizArraysAsList() {}

    @Test()
    public void quizListOf() {
        List<Integer> in = List.of(13, 10, 7);

        reverser.reverseInPlace(in);

        assertEquals(List.of(7, 10, 13), in);
    }

    @Test
    public void immutableCollection() {
        List<Integer> in = new ArrayList<>();
        in.add(13);
        in.add(10);

        reverser.reverseInPlace(Collections.unmodifiableList(in));

        assertEquals(List.of(10, 13), in);
    }
}
