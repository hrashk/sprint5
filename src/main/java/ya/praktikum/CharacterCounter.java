package ya.praktikum;

import java.util.Arrays;

public class CharacterCounter {
    /**
     * java -cp target/classes ya.praktikum.CharacterCounter Hello World
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
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println(String.join(" ", args));
    }
}
