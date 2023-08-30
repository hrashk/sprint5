package ya.praktikum;

import java.util.Collections;
import java.util.List;

public class ReverseList {

    /**
     * [1, 2, 3, 4] => [4, 3, 2, 1]
     */
    public void reverseInPlace(List<Integer> list) {
        for (int idx = 0; idx < list.size() / 2; idx++) {
            Collections.swap(list, idx, list.size() - idx -1);
        }
    }
}
