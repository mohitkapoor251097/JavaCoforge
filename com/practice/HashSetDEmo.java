package com.practice;

import java.util.*;

//public class HashSetDEmo {
//    public static void main(String[] args) {
        // Creating a HashSet
//        Set<String> daysOfWeek = new HashSet<>();
//
//        // Adding new elements to the HashSet
//        daysOfWeek.add("Monday");
//        daysOfWeek.add("Tuesday");
//        daysOfWeek.add("Wednesday");
//        daysOfWeek.add("Thursday");
//        daysOfWeek.add("Friday");
//        daysOfWeek.add("Saturday");
//        daysOfWeek.add("Sunday");
//// Adding duplicate elements will be ignored
//        daysOfWeek.add("Monday");
//
//        System.out.println(daysOfWeek);



//        List<Integer> numbersDivisibleBy5 = new ArrayList<>();
//        numbersDivisibleBy5.add(5);
//        numbersDivisibleBy5.add(10);
//        numbersDivisibleBy5.add(15);
//        numbersDivisibleBy5.add(20);
//        numbersDivisibleBy5.add(25);
//
//        List<Integer> numbersDivisibleBy3 = new ArrayList<>();
//        numbersDivisibleBy3.add(3);
//        numbersDivisibleBy3.add(6);
//        numbersDivisibleBy3.add(9);
//        numbersDivisibleBy3.add(12);
//        numbersDivisibleBy3.add(15);
//
//        // Creating a HashSet from another collection (ArrayList)
//        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);
//
//        // Adding all the elements from an existing collection to a HashSet
//        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);
//
//        System.out.println(numbersDivisibleBy5Or3);


//        Set<String> programmingLanguages = new HashSet<>();
//        programmingLanguages.add("C");
//        programmingLanguages.add("C++");
//        programmingLanguages.add("Java");
//        programmingLanguages.add("Python");
//        programmingLanguages.add("PHP");
//        programmingLanguages.add("Ruby");
//
//        System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");
//        programmingLanguages.forEach(programmingLanguage -> {
//            System.out.println(programmingLanguage);
//        });
//        System.out.println("=== Iterate over a HashSet using iterator() ===");
//        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
//        while (programmingLanguageIterator.hasNext()) {
//            String programmingLanguage = programmingLanguageIterator.next();
//            System.out.println(programmingLanguage);
//        }
//        System.out.println("=== Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method ===");
//        programmingLanguageIterator = programmingLanguages.iterator();
//        programmingLanguageIterator.forEachRemaining(programmingLanguage -> {
//            System.out.println(programmingLanguage);
//        });
//
//        System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
//        for(String programmingLanguage: programmingLanguages) {
//            System.out.println(programmingLanguage);
//
//        }
//
//



        class Customer {
            private long id;
            private String name;

            public Customer(long id, String name) {
                this.id = id;
                this.name = name;
            }

            public long getId() {
                return id;
            }
            public void setId(long id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            // Two customers are equal if their IDs are equal
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Customer customer = (Customer) o;
                return id == customer.id;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }
            @Override
            public String toString() {
                return "Customer{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';   }}

public class HashSetDEmo {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(101, "Rajeev"));
        customers.add(new Customer(102, "Sachin"));
        customers.add(new Customer(103, "Chris"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations
          of the Customer class to check for duplicates and ignore them
        */
        customers.add(new Customer(101, "Rajeev"));

        System.out.println(customers);





    }
}






