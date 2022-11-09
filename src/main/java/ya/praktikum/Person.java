package ya.praktikum;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person))
            return false;

        Person other = (Person) o;

        return age == other.age && Objects.equals(name, other.name);
    }

    /**
     * Основное правило: если p1.equals(ps), то обязательно p1.hashcode() == p2.hashcode()
     * Обратное утверждаение неверно в общем случае.
     * Интервью: если всегда return 0, то hash set/map вырождается в linked list
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("Person(%s, %d)", name, age);
    }

    @Override
    public int compareTo(Person o) {
        return Comparator.comparingInt((Person p) -> p.age)
                .thenComparing(p -> p.age)
                .compare(this, o);
    }
}
