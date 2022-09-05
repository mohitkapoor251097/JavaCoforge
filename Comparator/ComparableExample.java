package Comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employee=new ArrayList<>();
        employee.add(new Employee(1081,"Mohit",45000.5,LocalDate.of(2017,11,24)));
        employee.add(new Employee(1004, "Chris", 7000.50, LocalDate.of(2017, 3, 19)));
        employee.add(new Employee(1015, "David", 13407800.00, LocalDate.of(2017, 9, 28)));
        employee.add(new Employee(1045, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        System.out.println("Employees (Before Sorting) : " + employee);


 //    Comparator<Employee> employeeNameComparator = new Comparator<Employee>()
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        };
//        Collections.sort(employee, employeeNameComparator);

      //  employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());




        //  Collections.sort(employee);
      //  System.out.println("Employees (After Sorting) : " + employee);

//        Collections.sort(employee,Comparator.comparing(Employee::getName));
//        System.out.println(employee);
//
//        Collections.sort(employee,Comparator.comparing(Employee::getSalary));
//        System.out.println(employee);
//
//        Collections.sort(employee,Comparator.comparing(Employee::getJoiningDate));
//        System.out.println(employee);


        // Sort employees by Name in descending order
        //Collections.sort(employee, Comparator.comparing(Employee::getName).reversed());
       // System.out.println("\nEmployees (Sorted by Name in descending order) : " + employee);


        // Chaining multiple Comparators
        // Sort by Salary. If Salary is same then sort by Name
       // Collections.sort(employee, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
       // System.out.println("\nEmployees (Sorted by Salary and Name) : " + employee);


        Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
               if(e1.getName().equals(e2.getName()))
                {
                    return (int) (e1.getSalary()-e2.getSalary());
                }
               else
               {
                   return e1.getName().compareTo((e2.getName()));
               }
            }
        };
        Collections.sort(employee, employeeNameComparator);
        System.out.println(employee);



    }
}
