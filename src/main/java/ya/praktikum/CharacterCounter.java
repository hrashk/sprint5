package ya.praktikum;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * java -cp target/classes ya.praktikum.CharacterCounter Hello World
 * ======
 * H: 1
 * e: 1
 * l: 3
 * o: 2
 * W: 1
 * r: 1
 * d: 1
 * ======
 * homework: ignore case
 * homework: sort by count
 */
public class CharacterCounter {
    public static void main(String[] args) {
        var line = String.join("", args);

        List<String> freqs = new CharacterCounter().count(line);
        for (String freq : freqs) {
            System.out.println(freq);
        }
    }

    public List<String> count(String line) {
        if (line == null)
            return List.of();

        Map<Character, Integer> freqs = computeFrequencies(line);
        return convertToList(freqs);
    }

    private static Map<Character, Integer> computeFrequencies(String line) {
        var freqs = new LinkedHashMap<Character, Integer>();

        for (char c : line.toCharArray()) {
            freqs.compute(c, (cur, f) -> f == null ? 1 : f + 1);
        }
        return freqs;
    }

    private static List<String> convertToList(Map<Character, Integer> freqs) {
        var res = new ArrayList<String>();
        for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
            res.add(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
        return res;
    }


}
