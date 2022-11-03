package ya.praktikum;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapTest {
    private final Person mary = new Person("Mary", 23);
    private final Person ivan = new Person("Ivan", 17);
    private final Person irina = new Person("Irina", 37);
    private final Person dima = new Person("Dima", 49);

    @Test public void createAndPrint() {
        var people = sample();

        System.out.println(people);
        assertEquals(4, people.size());
    }

    @Test public void getByKey() {
        var people = sample();
        Person byKey = people.get("mary");
        System.out.println(byKey);
        assertEquals(mary, byKey);
    }

    private Map<String, Person> sample() {
        Map<String, Person> map = new HashMap<>();
        map.put("mary", mary);
        map.put("ivan", ivan);
        map.put("irina", irina);
        map.put("dima", dima);
        return map;
    }

}
