package ya.praktikum;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Interview {
    public static void main2(String[] args) throws IOException {
        FileInputStream fis = null;
        byte[] data;
        try {
            data = fis.readAllBytes();
        } finally {
            System.out.println("At last!");
        }
    }


    static class Vehicle {}
    static class Car extends Vehicle {}
    static class RacingCar extends Car {}

    public static void main(String[] args) {
        List<Vehicle> lv = new ArrayList<>();
        lv.add(new Car());

        List<RacingCar> lrc = new ArrayList<>();
//        lrc.add(new Car());

        Collection<Vehicle> lv2 = new ArrayList<>();
        lv2.add(new RacingCar());
    }
}
