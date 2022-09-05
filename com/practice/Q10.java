package com.practice;

import java.util.Scanner;

public class Q10 {
    static void test(String name,char c)
    {
        String name1=name.replaceAll(Character.toString(c),"");
        System.out.println(name1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Enter Charchter");
        String c=sc.next();
        System.out.println(name.replace(c,""));
       // char c=sc.next().charAt(0);
     // test(name,c);


    }
}
