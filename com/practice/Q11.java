package com.practice;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
//      String name="mohit";
//
//        for(int i=name.length()-1;i>=0;i--)
//        {
//            System.out.print(name.charAt(i));
//        }
//
        int[][] roll=new int[3][3];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter Element");
                roll[i][j]=sc.nextInt();

            }
        }
        System.out.println("printing Elements...");
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                System.out.print(roll[i][j]+"\t");
            }

        }

    }
}
