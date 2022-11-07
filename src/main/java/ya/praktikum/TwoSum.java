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
    public List<Integer> findPair(List<Integer> numbers, int sum) {
        if (numbers == null || numbers.size() < 2)
            return List.of();

        Set<Integer> seen = new HashSet<>();
        seen.add(numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {
            int currentValue = numbers.get(i);
            if (seen.contains(sum - currentValue)) {
                return List.of(sum - currentValue, currentValue);
            }
            seen.add(currentValue);
        }

        return List.of();
    }
}
