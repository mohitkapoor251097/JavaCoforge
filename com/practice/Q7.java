package com.practice;

public class Q7 {
    private static String printMore(String myStr, int i) {

        temp += myStr;
        index++;
        if (index < i){

            printMore(myStr, i);
        }
        return temp;
    }
    static int index = 0;
    static String temp = "";
    public static void main(String[] args) {
        System.out.println(printMore("1_", 10));
    }
}
