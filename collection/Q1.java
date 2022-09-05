package collection;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class Q1  {
    public List<String> getArrayList(String name[]) {
        // depending on what, exactly, we want to return
       // return new ArrayList<>(Arrays.asList());
        List<String> newname=Arrays.asList(name);
        Collections.sort(newname);
        return newname;
    }
//  static void getArrayList(String name[])
//    {
//        System.out.println(name[0]);
//        List<String> newname=Arrays.asList(name);
////        for (String e : newname) {
////            System.out.println(e);
//        Collections.sort(newname);
//        System.out.println(newname);
////        }



    public static void main(String[] args) {
//        List<String> list1=new ArrayList<String>();
//        List<Object>list2= list1;
//        list2.add(new Integer(12));
//        System.out.println(list2.size());



//        Queue<String> x =new ArrayDeque<>();
//     x.add("ones");
//     x.add("two");
//     x.add("one");
//        System.out.println(x);
//        System.out.println(x.poll());
//        System.out.println(x);
//        System.out.println(x.poll());


//        List<String> list=new ArrayList<String>();
//        list.add("one");
//        list.add(2);
//        System.out.println(list.get(0).length());



//        Integer a=new Integer(4);
//        Integer b=new Integer(8);
//        Integer c=new Integer(4);
//       HashSet hs=new HashSet();
//       hs.add(a);
//       hs.add(b);
//       hs.add(c);
//        System.out.println(hs);

         Q1 q=new Q1();
        String[] name={"ram","sonu","amar","cherry"};
        System.out.println(q.getArrayList(name));
       // getArrayList(name);



    }
}
