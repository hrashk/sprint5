package ya.praktikum;

/**
 * example of polymorphism: outlet & plug spec implemented by houses and devices

 * why do we need collections ? we have arrays already, don't we? what if we create a big array in advance?

 * why do we need a map?
 * LinkedHashSet, LinkedHashMap, ConcurrentHashMap
 * TreeMap, TreeSet -> need Comparable keys

 * aim to use Value objects as keys in maps & sets

 * p1.equals(p2) => pl.hashcode() == p2.hashcode()

 * hashcode use cases: checksum of big downloaded files (error detection),
 * torrent (find the nearest person with the same file chunk);
 * big  xml comparison ignoring the order of elements; equals is expensive, hashcode is not when doing contains checks

 * enums if time remains

 * Sum up: what are collection interfaces in Java and which collections do you know and use
 */
public class Agenda {
    public static void main(String[] args) {}
}
