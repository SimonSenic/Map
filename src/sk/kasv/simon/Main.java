package sk.kasv.simon;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "A");
        map.put(2, "B");
        map.put(8, "C");
        map.put(12, "D");
        //map.put(12, "E");

        /*for(Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() +" " +entry.getValue() +" (" +entry +")"); */

        //map.forEach((key, value) -> System.out.println(key +" " +value));
        map.entrySet().stream().filter((temp) -> temp.getKey()>2).forEach((temp)-> System.out.println(temp.getKey() +" " +temp.getValue()));
    }
}
