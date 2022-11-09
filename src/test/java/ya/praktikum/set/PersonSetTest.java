package ya.praktikum.set;

import org.junit.Test;
import ya.praktikum.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static ya.praktikum.Fixture.*;

/**
 * What if hashcode always returns 42?
 */
public class PersonSetTest {

    private Set<Person> sample() {
        var list = new HashSet<Person>();

        list.add(ivan);
        list.add(mary);
        list.add(irina);
        list.add(dima);

        return list;
    }

    @Test public void nonEmptySet() {
        var set = sample();

        System.out.println(set);

        assertEquals(4, set.size());
    }

    @Test public void containsByRef() {
        assert sample().contains(irina);
    }

    @Test public void containsByValueWithAndWithoutHashcode() {
        assert sample().contains(new Person("Irina", 37));
    }

    @Test public void addDuplicateByRef() {
        var set = sample();

        set.add(irina);

        assertEquals(sample(), set);
    }

    @Test public void addDuplicateByValue() {
        var set = sample();

        set.add(new Person("Irina", 37));

        assertEquals(sample(), set);
    }

    @Test public void removeByRef() {
        var set = sample();

        set.remove(irina);

        assertEquals(3, set.size());
    }

    @Test public void removeByValue() {
        var set = sample();

        set.remove(new Person("Irina", 37));

        assertEquals(3, set.size());
    }

    private Set<Person> treeSample() {
        var list = new TreeSet<Person>(); // Person implements Comparable

        list.add(ivan);
        list.add(mary);
        list.add(irina);
        list.add(dima);

        return list;
    }

    @Test public void compareVertical() {
        var set = treeSample();

        set.remove(new Person("Irina", 37));

        assertIterableEquals(List.of(ivan, mary, irina, dima), set);
    }
}
