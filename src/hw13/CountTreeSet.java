package hw13;

import java.util.TreeSet;

public class CountTreeSet implements Comparable<CountTreeSet> {
    int id;
    String name;

    public CountTreeSet(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static long CountHashElemments(TreeSet<Object> tlist){
        long result = 0;
        long startTime = System.currentTimeMillis();
        Object object = new Object();
        for (int i = 0; i < 500000; i++) {
            tlist.add("Masha");
        }
        result = System.currentTimeMillis() - startTime;
        return result;
    }

    public static long removeTreeSetElem(TreeSet<Object> tlist){
        long result = 0;
        long startTime = System.currentTimeMillis();
        Object object = new Object();
        for (int i = 50000; i > 0; i--) {
            tlist.remove("Masha");
        }
        result = System.currentTimeMillis() - startTime;
        return result;

    }

    @Override
    public String toString() {
        return "CountTreeSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override //Может быть только int?
    public int compareTo(CountTreeSet o) {
        return this.id-o.id;
    }

}
