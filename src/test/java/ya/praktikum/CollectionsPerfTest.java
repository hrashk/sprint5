package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

public class CollectionsPerfTest {

    private final Random current = ThreadLocalRandom.current();

    @Test public void insertArrayList() {
        var list = new ArrayList<Integer>(10_000);
        int hugeSize = 500_000;
        for (int i = 0; i < hugeSize; i++) {
            list.add(0, current.nextInt());
        }
        assertEquals(hugeSize, list.size());
    }

    @Test public void insertLinkedList() {
        var list = new LinkedList<Integer>();
        int hugeSize = 500_000;
        for (int i = 0; i < hugeSize; i++) {
            list.add(0, current.nextInt());
        }
        assertEquals(hugeSize, list.size());
    }

    @Test public void homeworkReverseHugeLinkedListVsArrayList() {
        var list = new LinkedList<Integer>();
        int hugeSize = 200_000;
        for (int i = 0; i < hugeSize; i++) {
            list.add(i);
        }
        new ReverseList().reverseInPlace(list);
        assertEquals(hugeSize, list.size());
    }
}
