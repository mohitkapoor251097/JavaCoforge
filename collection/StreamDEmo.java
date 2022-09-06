package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDEmo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(20);
        list.add(67);
//        Stream<Integer> stream=list.stream();
//      List<Integer> newlist=stream.filter(i -> i%2==0).collect(Collectors.toList());
//        System.out.println(newlist);

//       List<Integer>newlist= list.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newlist);

//       List<Integer>list1= list.stream().filter(i->i>10).collect(Collectors.toList());
//        System.out.println(list1);


            Stream<Objects> emptyStream=Stream.empty();
            emptyStream.forEach(a->{
            System.out.println(a);
        });
    }
}
