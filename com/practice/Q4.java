package com.practice;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
