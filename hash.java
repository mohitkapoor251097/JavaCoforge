import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(89);
        set.add(6);

        Iterator it=set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
