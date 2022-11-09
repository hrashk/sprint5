package ya.praktikum;

import static org.junit.Assert.assertEquals;

public class Fixture {
    public static final Person mary = new Person("Mary", 23);
    public static final Person ivan = new Person("Ivan", 17);
    public static final Person irina = new Person("Irina", 37);
    public static final Person dima = new Person("Dima", 49);

    public static void assertIterableEquals(Iterable<Person> expected, Iterable<Person> actual) {
        assertEquals(newLineJoin(expected), newLineJoin(actual));
    }

    public static String newLineJoin(Iterable<Person> list) {
        var sb = new StringBuilder();
        for (Person person : list) {
            sb.append(person);  // Person.toString
            sb.append("\n");
        }
        return sb.toString();
    }
}
