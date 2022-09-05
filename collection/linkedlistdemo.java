package collection;

import java.util.LinkedList;

class Node
{
    int data;
   static Node nextref;
    Node(int d)
    {
        data=d;
    }
    public static  void addData()
    {
        //Node datacoll=new Node()
    }
//    public  static  toString()
//    {
//      //  return "node refer is"+nextref;
//    }
}
public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList<Node> mylist=new LinkedList<>();
        mylist.add(new Node(12));
        mylist.add(new Node(1));
        mylist.add(new Node(192));
        mylist.add(new Node(102));
        mylist.add(new Node(1232));
        System.out.println(mylist.get(0).hashCode());
        System.out.println(mylist.get(1).hashCode());
        System.out.println(mylist.get(2).hashCode());
//        Node new1=new Node(12);
//        System.out.println(new1.hashCode());


    }
}
