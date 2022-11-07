package ya.praktikum.map;

import org.junit.Test;
import ya.praktikum.CharacterCounter;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CounterPuzzleTest {
    @Test public void nullString() {
        CharacterCounter counter = new CharacterCounter();
        assertTrue(counter.count(null).isEmpty());
    }

    @Test public void emptyString() {
        CharacterCounter counter = new CharacterCounter();
        assertTrue(counter.count("").isEmpty());
    }

    @Test public void singleCharString() {
        CharacterCounter counter = new CharacterCounter();
        assertEquals(List.of("H: 1"), counter.count("H"));
    }

    @Test public void multiCharString() {
        CharacterCounter counter = new CharacterCounter();
        assertEquals(List.of("H: 1", "e: 1", "l: 2", "o: 1"), counter.count("Hello"));
    }
}
