package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class CollectionDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(78);
//        arr.add(89);
//        for (int i = 0; i < arr.size(); i++)
//        {
//            System.out.println(arr.get(i));
//


//        ArrayList<String> data=new ArrayList<>();
//        data.add("jatin");
//        data.add("sham");
//        data.add("vicky");
//        data.add("jatin");
//        data.add(1,"OM");
//
//        data.set(0,"raju");
//        System.out.println(data.get(0));
//        System.out.println(data);
//        data.remove(3);
//        System.out.println(data.size());
//        System.out.println(data);
//        data.add(2,"kuku");
//        System.out.println(data);
//        data.add("raju");
//        data.add(null);
//        data.add(null);
//        System.out.println(data);
//
//        int x=3456789;
//        Integer i=x; //boxing
//        System.out.println(i);
//        int y=i.intValue(); //unboxing
//        System.out.println(y);
//
//        String no="945678";
//        System.out.println(Integer.parseInt(no)+1);



//        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
//        firstFivePrimeNumbers.add(2);
//        firstFivePrimeNumbers.add(3);
//        firstFivePrimeNumbers.add(5);
//        firstFivePrimeNumbers.add(7);
//        firstFivePrimeNumbers.add(11);
//        // Creating an ArrayList from another collection
//        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
//        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
//        nextFivePrimeNumbers.add(13);
//        nextFivePrimeNumbers.add(17);
//        nextFivePrimeNumbers.add(19);
//        nextFivePrimeNumbers.add(23);
//        nextFivePrimeNumbers.add(29);    // Adding an entire collection to an ArrayList
//         firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
//         System.out.println(firstTenPrimeNumbers);



//        List<String> topCompanies = new ArrayList<>();
//        // Check if an ArrayList is empty
//        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
//        topCompanies.add("Google");
//        topCompanies.add("Apple");
//        topCompanies.add("Microsoft");
//        topCompanies.add("Amazon");
//        topCompanies.add("Facebook");
//        // Find the size of an ArrayList
//        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
//        System.out.println(topCompanies);
//        // Retrieve the element at a given index
//        String bestCompany = topCompanies.get(0);
//        String secondBestCompany = topCompanies.get(1);
//        String lastCompany = topCompanies.get(topCompanies.size() - 1);
//        System.out.println("Best Company: " + bestCompany);
//        System.out.println("Second Best Company: " + secondBestCompany);
//        System.out.println("Last Company in the list: " + lastCompany);
//        // Modify the element at a given index
//        topCompanies.set(4, "Walmart");
//        System.out.println("Modified top companies list: " + topCompanies);

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println("Initial List: " + programmingLanguages);
        // Remove the element at index `5`
        System.out.println("After remove(5): " + programmingLanguages);
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
     System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);
//
//        // Remove all the elements that satisfy the given predicate
//        programmingLanguages.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("C");
//            }
//
//
//        }







        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \" Maria \"? : " + names.contains("Maria"));
// Find the index of the first occurrence of an element in an ArrayList
                System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));

    }
}
