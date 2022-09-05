package collection;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;

import java.util.concurrent.*;
import java.util.regex.*;


import java.util.*;
//public class hDemo {
//    public static void main(String[] args) throws IOException {
//       Scanner sc=new Scanner(System.in);
//       int N=sc.nextInt();
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(N +" x "+i+" = "+(N*i) );
//        }
//
//    }
//}
//class hDEmo{
//        public static void main(String[] args) {
//            Scanner obj = new Scanner(System.in);
//            int q = obj.nextInt();
//            for(int x=0;x<q;x++){
//                int a = obj.nextInt();
//                int b = obj.nextInt();
//                int n = obj.nextInt();
//                int sum = a;
//                for(int i=0;i<n;i++){
//                    sum += Math.pow(2,i)*b;
//                    System.out.print(sum+" ");
//                }
//                System.out.println();
//            }
//
//        }
//    }

import java.util.Scanner;

public class hDemo {



//    Scanner scan = new Scanner(System.in);
//    int i = scan.nextInt();
//        double d=scan.nextDouble();
//       scan.nextLine();
//        String s= scan.nextLine();
//        // scan.next();
//
//
//    // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//        scan.close();


        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("================================");
//            for(int i=0;i<3;i++){
//                String s1=sc.next();
//                int x=sc.nextInt();
//                System.out.print(s1);
//                for(int j=s1.length();j<15;j++){
//                    System.out.print(" ");
//                }
//
//                System.out.format("%03d" ,x);
//                System.out.println();
//                //Complete this line
//            }
//            System.out.println("================================");

            Scanner sc=new Scanner(System.in);
           String A=sc.next();
            StringBuilder sb=new StringBuilder(A);
            sb.reverse();
            System.out.println(sb);
            String rev=sb.toString();
            System.out.println(sb);
            if(A.equals(rev)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
}


