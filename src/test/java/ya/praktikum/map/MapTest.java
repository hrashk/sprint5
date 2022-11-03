package ya.praktikum.map;

import org.junit.Test;
import ya.praktikum.Person;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapTest {
    private final Person mary = new Person("Mary", 23);
    private final Person ivan = new Person("Ivan", 17);
    private final Person irina = new Person("Irina", 37);
    private final Person dima = new Person("Dima", 49);

    @Test public void emptyMap() {
        var map = new HashMap<String, Person>();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test public void nonEmptyMap() {
        var map = sample();
        assertEquals(4, map.size());
        assertFalse(map.isEmpty());
    }

    @Test public void printMap() {
        System.out.println(sample());
    }

    @Test public void mapLiteral() {
        var map = Map.of("Mary", mary, "Ivan", ivan);
        System.out.println(map);
        assertEquals(2, map.size());
    }

    @Test public void getByKey() {
        assertEquals(mary, sample().get("mary"));
    }

    @Test public void allEntries() {
        var entries = sample().entrySet();
        assertEquals(4, entries.size());
        for (Map.Entry<String, Person> entry : entries) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }

    @Test public void allKeys() {
        var keys = sample().keySet();
        assertEquals(4, keys.size());
        for (String key : keys) {
            System.out.println(key);
        }
    }

    @Test public void allPersons() {
        var values = sample().values();
        for (Person value : values) {
            System.out.println(value);
        }
        assertEquals(4, values.size());
    }

    @Test public void updateByKey() {
        var people = sample();
        people.put("mary", new Person("Maria", 77));
        assertEquals(new Person("Maria", 77), people.get("mary"));
    }

    @Test public void replaceExistingKey() {
        var people = sample();
        people.replace("mary", new Person("Maria", 77));
        assertEquals(new Person("Maria", 77), people.get("mary"));
    }

    @Test public void replaceMissingKey() {
        var people = sample();
        people.replace("peter", new Person("Peter", 77));
        assertNull(people.get("peter"));
    }

    @Test public void removeByKey() {
        Map<String, Person> people = sample();
        people.remove("ivan");
        assertEquals(3, people.size());
    }

    @Test public void compareMaps() {
        Map<String, Person> people = sample();
        people.remove("ivan");
        assertMapEquals(Map.of("mary", mary, "irina", irina, "dima", dima), people);
    }

    @Test public void orderedMap() {}

    @Test public void sortedMap() {}

    @Test public void mapWithCompositeKey() {
        Map<Person, String> map = new HashMap<>();
        map.put(mary, "mary");
        System.out.println(map);
    }

    @Test public void getByCompositeKey() {
        Map<Person, String> map = new HashMap<>();
        map.put(mary, "mary");
        assertEquals("mary", map.get(new Person("Mary", 23)));
    }

    @Test public void concurrentMapAsRefDataCache() {}

    private Map<String, Person> sample() {
        Map<String, Person> map = new HashMap<>();
        map.put("mary", mary);
        map.put("ivan", ivan);
        map.put("irina", irina);
        map.put("dima", dima);
        return map;
    }

    private void assertMapEquals(Map<String, Person> expected, Map<String, Person> actual) {
        assertEquals(newLineJoin(expected), newLineJoin(actual));
    }

    private String newLineJoin(Map<String, Person> map) {
        var sb = new StringBuilder();
        for (String key : map.keySet().stream().sorted().toArray(String[]::new)) {
            sb.append(String.format("%s => %s%n", key, map.get(key)));
        }
        return sb.toString();
    }
}
