package ya.praktikum.set;

import org.junit.Test;
import ya.praktikum.Person;

import java.util.TreeSet;

/**
 * What if hashcode always returns 42?
 */
public class PersonSetTest {

    @Test public void nonEmptySet() {}

    @Test public void printSet() {}

    @Test public void containsByRef() {}

    @Test public void containsByValueWithAndWithoutHashcode() {}

    @Test public void addDuplicateByRef() {}

    @Test public void addDuplicateByValue() {}

    @Test public void removeByRef() {}

    @Test public void removeByValue() {}

    @Test public void compareSets() {}

    @Test public void sortedSet() {
        var ts = new TreeSet<Person>();
        ts.add(new Person("vasya", 32));
        System.out.println(ts);
    }
}
