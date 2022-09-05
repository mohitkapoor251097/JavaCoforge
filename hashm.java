import java.util.HashMap;
import java.util.Map;

public class hashm {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("us",30);
map.remove("us");
        System.out.println(map);
        if(map.containsKey("us"))
        {
            System.out.println("yes");
        }
        System.out.println(map.get("us"));
        System.out.println(map.get("io"));
      for(Map.Entry<String,Integer> e: map.entrySet())
      {
          System.out.println(e.getKey());
          System.out.println(e.getValue());
      }
    }
}
