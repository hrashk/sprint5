package ya.praktikum;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("Person(%s, %d)", name, age);
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparingInt((Person p) -> p.age)
                .thenComparing(p -> p.age)
                .compare(this, (Person) o);
    }
}
