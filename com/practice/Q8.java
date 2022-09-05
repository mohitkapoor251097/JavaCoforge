package com.practice;

public class Q8 {
    public static void main(String[] args) {
        String str = "THIS IS A DEMO";
        int vowelsCount = 0;
        for(char c : str.toCharArray()) {
           c = Character.toLowerCase(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        System.out.println("String "+str+" has "+ vowelsCount + " vowels.");
    }

}
