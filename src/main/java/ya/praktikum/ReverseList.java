package ya.praktikum;

import java.util.List;

public class ReverseList {

    public void reverseInPlace(List<Integer> list) {
        if (list == null) return;

        for (int i = 0; i < list.size() / 2; i++) {
            swap(list, i, list.size() - 1);
        }
    }

    private void swap(List<Integer> list, int idx1, int idx2) {
        int tmp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, tmp);
    }
}
