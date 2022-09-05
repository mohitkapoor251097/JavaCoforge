package com.practice;

public class Stri {
    public static void main(String[] args) {
        String obj1=new String("Hello");
        String obj2=new String("Hello");
        System.out.println(obj1.hashCode());
        System.out.println(obj1.length());
       // System.out.println(obj2.hashCode());
        String ob3=obj1.concat("hello");
        System.out.println(obj1.length());
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(ob3.length());


        String s1=new String("object");
        String s2=new String("object");
                if(s1.equals(s2))
                {
                    System.out.println("content equal");
                }
                else
                {
                    System.out.println("not equal");
                }
        if(s1==s2)
        {
            System.out.println("equal s1 s2");
        }
        else
        {
            System.out.println("not equal s1 s2");
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

String s3="hello";
String s4="hello";
        System.out.println(s3==s4);




        StringBuffer shobj1=new StringBuffer("sample");

        System.out.println(shobj1.hashCode());
        System.out.println(shobj1);
        shobj1.append("object");
        shobj1.insert(6," ");
        System.out.println(shobj1);
        System.out.println(shobj1.hashCode());


       StringBuilder st=new StringBuilder("core");
       st.replace(2,4,"java");
        System.out.println(st);
        st.delete(2,4);
        System.out.println(st);
        st.reverse();
        System.out.println(st);

        StringBuilder st1=new StringBuilder("core");
        st1.ensureCapacity(340);
        System.out.println(st.capacity());

    }
}
