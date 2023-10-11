import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        arCount();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
        long startTime1 = System.currentTimeMillis();
        lListCount();
        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println(elapsedTime1);
    }
    // метод с ArrayList
    static void arCount(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <500000 ; i++) {
            list.add("Zina");
        }
        System.out.println(" " +list.size()+ " Зин..." );

    }

    // метод lLinkedList
    static void lListCount(){
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i <500000 ; i++) {
            list1.add("Anna");
        }
        System.out.println(" " +list1.size()+ " Aнн");
    }

}