package com.practice;
import java.util.*;
public class LinkedlistDemo {
    public static void main(String[] args) {
       LinkedList li=new LinkedList();
       li.add("io");
       li.add(6);
       li.add(7);
       li.add(2,"ram");
       li.addFirst("mo");
       li.addLast("it");
       li.remove(2);
       li.removeLast();
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        StringBuilder b=new StringBuilder("hello");
        System.out.println(b.capacity());
        b.ensureCapacity(35);
      //  b.append("new");
        System.out.println(b.capacity());
        StringBuilder b1=new StringBuilder("corke");
       // b1.append("hello");
     b1.ensureCapacity(9);
        System.out.println(b1.capacity());

    }



}
