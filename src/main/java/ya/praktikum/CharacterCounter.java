package ya.praktikum;

import java.util.List;

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
        return null;
    }

}
