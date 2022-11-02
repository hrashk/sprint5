package ya.praktikum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LinkedListTest {

    private final Random current = ThreadLocalRandom.current();

    @Test public void insertArrayList() {
        var list = new ArrayList<Integer>(10_000);
        for (int i = 0; i < 500_000; i++) {
            list.add(0, current.nextInt());
        }
    }

    @Test public void insertLinkedList() {
        var list = new LinkedList<Integer>();
        for (int i = 0; i < 500_000; i++) {
            list.add(0, current.nextInt());
        }
    }
}
