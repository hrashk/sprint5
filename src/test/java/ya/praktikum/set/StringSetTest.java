package ya.praktikum.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class StringSetTest {

    @Test public void emptySet() {
    }

    @Test public void nonEmptySet() {}

    @Test public void printSet() {}

    @Test public void setLiteral() {}

    @Test public void containsItem() {}

    @Test public void remove() {
        var set = sample();
        set.remove("three");
        assertEquals(6, set.size());
    }

    @Test public void compareSets() {
        Set<String> s = sample(LinkedHashSet::new);
        s.remove("three");
        assertSetEquals(List.of("one", "two", "four", "five", "six", "seven"), s);
    }

    private static Set<String> sample() {
        return sample(HashSet::new);
    }

    private static Set<String> sample(Supplier<Set<String>> builder) {
        var s = builder.get();
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("five");
        s.add("six");
        s.add("seven");
        return s;
    }

    private static void assertSetEquals(Iterable<String> expected, Iterable<String> actual) {
        assertEquals(String.join("\n", expected), String.join("\n", actual));
    }

    @Test public void orderedSet() {}

    @Test public void sortedSet() {}

    @Test public void printUniqueValuesInList() {}
}
