package collection;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class KeysetDEmo {
//    public static void main(String[] args) {
//        Map<String, Integer> priceMap = new HashMap<>();
//        priceMap.put("TV", 500);
//        priceMap.put("Phone", 200);
//        priceMap.put("Car", 20000);
//        priceMap.put("Bike", 6000);
//        priceMap.put("Furniture", 700);
//
//        Set<String> keys = priceMap.keySet();
//        for(String key: keys){
//            Integer value = priceMap.get(key);
//            System.out.printf("key: %s, value: %d %n", key, value);
//        }
//
//    }
//}

import java.util.*;
public class KeysetDEmo {
    public static void main(String[] args) {
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Mobile",7000);
        priceMap.put("Refridgerator",69000);
        priceMap.put("Computer",17000);
        priceMap.put("Mobile",7000);
       // Set<String> keys = priceMap.keySet();
     /*   for (String key : keys) {
            Integer value = priceMap.get(key);
            System.out.printf("key: %s, value: %d %n", key, value);*/
        Set<Map.Entry<String, Integer>> entries = priceMap.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.printf("key: %s, value: %d %n", k, v);
        }
        Collection<Integer> values = priceMap.values();
        Set<String> ks = priceMap.keySet();
        Collection<Integer> vs = priceMap.values();
        Set<Map.Entry<String, Integer>> es = priceMap.entrySet();
        System.out.println("keys of Map : " + ks);
        System.out.println("values from Map :" + vs);
        System.out.println("entries from Map :" + es);
    }
}
