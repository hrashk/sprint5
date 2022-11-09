package ya.praktikum.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

public class ListsPerfTest {

    public static final int HUGE_SIZE = 200_000;
    private final Random random = ThreadLocalRandom.current();

    private void insertFirst(List<Integer> list) {
        list.add(0, random.nextInt());
    }

    @Test public void slowInsertFirst() {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < HUGE_SIZE; i++) {
            insertFirst(list);
        }
        assertEquals(HUGE_SIZE, list.size());
    }

    @Test public void fastInsertFirst() {
        var list = new LinkedList<Integer>();
        for (int i = 0; i < HUGE_SIZE; i++) {
            insertFirst(list);
        }
        assertEquals(HUGE_SIZE, list.size());
    }

    private List<Integer> hugeLinkedList() {
        var list = new LinkedList<Integer>();
        for (int i = 0; i < HUGE_SIZE; i++) {
            insertFirst(list);
        }
        return list;
    }

    @Test public void slowIterationByIndex() {
        var list = hugeLinkedList();
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        assert sum != 0;
    }

    @Test public void fastIterationByValue() {
        var list = hugeLinkedList();
        int sum = 0;

        for (Integer value : list) {
            sum += value;
        }

        assert sum != 0;
    }
}
