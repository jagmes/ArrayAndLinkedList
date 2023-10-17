package hw13;

import java.util.HashSet;
import java.util.Set;

public class CountHashSet {

    String name;

    Set<String> set = new HashSet<>();

    public CountHashSet(String name) {
        this.name = name;
    }
    public static long CountHSElement(HashSet<Object> hlist) {

        long result;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            hlist.add("Anya");
        }
        result = System.currentTimeMillis()- startTime;
        return result;
    }
    public static long removeHSElement(HashSet<Object> hlist){
        long result;
        long startTime = System.currentTimeMillis();
        for (int i = 50000; i >0; i--) {
            hlist.remove("Anya");
        }
        result = System.currentTimeMillis()- startTime;
        return result;


    }
}
