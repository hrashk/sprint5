package ya.praktikum.set;

import org.junit.Test;
import ya.praktikum.TwoSum;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TwoSumPuzzleTest {

    @Test public void nullList() {
        var s = new TwoSum();
        assertTrue(s.findPair(null, 10).isEmpty());
    }
    
    @Test public void emptyList() {
        var s = new TwoSum();
        assertTrue(s.findPair(List.of(), 10).isEmpty());
    }
    
    @Test public void singleElementList() {
        var s = new TwoSum();
        assertTrue(s.findPair(List.of(3), 10).isEmpty());
    }

    /**
     * [3,3] @ 6
     * [3,2,4] @ 6
     * [2,7,11,15] @ 9
     * [1, 3, 6, 7, 9] @ 10
     */
    @Test public void twoElements() {
        var s = new TwoSum();
        assertEquals(List.of(3, 3), s.findPair(List.of(3, 3), 6));
    }

    @Test public void twoElementsGlitch() {
        var s = new TwoSum();
        assertEquals(List.of(2, 4), s.findPair(List.of(2, 3, 4), 6));
    }

    @Test public void threeElements() {
        var s = new TwoSum();
        assertEquals(List.of(2, 4), s.findPair(List.of(3, 2, 4), 6));
    }


    @Test public void hugeSample() {
        var s = new TwoSum();
        int size = 200_000;
        ArrayList<Integer> huge = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            huge.add(-1);
        }
        huge.set(0, 2);
        huge.set(size - 1, 4);
        assertEquals(List.of(2, 4), s.findPair(huge, 6));
    }



}
