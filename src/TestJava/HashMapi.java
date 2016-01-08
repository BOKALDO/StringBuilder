package TestJava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Boka on 2015.09.09..
 */
public class HashMapi {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("California", "Sacramento");
        map.put("Origon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String cap = map.get("Origon");
        System.out.println("The capital of Origon is " + cap);

    }
}
