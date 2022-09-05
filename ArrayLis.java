import java.util.ArrayList;
import java.util.Collections;

public class ArrayLis {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(8);
        arr.add(6);
        arr.add(5);
        Integer obj = Integer.valueOf(40);
        arr.add(obj);
        arr.add(2,78);
        arr.set(0,89);
        arr.remove(0);
        System.out.println(arr.size());
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(856);
        arr.addAll(arr1);

        Collections.sort(arr);
       // System.out.println(arr.get(15));
        //System.out.println(arr);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i));
            System.out.print(",");
        }
        for (Integer integer : arr) {
            // unboxing object to primitive
            int no = integer.intValue();
            System.out.println(no);
        }


    }
}

/*
Create a List & Set of 10 integers and demonstrate ordered and unordered collection as well as
duplicate allowed and not allowed. Demonstrate addAll() method also.
 */


//        import java.util.ArrayList;
//        import java.util.HashSet;
//        import java.util.Iterator;
//
//public class Solution1 {
//    public static void main(String[] args) {
//        //creating a ArrayList of 10 Integers
//        ArrayList<Integer> integers = new ArrayList<>();
//        // adding elements in ArrayList by using add(Element e) method
//        // by passing primitive value, which will be converted to object by autoboxing
//        integers.add(20);
//        //creating Integer object to represent primitive value 40 by using valueOf() method
//        //using boxing
//        Integer obj = Integer.valueOf(40);
//        //adding obj to list
//        integers.add(obj);
//
//        // likewise added 8 more elements in list
//        integers.add(60);
//        integers.add(70);
//        integers.add(50);
//        integers.add(30);
//        integers.add(250);
//        integers.add(3);
//        integers.add(2);
//        integers.add(10);
//        //printing the list
//        System.out.println("printing list");
//        System.out.println(integers);
//
//        // or us can use enhanced for loop
//        System.out.println("printing list using enhanced for loop");
//        for (Integer integer : integers) {
//            // unboxing object to primitive
//            int no = integer.intValue();
//            System.out.println(no);
//        }
        // or with ArrayList you can use normal for loop
//        System.out.println("printing list using  for loop");
//        for (int i = 0; i < integers.size(); i++) {
//            //if you forgot to un-box object to primitive compiler will auto un-box for you
//            // accessing each element by index using get()method
//            int no = integers.get(i);
//            System.out.println(no);
//
//        }
//    }

//        //creating HashSet to store integers, set is unordered and cannot contain duplicate
//        HashSet<Integer> integerHashSet = new HashSet<>();
//
//        //adding elements
//        integerHashSet.add(40);
//        integerHashSet.add(1000);
//        integerHashSet.add(350);
//        integerHashSet.add(150);
//        integerHashSet.add(1050);
//        integerHashSet.add(3500);
//        integerHashSet.add(1010);
//        integerHashSet.add(10010);
//        integerHashSet.add(3150);
//        integerHashSet.add(1001);
//
//        //printing the set
//        System.out.println("printing set");
//        System.out.println(integerHashSet);
//        //printing the set using enhanced for loop
//        System.out.println("printing list using enhanced for loop");
//        for (Integer integer : integerHashSet) {
//            System.out.println(integer);
//        }
//
//        // adding set to list by using addAll() method
//        integers.addAll(integerHashSet);
//        //printing the list
//        System.out.println("list with added set");
//        System.out.println(integers);
//
//        // adding list to set by using addAll() method this will discard duplicates
//
//        integerHashSet.addAll(integers);
//
//        //printing the set
//        System.out.println("set with added list");
//        System.out.println(integerHashSet);
//
//        //delete
//        Iterator<Integer> itr = integerHashSet.iterator();
//        System.out.println(itr.next().getClass());
//
//
//
//
//
//
//
//
//
//    }
//}















//import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.Scanner;
//
//public class Solution4 {
//    public static void main(String[] args) {
//        ArrayList<Student> studentList= new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 10; i++) {
//            Student s = new Student();
//            s.setName(sc.nextLine());
//            s.setRollNo(sc.nextInt());
//            s.setCpi(sc.nextDouble());
//            sc.nextLine();
//            studentList.add(s);
//        }
//        System.out.println("printing student list");
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//
//        Collections.sort(studentList);
//        System.out.println("sorted list");
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//
//        for (Student student : studentList){
//            if(student.getName().startsWith("A") || student.getName().startsWith("J")){
//                studentList.remove(student);
//            }
//        }
//        System.out.println("printing student list");
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//
//
//
//    }
//}



//import java.util.ArrayList;

//public class Solution5 {
//    public static void main(String[] args) {
//        //creating a ArrayList of 10 Integers
//        ArrayList<Integer> integers = new ArrayList<>();
//        // adding elements in ArrayList by using add(Element e) method
//        // by passing primitive value, which will be converted to object by autoboxing
//        integers.add(20);
//        //creating Integer object to represent primitive value 40 by using valueOf() method
//        //using boxing
//        Integer obj = Integer.valueOf(40);
//        //adding obj to list
//        integers.add(obj);
//
//        // likewise added 8 more elements in list
//        integers.add(60);
//        integers.add(70);
//        integers.add(50);
//        integers.add(30);
//        integers.add(250);
//        integers.add(3);
//        integers.add(2);
//        integers.add(10);
//        //printing the list
//        System.out.println("printing list");
//        System.out.println(integers);
//        int evenCount = 0;
//
//        for (Integer integer : integers) {
//            if(integer.intValue() % 2 ==0){
//                evenCount++;
//            }
//        }
//        int oddCount = integers.size()  - evenCount;
//        System.out.println("odd count =  " + oddCount);
//    }
//}