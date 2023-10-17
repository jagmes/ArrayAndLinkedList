package hw13;

import java.util.*;

import static hw13.CountHashSet.CountHSElement;
import static hw13.CountHashSet.removeHSElement;
import static hw13.CountTreeSet.*;

public class Main  {
    public static void main(String[] args) {
        List<Object> arrList = new ArrayList<>();
        List<Object> linlList = new LinkedList<>();
        TreeSet<Object> tList = new TreeSet<>();
        HashSet<Object> hlist= new HashSet<>();
        tList.add("Masha");
        System.out.println("ArrayList");
        System.out.println(countElemments(arrList));
        System.out.println("Скорость удаления ArraList: ");
        System.out.println(removeElements(arrList));
        System.out.println("LinkedList");
        System.out.println(countElemments(linlList));
        System.out.println("Удаление из linkedList:");
        System.out.println(removeElements(linlList));
        System.out.println("TreeSet List");
        System.out.println(CountHashElemments(tList));
        System.out.println("Удаление из TreeSet: ");
        System.out.println(removeTreeSetElem(tList));
        System.out.println("HashSet List");
        System.out.println(CountHSElement(hlist));
        System.out.println("Удаление из HashSet: ");
        System.out.println(removeHSElement(hlist));
    }

    public static long countElemments(List list) {
        long result;
        long sTartTime = System.currentTimeMillis();
        Object object = new Object();
        for (int i = 0; i < 500000; i++) {
            list.add(object);
        }
        result = System.currentTimeMillis() - sTartTime;
        return result;
    }
    public static long removeElements(List list){
        long res;
        long startTime = System.currentTimeMillis();
        Object object = new Object();
        for (int i = 50; i >0 ; i--) {
            list.remove(object);
        }
        res = System.currentTimeMillis()- startTime;
        return res;
    }

}