package ya.praktikum.set;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class StringSetTest {

    @Test public void emptySet() {
        assert new HashSet<String>().isEmpty();

        assert Set.of().isEmpty();

        assert Collections.emptySet().isEmpty();
    }

    private static Set<String> sample() {
        var s = new HashSet<String>();
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("five");
        s.add("six");
        s.add("seven");

        return s;
    }

    private static Set<String> linkedSample() {
        return new LinkedHashSet<>(List.of("one", "two", "three", "four", "five", "six", "seven"));
    }

    private static Set<String> treeSample() {
        return new TreeSet<>(List.of("one", "two", "three", "four", "five", "six", "seven"));
    }

    @Test public void nonEmptySet() {
        var set = sample();
        System.out.println(set);
        assertEquals(7, set.size());

        System.out.println(linkedSample());

        System.out.println(treeSample());

        System.out.println(Set.of("one", "two", "three", "four", "five", "six", "seven"));
    }

    @Test public void containsItem() {
        assert sample().contains("three");
    }

    @Test public void interviewPrintUniqueValuesInList() {
        var list = List.of("one", "two", "two", "three");

        var set = new HashSet<>(list);
        System.out.println(set);

        assertEquals(Set.of("one", "two", "three"), set);
    }

    @Test public void remove() {
        var set = sample();

        set.remove("three");

        assertEquals(6, set.size());
    }

    @Test public void compareVertical() {
        Set<String> s = linkedSample();

        s.remove("throw");

        assertSetEquals(List.of("one", "two", "four", "five", "six", "seven"), s);
    }

    private static void assertSetEquals(Iterable<String> expected, Iterable<String> actual) {
        assertEquals(String.join("\n", expected), String.join("\n", actual));
    }
}
