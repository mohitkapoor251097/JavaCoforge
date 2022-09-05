package com.practice;

public class Q2 {
    public static String UsingLibrary(String name){
        StringBuilder newName = new StringBuilder(name);
        return newName.reverse().toString();
    }
    public static String Manually(String name){

        char dos[] = new char[name.length()];
        for (int i = 1; i <= name.length(); i++){
            if (i > name.length()){
                break;
            } else {
                dos[i-1] = name.charAt(name.length()-i);
            }
        }
        return new String(dos) + "";
    }
    public static void main(String[] args) {
        String name="Hello Welcome to java World!!";
        System.out.println(UsingLibrary(name));
        System.out.println(Manually(name));
        StringBuilder newName = new StringBuilder(name);
        //newName.reverse();
        System.out.println(newName);
        newName.setCharAt(0,'P');
        System.out.println(newName);
        newName.insert(0,"T");
        System.out.println(newName);
        newName.delete(2,3); //3 not including
        System.out.println(newName);
        newName.append("py");
        System.out.println(newName);

    }
}
