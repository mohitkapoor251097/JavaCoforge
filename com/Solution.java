package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            long n1=sc.nextLong();
            long n2=sc.nextLong();
            System.out.println(n1/n2);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}
