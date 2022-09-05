package com.pract;

import java.util.Arrays;
import java.util.Scanner;

public  class Store {
    // instance fields
//    String productType;
//
//    // constructor method
//    public class Store {
//  // instance fields
//  String productType;
//
//  // constructor method
//  public Store(String product) {
//    productType = product;
//  }
//

//    // main method
//    public static void main(String[] args) {
//        Store lemonadeStand=new Store("lemonade");
//        System.out.println(lemonadeStand.productType);
//
//    }
//
    // constructor method
//    String productType;
//    public Store(String product) {
//        productType=product;
//        System.out.println("I am inside the constructor method."+productType);
//    }
//
//    // main method
//    public static void main(String[] args) {
//        System.out.println("This code is inside the main method.");
//
//        Store lemonadeStand = new Store("Food");
//
//        System.out.println(lemonadeStand);
//    }


//    public static void main(String[] args) {
//      boolean  studentPrerequisite=true;
//        if(studentPrerequisite)
//        {
//            System.out.println("they can enroll in a course.");
//        }
//        else
//        {
//            System.out.println("They can’t take Physics II without finishing Physics I.");
//        }


    public static void main(String[] args) {
//        String course = "Theatre";
//
//        if (course.equals("Biology")) {
//
//            System.out.println("Enroll in Biology course");
//
//        } else if (course.equals("Algebra")) {
//
//            System.out.println(" Enroll in Algebra course");
//
//        } else if (course.equals("Theatre")) {
//
//            System.out.println("Enroll in Theatre course");
//
//        } else {
//
//            System.out.println("Course not found!");
//
//        }

//        int testScore = 72;
//
//        if (testScore >= 90) {
//
//            System.out.println("A");
//
//        } else if (testScore >= 80) {
//
//            System.out.println("B");
//
//        } else if (testScore >= 70) {
//
//            System.out.println("C");
//
//        } else if (testScore >= 60) {
//
//            System.out.println("D");
//
//        } else {
//
//            System.out.println("F");
//
//        }

//        String course = "History";
//
//        switch (course) {
//            case "Algebra":
//                System.out.println(" Enroll in Algebra");
//                break;
//            case "Biology":
//                System.out.println("Enroll in Biology");
//                break;
//            case "History":
//                System.out.println("Enroll in History");
//                break;
//            case "Theatre":
//                System.out.println("Enroll in Theatre");
//                break;
//            default:
//                System.out.println("Course not found");
//        }



//            int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
//            String betterPrintout = Arrays.toString(lotteryNumbers);
//            System.out.println(betterPrintout);
//       for(int i=1;i<=100;i++)
//       {
//           System.out.println(i);
//       }
//         int a=3;
//        int b=5;
//          for(int i=1;i<=100;i++)
//          {
//              if(a!=i && b!=i)
//              {
//                  System.out.println(i);
//              }
//             // System.out.println(i);
//               if(i==a)
//              {
//                  if(i==a && i==b)
//                  {
//                      System.out.println("FizzBuzz");
//                      a=a+3;
//                      b=b+5;
//
//                  }
//                  else {
//                  System.out.println("Fizz");
//                  a=a+3;}
//
//
//              }
//               if(i==b)
//              {
//                  if(i==a && i==b)
//                  {
//                      System.out.println("FizzBuzz");
//                      a=a+3;
//                      b=b+5;
//
//                  }
//                  System.out.println("Buzz");
//                  b=b+5;
//
//              }
//



// //         String str = new String[4];

// //         for(int i = 0;i<str.length();i++)
// //         {
// //             str[i] = scn.next();
// //         }


// //         //displaying Values of String Array

// //         for(int i = 0;i<str.length();i++)
// //         {
// //             System.out.println(str[i]);
// //         }



        Scanner scn = new Scanner(System.in);
          //Array Declaration with size of 10
        //int arr[] = new int[10];

          // Taking Input as Array

          int n = scn.nextInt();
          int arr[] = new int[n];

           for(int i = 0;i<arr.length;i++)
          {
              arr[i] = scn.nextInt();
           }

          // //now Using The Arrays package We Can use Arrays Built in Function Like Sort and All


          // //now Ill Sort The Array using Arrays package

           Arrays.sort(arr);
          // //printing the value of Sorted Array Index wise
           for(int i = 0;i<arr.length;i++) {
              System.out.println("Index :" + i + "value At Index :" + arr[i]);
          }


    }


    }




