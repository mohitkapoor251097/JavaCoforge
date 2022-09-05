package threaddemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@FunctionalInterface
interface calci

{
     int add(int x,int y);

    String display(String name,String name1);
}
public class lambda {
    public static void myfunction()
    {
        List<String> list=new ArrayList<>();
        list.add("Delhi");
        list.add("Delhi 1");
        list.forEach(
                (n)->System.out.println(n)
            );

        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
           // break;
        }
    }
    public static void main(String[] args) {
//        calci c=(x,y)->x+y;
//        System.out.println(c.add(5,9));


    //    calci c=(x,z)-> x+z;
    //  System.out.println(c.display("hello","mohit"));

        calci x=new calci() {
            @Override
            public String display(String name, String name1) {
                return name+name1;
            }
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        System.out.println(x.display("Hello ","Mohit kapoorhjhgt"));
        System.out.println(x.add(4,8));


   myfunction();







    }

}
