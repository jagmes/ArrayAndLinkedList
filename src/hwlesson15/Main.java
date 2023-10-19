package hwlesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Map<String, String>  namesOfEmployees  = new HashMap<>();

        for (int i = 0; i <10000 ; i++) {
            String uid =generateUid();

            namesOfEmployees.put(uid, "");
            System.out.println( namesOfEmployees.keySet());
        }

       //namesOfEmployees.put(generateUid(), "");
        System.out.println( namesOfEmployees.size());
    }

    public static String generateUid(){
        int startLimit = 97; // буква 'a'
        int endLimit = 122; // буква 'z'
        int tLenght=1; //количество генерируемых символов.
        Random random = new Random();
   while (true) {
       String generated = random.ints(startLimit, endLimit + 1).limit(tLenght).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
       if (generated.equals("26") )
       tLenght++;
        else {
           return generated;
       }

      }
    }

}
