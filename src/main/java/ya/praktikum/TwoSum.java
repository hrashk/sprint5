package ya.praktikum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * find a, b in [1, 3, 6, 7, 9] so that a + b = 10
 * ===
 * 3, 7
 * ===
 * homework: find indexes, i.e. [1, 3]
 */
public class TwoSum {
    public List<Integer> findPair(List<Integer> numbers, int sum) {  // N * N => N
        Set<Integer> set = new HashSet<>();
        set.add(numbers.get(0));

        for (int current = 1; current < numbers.size(); current++) {  // N

            int target = sum - numbers.get(current);
            if (set.contains(target))   // N => const time
                return List.of(target, numbers.get(current));

            set.add(numbers.get(current));
        }
        return null;
    }
}
