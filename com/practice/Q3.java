package com.practice;

public class Q3 {
    public  static  void test(String name,char c)
    {
      String  name1=name.replaceAll(Character.toString(c),"");
        System.out.println(name1);
    }
    public static void main(String[] args) {
        String name="Mooooohiooooot";
        test(name,'o');

    }
}
