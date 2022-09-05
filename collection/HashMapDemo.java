package collection;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {
//  public Set<String> getkeys(HashMap h)
//   {
//              return h.keySet();
//   }

    public static  Set<String> getCollection(String [] name)
    {
        //List<String> newname= Arrays.asList(name);
        // Iteration using enhanced for loop
        Set<String> set=Arrays.stream(name).collect(
                Collectors.toSet());
        Set<String> treeSet = new TreeSet<String>(set);
        return  treeSet;
    }
    public static void main(String[] args) {
//        HashMap<String,Integer> hs=new HashMap<>();
//        hs.put("Tv",78);
//        hs.put("remote",90);
//        hs.put("bike",89);
//        hs.put("Tv",90);
//        System.out.println(hs.keySet());
//        System.out.println(hs.entrySet());
//        System.out.println(hs.values());
//        Set<Map.Entry<String, Integer>> entries = hs.entrySet();
//
//        for(Map.Entry<String, Integer> entry : entries){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.printf("key: %s, value: %d %n", key, value);
//        }

//                HashMap<String,Integer> hs=new HashMap<>();
//        hs.put("Tv",78);
//        hs.put("remote",90);
//        hs.put("bike",89);
//        HashMapDemo h=new HashMapDemo();
//       // h.getkeys(hs);
//        System.out.println(h.getkeys(hs));



        String [] roll={"rohit","ram","rohit","vicky","vicky","ram","amar"};

        System.out.println( getCollection(roll));;

    }
}
