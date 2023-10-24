package hwlesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Map<String, String>  namesOfEmployees  = new HashMap<>();

        for (int i = 0; i <1000 ; i++) {
          //  String uid =generateUid(10);
            if (namesOfEmployees.size()<1000){
            namesOfEmployees.put(generateUid(3), "");
            System.out.println( namesOfEmployees.keySet());}
        }

       //namesOfEmployees.put(generateUid(10), "");
        System.out.println( namesOfEmployees.size());
    }

    public static String generateUid(int tLenght){
     //   int startLimit = 97; // буква 'a'
     //   int endLimit = 122; // буква 'z'
        final char[] massive = "abcdefghijklmnopqrstuvwxzABCDEFGHIJKLMNOPQRSTUVWXZ0123456789".toCharArray();
        StringBuilder generated = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i <tLenght ; i++) {
            int rndIndex = random.nextInt(massive.length);
            generated.append(massive[rndIndex]);
        }
            return generated.toString();

        // String generated = " ";
 //  while (true) {
   //     String tmp = String.valueOf(random.nextInt());;
    //    generated = generated + tmp;
      // String generated = random.ints(startLimit, endLimit + 1).limit(tLenght).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        //   return generated;
       }

      }


