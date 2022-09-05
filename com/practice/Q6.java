package com.practice;

public class Q6 {
    public static int MyMethod(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }
    }
    public static void main(String[] args) {
        System.out.println(MyMethod(8,12));

    }
}
